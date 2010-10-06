package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
//import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

@SuppressWarnings("deprecation")
public class CloudWB implements EntryPoint{

	//instância de PaginaCliente
	private PaginaCliente pagCliente = new PaginaCliente();
	
	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private Label lastUpdatedLabel = new Label();
	
	private Button uploadBanner;
	private Button guardaDadosPrinc;
	private Button limpaDadosPrinc;
	private TextBox caixaNomeSite = new TextBox();
	private TextBox caixaTituloSite = new TextBox();
	private TextBox caixaBannerSite = new TextBox();
	
	private Button guardaModulos;
	private Button limpaModulos;
	private CheckBox checkOpc1 = new CheckBox();
	private CheckBox checkOpc2 = new CheckBox();
	private CheckBox checkOpc3 = new CheckBox();
	private CheckBox checkOpc4 = new CheckBox();
	
	private Button guardaLayout = new Button("Guardar");
	private RadioButton radioOpc1 = new RadioButton("opcao");
	private RadioButton radioOpc2 = new RadioButton("opcao");
	private RadioButton radioOpc3 = new RadioButton("opcao");
	private RadioButton radioOpc4 = new RadioButton("opcao");
	
	private Button visualizaPagina;
	private Button criaPagina = new Button("Criar");
	
	public void onModuleLoad() {
		
		limpaDadosPrinc = new Button("Limpar", new ClickListener() {
		  public void onClick(Widget sender) {
			  caixaNomeSite.setValue(" ");
			  pagCliente.setNomeSite("");
			  caixaTituloSite.setValue(" ");
			  pagCliente.setTituloSite("");
			  caixaBannerSite.setValue(" ");
			  pagCliente.setBannerSite("");
		  }});
		
		guardaDadosPrinc = new Button("Guardar", new ClickListener() {
	      public void onClick(Widget sender) {
			pagCliente.setNomeSite(caixaNomeSite.getValue());
			pagCliente.setTituloSite(caixaTituloSite.getValue());
			pagCliente.setBannerSite(caixaBannerSite.getValue());     
	      }
	    });
		
		uploadBanner = new Button("Upload", new ClickListener() {
		  public void onClick(Widget sender) {
		    Window.alert("Buscando Banner");
		  }
		});
		
		guardaModulos = new Button("Guardar", new ClickListener() {
	      public void onClick(Widget sender) {
	    	if (checkOpc1.getValue() == true){
			  pagCliente.setModuloSite(1, 1);
	    	}
	    	if (checkOpc2.getValue() == true){
			  pagCliente.setModuloSite(2, 1);
		    }
	    	if (checkOpc3.getValue() == true){
			  pagCliente.setModuloSite(3, 1);
			}
	    	if (checkOpc4.getValue() == true){
			  pagCliente.setModuloSite(4, 1);
			}
		  }
	    });
		
		limpaModulos = new Button("Limpar", new ClickListener() {
		  public void onClick(Widget sender) {
			checkOpc1.setValue(false);
			checkOpc2.setValue(false);
			checkOpc3.setValue(false);
			checkOpc4.setValue(false);
		  }
	    });
		
		visualizaPagina = new Button("Visualizar", new ClickListener() {
	      public void onClick(Widget sender) {
			String dados = new String("Nome do Site: " +
					pagCliente.getNomeSite() +
					"\nTitulo da Pagina: " +
					pagCliente.getTituloSite()+
					"\nBanner: "+
					pagCliente.getBannerSite());
	    	Window.alert(dados);
		}});
		
		//uploadBanner.addClickHandler(this);
		//guardaDadosPrinc.addClickHandler(this);
		//limpaDadosPrinc.addClickHandler(this);
		
		// Assemble Main panel.
		mainPanel.add(stocksFlexTable);
		mainPanel.add(addPanel);
		mainPanel.add(lastUpdatedLabel);
		
		
		
		// Associate the Main panel with the HTML host page.
		RootPanel.get("form").add(mainPanel);

		// Create a tab panel
		TabPanel tabPanel = new TabPanel();
		//initWidget(tabPanel);
		
		// Set the width to 600 pixels
		tabPanel.setWidth("800px");
		
		// Montagem da Tab principal (Montando o quebra-cabeças)
		VerticalPanel VPanelPrincDados = new VerticalPanel();
		
		HorizontalPanel HPanelNomeSite = new HorizontalPanel();
		HorizontalPanel HPanelTituloSite = new HorizontalPanel();
		HorizontalPanel HPanelBannerSite = new HorizontalPanel();
		HorizontalPanel HPanelBottPrinc = new HorizontalPanel();
		
		HTML HTMLChamadaPrinc = new HTML("Informacoes gerais sobre o site<br>");
		HTML HTMLNomeSite = new HTML ("<P>Nome do Site:");
		HTML HTMLTituloSite = new HTML ("<P>Titulo: ");
		HTML HTMLBannerSite = new HTML ("<P>Banner: ");

		HPanelNomeSite.add(HTMLNomeSite);
		HPanelNomeSite.add(caixaNomeSite);
		
		HPanelTituloSite.add(HTMLTituloSite);
		HPanelTituloSite.add(caixaTituloSite);
		
		HPanelBannerSite.add(HTMLBannerSite);
		HPanelBannerSite.add(caixaBannerSite);
		HPanelBannerSite.add(uploadBanner);
		
		HPanelBottPrinc.add(guardaDadosPrinc);
		HPanelBottPrinc.add(limpaDadosPrinc);
		
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
		
		HPanelButtMod.add(guardaModulos);
		HPanelButtMod.add(limpaModulos);
		
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
		HTML HTMLImagemOp1 = new HTML("<IMG SRC='estrutura1.gif'> </P>");
		HTML HTMLImagemOp2 = new HTML("<IMG SRC='estrutura2.gif'> </P>");
		HTML HTMLImagemOp3 = new HTML("<IMG SRC='estrutura3.gif'> </P>");
		HTML HTMLImagemOp4 = new HTML("<IMG SRC='estrutura4.gif'> </P>");
		
		HPanelOpcao1.add(radioOpc1);
		HPanelOpcao1.add(HTMLImagemOp1);
		
		HPanelOpcao2.add(radioOpc2);
		HPanelOpcao2.add(HTMLImagemOp2);
		
		HPanelOpcao3.add(radioOpc3);
		HPanelOpcao3.add(HTMLImagemOp3);
		
		HPanelOpcao4.add(radioOpc4);
		HPanelOpcao4.add(HTMLImagemOp4);
		
		HPanelButtLay.add(guardaLayout);

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
		HPanelButtVisu.add(visualizaPagina);
		HPanelButtVisu.add(criaPagina);
		
		VPanelVisual.add(HPanelChamadaVisu);
		VPanelVisual.add(HPanelButtVisu);
		
		tabPanel.add(VPanelVisual, "Visualizar");
		
		// Atribui viibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
	}

	/*@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}*/

}
