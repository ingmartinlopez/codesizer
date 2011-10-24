package com.devgear.codesizer.core.view;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.core.util.BaseApplication;
import com.devgear.codesizer.core.util.VaadinApplicationObjectSupport;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

@Component(value = "mainApplication")
@Scope(value = "prototype")
public class MainApplication extends BaseApplication implements ClickListener {

	private static final long serialVersionUID = 1L;
	private final static Log logger = LogFactory.getLog(MainApplication.class);

	@Autowired
	private transient VaadinApplicationObjectSupport app;

	private enum Buttons {
		LOGOUT, LANGUAGE;
	}

	public void init() {
		if(logger.isDebugEnabled()) {
			logger.debug("init, locale: " + getLocale());
		}
		MainLayout m = new MainLayout();
		VerticalLayout layout = new VerticalLayout();
		Window mainWindow = new Window(app.getMessage("application.name"), layout);
		mainWindow.addComponent(m);
		setMainWindow(mainWindow);
		if(logger.isDebugEnabled()) {
			logger.debug("initialization done");
		}
	}


	@Override
	public void terminalError(com.vaadin.terminal.Terminal.ErrorEvent event) {
		logger.error(event.getThrowable().getMessage(), event.getThrowable());
		if(event.getThrowable().getCause() instanceof AccessDeniedException) {
			getMainWindow().showNotification(app.getMessage("accessdenied"), Notification.TYPE_ERROR_MESSAGE);
		}
	}


	public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
		// TODO Auto-generated method stub
		
	}


}
