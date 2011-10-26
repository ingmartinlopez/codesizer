/**
 * 
 */
package com.devgear.codesizer.core.view.forms;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

/**
 * @author mlopez
 * 
 */
public abstract class SearchForm<T extends BuildableBeanItem<?>> extends BeanItemForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button searchButton;


	private Button cancelEditButton;
	private Button newEntityButton;

	@Override
	protected void buildButtonBar() {

		searchButton = new Button("Search", this, "commit");
		cancelEditButton = new Button("Cancel Edit", this, "discard");
		newEntityButton = new Button("New");

		searchButton.addListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				searchClicked();
			}});
		
		newEntityButton.addListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				newEntityClicked();
			}});
		
		HorizontalLayout superbar = new HorizontalLayout();
		HorizontalLayout okbar = new HorizontalLayout();
		superbar.addComponent(okbar);
		superbar.setComponentAlignment(okbar, Alignment.MIDDLE_RIGHT);
		okbar.setHeight("25px");
		okbar.setSpacing(true);
		getFooter().addComponent(superbar);
		superbar.setWidth("100%");
		okbar.setWidth("260px");
		getFooter().setWidth("100%");

		okbar.addComponent(searchButton);
		okbar.addComponent(cancelEditButton);
		okbar.addComponent(newEntityButton);
		okbar.setComponentAlignment(searchButton, Alignment.MIDDLE_RIGHT);
		okbar.setComponentAlignment(cancelEditButton, Alignment.MIDDLE_RIGHT);
		okbar.setComponentAlignment(newEntityButton, Alignment.MIDDLE_RIGHT);

	}

	public abstract void newEntityClicked();

	public abstract void searchClicked();
	
	public Button getSearchButton() {
		return searchButton;
	}

	public Button getCancelEditButton() {
		return cancelEditButton;
	}

	public Button getNewEntityButton() {
		return newEntityButton;
	}

	
}
