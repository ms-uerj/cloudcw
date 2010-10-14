package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;

public class CloudWB implements EntryPoint {

	// instância de PaginaCliente
	private PaginaCliente pagCliente = new PaginaCliente();

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private Label lastUpdatedLabel = new Label();

	private Button guardaDadosPrincButton  = new Button("Guardar");
	private Button limpaDadosPrincButton  = new Button("Limpar");
	private Button uploadBannerButton  = new Button("Upload");
	private Button guardaModulosButton  = new Button("Guardar");
	private Button limpaModulosButton  = new Button("Limpar");
	private Button guardaLayoutButton  = new Button("Guardar");
	private Button visualizaPaginaButton  = new Button("Visualizar");
	private Button criaPaginaButton  = new Button("Criar");

	private TextBox caixaNomeSite = new TextBox();
	private TextBox caixaTituloSite = new TextBox();
	private TextBox caixaBannerSite = new TextBox();

	private CheckBox checkOpc1 = new CheckBox();
	private CheckBox checkOpc2 = new CheckBox();
	private CheckBox checkOpc3 = new CheckBox();
	private CheckBox checkOpc4 = new CheckBox();

	private RadioButton radioOpc1 = new RadioButton("opcao");
	private RadioButton radioOpc2 = new RadioButton("opcao");
	private RadioButton radioOpc3 = new RadioButton("opcao");
	private RadioButton radioOpc4 = new RadioButton("opcao");

	// Create a tab panel
	private DecoratedTabPanel tabPanel = new DecoratedTabPanel();

