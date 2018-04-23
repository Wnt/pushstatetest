package org.vaadin.pushstatetest;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.PushStateNavigation;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@PushStateNavigation
public class PushUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		Navigator n = new Navigator(this, this);
		n.addView("first-view", FirstView.class);
	}

	@WebServlet(urlPatterns = "/*", name = "PushUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = PushUI.class, productionMode = false)
	public static class PushUIServlet extends VaadinServlet {
	}
}
