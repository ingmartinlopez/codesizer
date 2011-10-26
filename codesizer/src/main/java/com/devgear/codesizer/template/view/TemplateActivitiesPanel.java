/**
 * 
 */
package com.devgear.codesizer.template.view;

import com.devgear.codesizer.core.view.forms.BeanItemForm;
import com.devgear.codesizer.core.view.forms.BuildableBeanItem;
import com.devgear.codesizer.model.TemplateActivity;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Form;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * @author mlopez
 *
 */
public class TemplateActivitiesPanel extends Panel {
	
	public TemplateActivitiesPanel() {
		
		// obtengo el dato que quiero editar, por ahora un objeto vacío
		TemplateActivity ta = new TemplateActivity();
		ta.setName("default");
		
		
		VerticalLayout vertical = new VerticalLayout ();
		vertical.setMargin(true);
		
		TemplateActivityForm taa = new TemplateActivityForm(ta);
		Form form = new BeanItemForm<BuildableBeanItem<TemplateActivity>>();
		form.setCaption("Templates Activities Form");
		form.setDescription("This form is used to create activities that will be used later as a template for projects");
		form.setData(taa);
		
		vertical.addComponent(form);
		
		setContent(vertical);		
		
	}

}