	public void onModuleLoad() {

		// Assemble Main panel.
		mainPanel.add(stocksFlexTable);
		mainPanel.add(addPanel);
		mainPanel.add(lastUpdatedLabel);

		caixaNomeSite.setValue("");
		caixaTituloSite.setValue("");
		caixaBannerSite.setValue("");

		// Associate the Main panel with the HTML host page.
		RootPanel.get("form").add(mainPanel);

		// Set the width to 600 pixels
		tabPanel.setWidth("800px");
		
		guardaDadosPrincButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event){
				pagCliente.setNomeSite(caixaNomeSite.getValue());
				pagCliente.setTituloSite(caixaTituloSite.getValue());
				pagCliente.setBannerSite(caixaBannerSite.getValue());
				tabPanel.selectTab(1);				
			} 
		});
		
		limpaDadosPrincButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				caixaNomeSite.setValue("");
				pagCliente.setNomeSite("");
				caixaTituloSite.setValue("");
				pagCliente.setTituloSite("");
				caixaBannerSite.setValue("");
				pagCliente.setBannerSite("");	
			}
		});
		
		uploadBannerButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				Window.alert("Buscando Banner");
			}
		});
		
		guardaModulosButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				int verificadorModulo = 0;
				if (checkOpc1.getValue() == true) {
					pagCliente.setGraduacao(1);
					verificadorModulo = 1;
				}
				if (checkOpc2.getValue() == true) {
					pagCliente.setPosGraduacao(1);
					verificadorModulo = 1;
				}
				if (checkOpc3.getValue() == true) {
					pagCliente.setMestrado(1);
					verificadorModulo = 1;
				}
				if (checkOpc4.getValue() == true) {
					pagCliente.setDoutorado(1);
					verificadorModulo = 1;
				}

				if (verificadorModulo == 0) {
					Window.alert("Escolha os Modulos!");
				} else {
					tabPanel.selectTab(2);
				}
			}
		});

		limpaModulosButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				checkOpc1.setValue(false);
				checkOpc2.setValue(false);
				checkOpc3.setValue(false);
				checkOpc4.setValue(false);
				
				pagCliente.setGraduacao(0);
				pagCliente.setPosGraduacao(0);
				pagCliente.setMestrado(0);
				pagCliente.setDoutorado(0);
			}
		});
			

		guardaLayoutButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				if (radioOpc1.getValue() == true) {
					pagCliente.setLayoutSite(1);
					tabPanel.selectTab(3);
				} else if (radioOpc2.getValue() == true) {
					pagCliente.setLayoutSite(2);
					tabPanel.selectTab(3);
				} else if (radioOpc3.getValue() == true) {
					pagCliente.setLayoutSite(3);
					tabPanel.selectTab(3);
				} else if (radioOpc4.getValue() == true) {
					pagCliente.setLayoutSite(4);
					tabPanel.selectTab(3);
				} else
					Window.alert("Escolha um Layout!");
			}
		});

		visualizaPaginaButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				String dados = new String("Nome do Site: "
											+ pagCliente.getNomeSite() + "\nTitulo da Pagina: "
											+ pagCliente.getTituloSite() + "\nBanner: "
											+ pagCliente.getBannerSite() + "\nGraduacao: "
											+ ((pagCliente.getGraduacao() == 1) ? "Sim" : "Nao")
											+ "\nPos-Graduacao: "
											+ ((pagCliente.getPosGraduacao() == 1) ? "Sim" : "Nao")
											+ "\nMestrado: "
											+ ((pagCliente.getMestrado() == 1) ? "Sim" : "Nao")
											+ "\nDoutorado: "
											+ ((pagCliente.getDoutorado() == 1) ? "Sim" : "Nao")
											+ "\nLayout num: " + pagCliente.getLayoutSite());
				Window.alert(dados);
			}
		});

		criaPaginaButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){ 
				Window.alert("Criando Pagina!");
			}
		});

		// Montagem da Tab principal (Montando o quebra-cabeças)
		VerticalPanel VPanelPrincDados = new VerticalPanel();
		HorizontalPanel HPanelNomeSite = new HorizontalPanel();
		HorizontalPanel HPanelTituloSite = new HorizontalPanel();
		HorizontalPanel HPanelBannerSite = new HorizontalPanel();
		HorizontalPanel HPanelBottPrinc = new HorizontalPanel();

		HTML HTMLChamadaPrinc = new HTML("Informacoes gerais sobre o site<br>");
		HTML HTMLNomeSite = new HTML("<P>Nome do Site:");
		HTML HTMLTituloSite = new HTML("<P>Titulo: ");
		HTML HTMLBannerSite = new HTML("<P>Banner: ");

		HPanelNomeSite.add(HTMLNomeSite);
		HPanelNomeSite.add(caixaNomeSite);

		HPanelTituloSite.add(HTMLTituloSite);
		HPanelTituloSite.add(caixaTituloSite);

		HPanelBannerSite.add(HTMLBannerSite);
		HPanelBannerSite.add(caixaBannerSite);
		HPanelBannerSite.add(uploadBannerButton);

		HPanelBottPrinc.add(guardaDadosPrincButton);
		HPanelBottPrinc.add(limpaDadosPrincButton);

		VPanelPrincDados.add(HTMLChamadaPrinc);
		VPanelPrincDados.add(HPanelNomeSite);
		VPanelPrincDados.add(HPanelTituloSite);
		VPanelPrincDados.add(HPanelBannerSite);
		VPanelPrincDados.add(HPanelBottPrinc);

		tabPanel.add(VPanelPrincDados, "Dados Principais");

		// Adiciona Tab Módulo
		VerticalPanel VPanelModulo = new VerticalPanel();

		HorizontalPanel HPanelGraduacao = new HorizontalPanel();
		HorizontalPanel HPanelPosGraduacao = new HorizontalPanel();
		HorizontalPanel HPanelMestrado = new HorizontalPanel();
		HorizontalPanel HPanelDoutorado = new HorizontalPanel();
		HorizontalPanel HPanelButtMod = new HorizontalPanel();

		HTML HTMLChamadaMod = new HTML("Formulario para a escolha dos modulos");
		HTML HTMLChamadaOpcao = new HTML("<P>Opcoes de modulos:</P>");
		HTML HTMLGraduacao = new HTML("Graduacao");
		HTML HTMLPosGraduacao = new HTML("Pos-graduacao");
		HTML HTMLMestrado = new HTML("Mestrado");
		HTML HTMLDoutorado = new HTML("Doutorado");

		HPanelGraduacao.add(checkOpc1);
		HPanelGraduacao.add(HTMLGraduacao);

		HPanelPosGraduacao.add(checkOpc2);
		HPanelPosGraduacao.add(HTMLPosGraduacao);

		HPanelMestrado.add(checkOpc3);
		HPanelMestrado.add(HTMLMestrado);

		HPanelDoutorado.add(checkOpc4);
		HPanelDoutorado.add(HTMLDoutorado);

		HPanelButtMod.add(guardaModulosButton);
		HPanelButtMod.add(limpaModulosButton);

		VPanelModulo.add(HTMLChamadaMod);
		VPanelModulo.add(HTMLChamadaOpcao);
		VPanelModulo.add(HPanelGraduacao);
		VPanelModulo.add(HPanelPosGraduacao);
		VPanelModulo.add(HPanelMestrado);
		VPanelModulo.add(HPanelDoutorado);
		VPanelModulo.add(HPanelButtMod);

		tabPanel.add(VPanelModulo, "Modulos");

		// Adiciona Tab Layout
		VerticalPanel VPanelLayout = new VerticalPanel();

		HorizontalPanel HPanelOpcao1 = new HorizontalPanel();
		HorizontalPanel HPanelOpcao2 = new HorizontalPanel();
		HorizontalPanel HPanelOpcao3 = new HorizontalPanel();
		HorizontalPanel HPanelOpcao4 = new HorizontalPanel();
		HorizontalPanel HPanelButtLay = new HorizontalPanel();

		HTML HTMLChamadaLayout = new HTML("Escolha o Layout das paginas:<br>");
		HTML HTMLChamadaOpcLay = new HTML("<P>Opcoes de layout:</P>");
		HTML HTMLImagemOp1 = new HTML("<IMG SRC='images/estrutura1.gif'> </P>");
		HTML HTMLImagemOp2 = new HTML("<IMG SRC='images/estrutura2.gif'> </P>");
		HTML HTMLImagemOp3 = new HTML("<IMG SRC='images/estrutura3.gif'> </P>");
		HTML HTMLImagemOp4 = new HTML("<IMG SRC='images/estrutura4.gif'> </P>");

		HPanelOpcao1.add(radioOpc1);
		HPanelOpcao1.add(HTMLImagemOp1);

		HPanelOpcao2.add(radioOpc2);
		HPanelOpcao2.add(HTMLImagemOp2);

		HPanelOpcao3.add(radioOpc3);
		HPanelOpcao3.add(HTMLImagemOp3);

		HPanelOpcao4.add(radioOpc4);
		HPanelOpcao4.add(HTMLImagemOp4);

		HPanelButtLay.add(guardaLayoutButton);

		VPanelLayout.add(HTMLChamadaLayout);
		VPanelLayout.add(HTMLChamadaOpcLay);
		VPanelLayout.add(HPanelOpcao1);
		VPanelLayout.add(HPanelOpcao2);
		VPanelLayout.add(HPanelOpcao3);
		VPanelLayout.add(HPanelOpcao4);
		VPanelLayout.add(HPanelButtLay);

		tabPanel.add(VPanelLayout, "Layout");

		// Adiciona Tab Final
		VerticalPanel VPanelVisual = new VerticalPanel();

		HorizontalPanel HPanelChamadaVisu = new HorizontalPanel();
		HorizontalPanel HPanelButtVisu = new HorizontalPanel();

		HTML HTMLChamadaVisu = new HTML("<P>Finalizando o projeto:</P>");

		HPanelChamadaVisu.add(HTMLChamadaVisu);
		HPanelButtVisu.add(visualizaPaginaButton);
		HPanelButtVisu.add(criaPaginaButton);

		VPanelVisual.add(HPanelChamadaVisu);
		VPanelVisual.add(HPanelButtVisu);

		tabPanel.add(VPanelVisual, "Visualizar");

		// Atribui visibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
	}
}
