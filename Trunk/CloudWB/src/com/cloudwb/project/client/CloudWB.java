package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
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
public class CloudWB extends Composite implements EntryPoint, ClickHandler{

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
	
	private Button guardaModulos = new Button("Guardar");
	private Button limpaModulos = new Button("Limpar");
	private CheckBox checkOpc1 = new CheckBox();
	private CheckBox checkOpc2 = new CheckBox();
	private CheckBox checkOpc3 = new CheckBox();
	private CheckBox checkOpc4 = new CheckBox();
	
	private Button guardaLayout = new Button("Guardar");
	private RadioButton radioOpc1 = new RadioButton("opcao");
	private RadioButton radioOpc2 = new RadioButton("opcao");
	private RadioButton radioOpc3 = new RadioButton("opcao");
	private RadioButton radioOpc4 = new RadioButton("opcao");
	
	private Button visualizaPagina = new Button("Visualizar");
	private Button criaPagina = new Button("Criar");
	
	public void onModuleLoad() {
		
		limpaDadosPrinc = new Button("Limpar", new ClickListener() {
		  public void onClick(Widget sender) {
			  Window.alert("Teste");
			  caixaNomeSite.setValue(" ");
			  caixaTituloSite.setValue(" ");
			  caixaBannerSite.setValue(" ");     
		  }});
		
		guardaDadosPrinc = new Button("Guarda", new ClickListener() {
	      public void onClick(Widget sender) {
	    	Window.alert("Pegou info");
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
		
		uploadBanner.addClickHandler(this);
		guardaDadosPrinc.addClickHandler(this);
		limpaDadosPrinc.addClickHandler(this);
		
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
		
		// Adiciona Tab Principal
		VerticalPanel princDados = new VerticalPanel();
		HorizontalPanel nomeSiteHPanel = new HorizontalPanel();
		HorizontalPanel tituloSiteHPanel = new HorizontalPanel();
		HorizontalPanel bannerSiteHPanel = new HorizontalPanel();
		HorizontalPanel bottPrincHPanel = new HorizontalPanel();
		
		HTML chamada = new HTML("Informacoes gerais sobre o site<br>");
		HTML nomeSiteHTML = new HTML ("<P>Nome do Site:");
		HTML tituloSiteHTML = new HTML ("<P>Titulo: ");
		HTML bannerSiteHTML = new HTML ("<P>Banner: ");

		nomeSiteHPanel.add(nomeSiteHTML);
		nomeSiteHPanel.add(caixaNomeSite);
		tituloSiteHPanel.add(tituloSiteHTML);
		tituloSiteHPanel.add(caixaTituloSite);
		bannerSiteHPanel.add(bannerSiteHTML);
		bannerSiteHPanel.add(caixaBannerSite);
		bannerSiteHPanel.add(uploadBanner);
		bottPrincHPanel.add(guardaDadosPrinc);
		bottPrincHPanel.add(limpaDadosPrinc);
		princDados.add(chamada);
		princDados.add(nomeSiteHPanel);
		princDados.add(tituloSiteHPanel);
		princDados.add(bannerSiteHPanel);
		princDados.add(bottPrincHPanel);
		
		
		tabPanel.add(princDados, "Dados Principais");
		
		// Adiciona Tab Módulo
		HTML modulText = new HTML("Formulario para a escolha dos modulos"+
				"<P>Opcoes de modulos:</P>" +
				"<P>" + checkOpc1 + "Graduacao" +
				"<P>" + checkOpc2 + "Pos-graduacao</P>" +
				"<P>" + checkOpc3 + "Mestrado" +
				"<P>" + checkOpc4 + "Doutorado</P><P>" +
				guardaModulos +" "+ limpaModulos);
		tabPanel.add(modulText, "Modulos");
		
		// Adiciona Tab Layout
		HTML layoutText = new HTML("Escolha o Layout das paginas:<br>"+
				"<P>Opcoes de layout:</P>" +
				"<P>" + radioOpc1 + " <IMG SRC='estrutura1.gif'> </P>" +
				"<P>" + radioOpc2 + " <IMG SRC='estrutura2.gif'> </P>" +
				"<P>" + radioOpc3 + " <IMG SRC='estrutura3.gif'> </P>" +
				"<P>" + radioOpc4 + " <IMG SRC='estrutura4.gif'> </P><P></INPUT>" +
				guardaLayout);
		tabPanel.add(layoutText, "Layout");

		// Adiciona Tab Final
		HTML templatText = new HTML("<P>Finalizando o projeto:</P>" +
				visualizaPagina +" "+ criaPagina );
		tabPanel.add(templatText, "Visualizar");
		
		// Atribui viibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
	}

	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	 /*public void onClick(ClickEvent event) {
	   Widget sender = (Widget) event.getSource();
       if (sender == uploadBanner) {
    	 
       } else if (sender == guardaDadosPrinc) {
         pagCliente.setNomeSite(caixaNomeSite.getValue());
         pagCliente.setTituloSite(caixaTituloSite.getValue());
         pagCliente.setBannerSite(caixaBannerSite.getValue());
	   } else if (sender == limpaDadosPrinc) {
		 caixaNomeSite.setValue(" ");
		 caixaTituloSite.setValue(" ");
		 caixaBannerSite.setValue(" ");
	   }
	 }*/
}
