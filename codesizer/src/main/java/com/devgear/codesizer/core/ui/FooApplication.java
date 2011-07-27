package com.devgear.codesizer.core.ui;

import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.core.model.Foo;
import com.devgear.codesizer.core.util.ApplicationHelper;
import com.devgear.codesizer.core.util.BaseApplication;
import com.devgear.codesizer.core.util.VaadinApplicationObjectSupport;
import com.devgear.codesizer.core.view.MainLayout;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Form;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

@Component(value = "mainApplication")
@Scope(value = "prototype")
public class FooApplication extends BaseApplication implements ClickListener, FooClickListener, FooModelListener {

	private static final long serialVersionUID = 1L;
	private final static Log logger = LogFactory.getLog(FooApplication.class);

	private FooForm form;
	private FooTable table;
	@Autowired
	private transient VaadinApplicationObjectSupport app;

	private enum Buttons {
		LOGOUT, LANGUAGE;
	}

	public void init() {
		if(logger.isDebugEnabled()) {
			logger.debug("init, locale: " + getLocale());
		}
		VerticalLayout layout = new VerticalLayout();
		Window mainWindow = new Window(app.getMessage("application.name"), layout);
//		Button logout = new Button(app.getMessage("button.logout"));
//		logout.setStyleName(Button.STYLE_LINK);
//		logout.addListener(this);
//		logout.setData(Buttons.LOGOUT);
//		mainWindow.addComponent(logout);
//		//try application helper, same as app.getMessage()
//		Button language = new Button(ApplicationHelper.getMessage("button.changelanguage"));
//		language.setStyleName(Button.STYLE_LINK);
//		language.addListener(this);
//		language.setData(Buttons.LANGUAGE);
//		mainWindow.addComponent(language);
//		mainWindow.addComponent(createForm());
//		mainWindow.addComponent(createTable());
		mainWindow.addComponent(new MainLayout());
		setMainWindow(mainWindow);
		if(logger.isDebugEnabled()) {
			logger.debug("initialization done");
		}
	}

	private Table createTable() {
		table = (FooTable) ApplicationHelper.getApplicationContext().getBean("fooTable");
		table.init();
		table.addFooClickListener(this);
		return table;
	}

	private Form createForm() {
		form = (FooForm) ApplicationHelper.getApplicationContext().getBean("fooForm");
		form.init();
		form.addFooModelListener(this);
		return form;
	}

	@Override
	public void terminalError(com.vaadin.terminal.Terminal.ErrorEvent event) {
		logger.error(event.getThrowable().getMessage(), event.getThrowable());
		if(event.getThrowable().getCause() instanceof AccessDeniedException) {
			getMainWindow().showNotification(app.getMessage("accessdenied"), Notification.TYPE_ERROR_MESSAGE);
		}
	}

	public void buttonClick(ClickEvent event) {
		if(logger.isDebugEnabled()) {
			logger.debug("buttonClick(" + event.getButton().getData() + ")");
		}
		if(event.getButton().getData() == Buttons.LOGOUT) {
			String context = getURL().getPath();
			context = context.substring(0, context.lastIndexOf("/app"));
			getMainWindow().open(new ExternalResource(context + "/j_spring_security_logout"));
		} else if(event.getButton().getData() == Buttons.LANGUAGE) {
			setLocale((Locale.US.equals(getLocale())) ? new Locale("es", "AR") : Locale.US);
			close();
		}
	}

	public void fooClicked(Foo model) {
		form.update(model);
	}


	public void fooAdded(Foo model) {
		table.refresh();
	}


	public void fooUpdated(Foo model) {
		table.refresh();
	}
}
