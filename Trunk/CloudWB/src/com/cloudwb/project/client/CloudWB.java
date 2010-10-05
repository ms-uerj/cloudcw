package com.cloudwb.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class CloudWB implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private Label lastUpdatedLabel = new Label();
	
	public void onModuleLoad() {
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

		// Adiciona Tab Principal
		HTML homeText = new HTML("Informacoes gerais sobre o site<br>"+
				"<FORM METHOD=POST NAME=dados>" +
				"<P>Nome do Site: <INPUT TYPE=TEXT NAME=nomeSite SIZE=10 MAXLENGTH=8></P>" +
				"<P>Titulo: <INPUT TYPE=TEXT NAME=tituloSite SIZE=20 MAXLENGTH=8></P>" +
				"<P>Banner: <INPUT TYPE=TEXT NAME=nomeSite SIZE=20 MAXLENGTH=8>" +
				"<INPUT TYPE=SUBMIT VALUE=upload ONCLICK=\"Javascript:alert('buscando imagem!');\"></P>" +
				"<INPUT TYPE=SUBMIT VALUE=Confirmar ONCLICK=\"Javascript:alert('O form sera enviado!');\">" +
				"<INPUT TYPE=RESET VALUE=Limpar></P>");
		tabPanel.add(homeText, "Dados Principais");
		
		// Adiciona Tab Módulo
		HTML modulText = new HTML("Formulario para a escolha dos modulos"+
				"<FORM METHOD=POST NAME=modulo>" +
				"<P>Opcoes de modulos:</P>" +
				"<P><INPUT TYPE=CHECKBOX NAME=op1>Graduacao" +
				"<INPUT TYPE=CHECKBOX NAME=op2>Pos-graduacao</P>" +
				"<P><INPUT TYPE=CHECKBOX NAME=op3>Mestrado" +
				"<INPUT TYPE=CHECKBOX NAME=op4>Doutorado</P><P>" +
				"<INPUT TYPE=SUBMIT VALUE=Confirmar ONCLICK=\"Javascript:alert('O form sera enviado!');\">" +
				"<INPUT TYPE=RESET VALUE=Limpar></P>");
		tabPanel.add(modulText, "Modulos");
		
		// Adiciona Tab Layout
		HTML layoutText = new HTML("Escolha o Layout das paginas:<br>"+
				"<FORM METHOD=POST NAME=layout>" +
				"<P>Opcoes de layout:</P>" +
				"<P><INPUT TYPE=RADIO BUTTON NAME=op1>opcao 1 <IMG SRC='estrutura1.gif'></INPUT>" +
				"<INPUT TYPE=RADIO BUTTON NAME=op2>opcao 2 <IMG SRC='estrutura2.gif'></INPUT> </P>" +
				"<P><INPUT TYPE=RADIO BUTTON NAME=op3>opcao 3 <IMG SRC='estrutura3.gif'></INPUT>" +
				"<INPUT TYPE=RADIO BUTTON NAME=op4>opcao 4 <IMG SRC='estrutura4.gif'> </P><P></INPUT>" +
				"<INPUT TYPE=SUBMIT VALUE=Confirmar ONCLICK=\"Javascript:alert('O form sera enviado!');\">");
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
		
		// Adiciona Tab Final
		HTML templatText = new HTML("<P>Finalizando o projeto:</P>" +
				"<FORM METHOD=POST NAME=templante>" +
				"<INPUT TYPE=SUBMIT VALUE=Visualiza ONCLICK=\"Javascript:alert('Exibindo rascunho!');\">" +
				"<INPUT TYPE=SUBMIT VALUE=Criar ONCLICK=\"Javascript:alert('A página será criada!');\">");
		tabPanel.add(templatText, "Visualizar");
		
		
		// Atribui viibilidade para as tabs e adiciona ao painel da página
		tabPanel.selectTab(0);
		addPanel.add(tabPanel);
	}
}
