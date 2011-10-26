package com.devgear.codesizer.template.view;

import java.util.Arrays;

import com.devgear.codesizer.core.view.forms.BuildableBeanItem;
import com.devgear.codesizer.model.TemplateActivity;

public class TemplateActivityForm extends BuildableBeanItem<TemplateActivity> {

	private static final long serialVersionUID = -7697639101155277546L;
	private static final String NAME = "name";

	public static final String[] visibleFields = new String[] { NAME };

	public TemplateActivityForm(TemplateActivity object) {
		super(object, visibleFields);
	}

	@Override
	protected void initializeItemProps() {

		setVisibleItemProperties(Arrays.asList(visibleFields));
		setAdvancedLayout(createGridLayout(1, 1));

		getItemProperty(NAME).setDisplayName("Activity Name").setRequired(true)
				.setPosition(0, 0);

	}

}
