/**
 * 
 */
package com.devgear.codesizer.template.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.devgear.codesizer.core.view.forms.BuildableBeanItem;
import com.devgear.codesizer.core.view.forms.SearchForm;
import com.devgear.codesizer.model.TemplateActivity;
import com.devgear.codesizer.template.service.ITemplateActivityService;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

/**
 * @author mlopez
 *
 */
@Component("TemplateActivityComponent")
@Scope("prototype")
public class TemplateActivityComponent extends CustomComponent {
	
	ITemplateActivityService templateActivityService;

	TemplateActivity ta;
	
	public TemplateActivityComponent() {
		
		// obtengo el dato que quiero editar, por ahora un objeto vacío
		ta = new TemplateActivity();
		ta.setName("default");
				
		VerticalLayout vertical = new VerticalLayout ();
		vertical.setHeight("100%");
		vertical.setMargin(false);

		final BeanContainer<Integer,TemplateActivity> bc = new BeanContainer<Integer,TemplateActivity>(TemplateActivity.class);
		bc.setBeanIdProperty("idActivity");
		
		TemplateActivityForm taa = new TemplateActivityForm(ta);
		SearchForm<BuildableBeanItem<TemplateActivity>> form = new SearchForm<BuildableBeanItem<TemplateActivity>>() {
			@Override
			public void newEntityClicked() {
				System.out.println("click in new entity button");
			}
			@Override
			public void searchClicked() {
				if (isValid())
				{
					List<TemplateActivity> ta = templateActivityService.findAll();
					bc.addAll(ta);
				}
			}};
		form.setCaption("Template Activity Search Filters");
		form.setDescription("Enter some filter values to search Templates Activities");
		form.setData(taa);
				
				
		vertical.addComponent(form);
		
		Table t = new Table("Search Results", bc);
		t.setWidth("100%");
		t.setHeight("100%");
		
		t.setVisibleColumns(new String[] {"name"});
		t.setColumnHeaders(new String[] {"Nombre"});
		
		vertical.addComponent(t);
		
		setCompositionRoot(vertical);
		
	}

	@Autowired
	public void setTemplateActivityService(ITemplateActivityService templateActivityService) {
		this.templateActivityService = templateActivityService;
	}
	
}
