/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.devgear.codesizer;

import com.vaadin.Application;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinApplication extends Application {

	@Override
	public void init() {
		
		Window w = new Window();
		addWindow(w);
		
//		LoginForm login = new LoginForm();
//		login.setWidth("100%");
//		login.setHeight("300px");
//		login.addListener(new LoginForm.LoginListener() {
//			public void onLogin(LoginEvent event) {
//				getWindows().iterator().next().showNotification(
//						"New Login",
//						"Username: " + event.getLoginParameter("username")
//								+ ", password: "
//								+ event.getLoginParameter("password"));
//			}
//		});
//		w.addComponent(login);
		
		Main m = new Main();
		w.getLayout().setHeight("500px");
		w.addComponent(m);

	}

}
