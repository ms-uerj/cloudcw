package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class CloudWB implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private Label lastUpdatedLabel = new Label();
	
	public void onModuleLoad() {
		
		//instância de PaginaCliente
		PaginaCliente pagCliente = new PaginaCliente();
		
		// Assemble Main panel.
		mainPanel.add(stocksFlexTable);
		mainPanel.add(addPanel);
		mainPanel.add(lastUpdatedLabel);

		
		// Associate the Main panel with the HTML host page.
		RootPanel.get("form").add(mainPanel);

		// Create a tab panel
		TabPanel tabPanel = new TabPanel();

		// Set the width to 600 pixels
		tabPanel.setWidth("800px");
		
		Button uploadBanner = new Button("Upload");
		Button guardaDadosPrinc = new Button("Guardar");
		Button limpaDadosPrinc = new Button("Limpar");
		TextBox caixaNomeSite = new TextBox();
		TextBox caixaTituloSite = new TextBox();
		TextBox caixaBannerSite = new TextBox();
		
		// Adiciona Tab Principal
		HTML homeText = new HTML("Informacoes gerais sobre o site<br>"+
				//"<FORM ACTION= METHOD=POST NAME=dados>" +
				"<P>Nome do Site:" + caixaNomeSite + "</P>" +
				"<P>Titulo: " + caixaTituloSite +"</P>" +
				"<P>Banner: " + caixaBannerSite +
				 uploadBanner + "<br><br>"+ "      " +
				 guardaDadosPrinc + "      "+ limpaDadosPrinc);
		tabPanel.add(homeText, "Dados Principais");

		Button guardaModulos = new Button("Guardar");
		Button limpaModulos = new Button("Limpar");
		CheckBox checkOpc1 = new CheckBox();
		CheckBox checkOpc2 = new CheckBox();
		CheckBox checkOpc3 = new CheckBox();
		CheckBox checkOpc4 = new CheckBox();		
		
		// Adiciona Tab Módulo
		HTML modulText = new HTML("Formulario para a escolha dos modulos"+
				//"<FORM METHOD=POST NAME=modulo>" +
				"<P>Opcoes de modulos:</P>" +
				"<P>" + checkOpc1 + "Graduacao" +
				"<P>" + checkOpc2 + "Pos-graduacao</P>" +
				"<P>" + checkOpc3 + "Mestrado" +
				"<P>" + checkOpc4 + "Doutorado</P><P>" +
				guardaModulos +" "+ limpaModulos);
		tabPanel.add(modulText, "Modulos");
		
		Button guardaLayout = new Button("Guardar");
		RadioButton radioOpc1 = new RadioButton("opcao");
		RadioButton radioOpc2 = new RadioButton("opcao");
		RadioButton radioOpc3 = new RadioButton("opcao");
		RadioButton radioOpc4 = new RadioButton("opcao");
		
		// Adiciona Tab Layout
		HTML layoutText = new HTML("Escolha o Layout das paginas:<br>"+
				//"<FORM METHOD=POST NAME=layout>" +
				"<P>Opcoes de layout:</P>" +
				"<P>" + radioOpc1 + " <IMG SRC='estrutura1.gif'> </P>" +
				"<P>" + radioOpc2 + " <IMG SRC='estrutura2.gif'> </P>" +
				"<P>" + radioOpc3 + " <IMG SRC='estrutura3.gif'> </P>" +
				"<P>" + radioOpc4 + " <IMG SRC='estrutura4.gif'> </P><P></INPUT>" +
				guardaLayout);
		tabPanel.add(layoutText, "Layout");

		// Adiciona Tab Template
		/*HTML templatText = new HTML("Escolha de um Template<br>"+
				"<FORM METHOD=POST NAME=templante>" +
				"<P>Opcoes de template:</P>" +
				"<P><INPUT TYPE=CHECKBOX NAME=op1>opcao 1" +
				"<INPUT TYPE=CHECKBOX NAME=op2>opcao 2</P>" +
				"<P><INPUT TYPE=CHECKBOX NAME=op3>opcao 3" +
				"<INPUT TYPE=CHECKBOX NAME=op4>opcao 4</P><P>" +
				"<INPUT TYPE=SUBMIT VALUE=SEGUIR ONCLICK=\"Javascript:alert('O form sera enviado!');\">" +
				"<INPUT TYPE=RESET VALUE=LIMPAR></P>");
		tabPanel.add(templatText, "TEMPLATE");*/
		
		Button visualizaPagina = new Button("Visualizar");
		Button criaPagina = new Button("Criar");
		
		// Adiciona Tab Final
		HTML templatText = new HTML("<P>Finalizando o projeto:</P>" +
				//"<FORM METHOD=POST NAME=>" +
				visualizaPagina +" "+ criaPagina );
		tabPanel.add(templatText, "Visualizar");
		
		
		// Atribui viibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
		
	}


}
