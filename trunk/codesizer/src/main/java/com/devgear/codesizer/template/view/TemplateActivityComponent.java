/**
 * 
 */
package com.devgear.codesizer.template.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.core.service.IUserService;
import com.devgear.codesizer.core.view.forms.BuildableBeanItem;
import com.devgear.codesizer.core.view.forms.SearchForm;
import com.devgear.codesizer.model.TemplateActivity;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

/**
 * @author mlopez
 *
 */
@Component("TemplateActivityComponent")
@Scope("prototype")
public class TemplateActivityComponent extends CustomComponent {
	
	private IUserService userService;
	
	TemplateActivity ta;
	
	public TemplateActivityComponent() {
		
		// obtengo el dato que quiero editar, por ahora un objeto vacío
		ta = new TemplateActivity();
		ta.setName("default");
		
		
		VerticalLayout vertical = new VerticalLayout ();
		vertical.setMargin(true);
		
		TemplateActivityForm taa = new TemplateActivityForm(ta);
		SearchForm<BuildableBeanItem<TemplateActivity>> form = new SearchForm<BuildableBeanItem<TemplateActivity>>() {
			@Override
			public void newEntityClicked() {
				System.out.println("click in new entity button");
			}
			@Override
			public void searchClicked() {
				if (isValid())
					System.out.println("click in search button: " + userService.findAll());
			}};
		form.setCaption("Templates Activities Form");
		form.setDescription("This form is used to create activities that will be used later as a template for projects");
		form.setData(taa);
				
				
		vertical.addComponent(form);
		
		setCompositionRoot(vertical);
		
	}

	@Autowired
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
