package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.layout.VLayout;

public class CloudWB implements EntryPoint {

	public void onModuleLoad() {

		CriadorTab criadorTab = new CriadorTab();
		VLayout tabPrincipal = criadorTab.criaTabForm();
		RootPanel.get("form").add(tabPrincipal);
		
	}
}
