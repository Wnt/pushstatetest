package org.vaadin.pushstatetest;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

public class FirstView extends Composite implements View {
	public FirstView() {
		setCompositionRoot(new Label("Hello world"));
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		Page.getCurrent().pushState("http://localhost:8080/first-view/parameter");
	}

}
