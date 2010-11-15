package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;

public class CloudWB implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private Label lastUpdatedLabel = new Label();

	// Create a tab panel
	private DecoratedTabPanel tabPanel = new DecoratedTabPanel();

	public void onModuleLoad() {

		// Assemble Main panel.
		mainPanel.add(stocksFlexTable);
		mainPanel.add(addPanel);
		mainPanel.add(lastUpdatedLabel);

		// Instância de CriadorTab
		CriadorTab montadorTab = new CriadorTab(tabPanel, addPanel);
		
		// Associate the Main panel with the HTML host page.
		RootPanel.get("form").add(mainPanel);

		// Set the width to 600 pixels
		tabPanel.setWidth("800px");

		// Add TabPrincipal
		tabPanel.add(montadorTab.criaTabPrincipal(), "Dados Principais");

		// Add TabModulo
		tabPanel.add(montadorTab.criaTabModulo(), "Modulos");

		// Add TabLayout
		tabPanel.add(montadorTab.criaTabLayout(), "Layout");

		// Add TabFinal
		tabPanel.add(montadorTab.criaTabFinal(), "Final");

		// Atribui visibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
	}
}
