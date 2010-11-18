package com.cloudwb.project.client;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.core.Template;
import com.extjs.gxt.ui.client.widget.HorizontalPanel;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.LayoutContainer;  
import com.extjs.gxt.ui.client.widget.TabItem;  
import com.extjs.gxt.ui.client.widget.TabPanel;  
import com.extjs.gxt.ui.client.widget.VerticalPanel;  
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.CheckBoxGroup;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.layout.TableData;
import com.extjs.gxt.ui.client.widget.tips.ToolTipConfig;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;
  
public class TabPrincipal extends LayoutContainer{
	  @Override  
	  protected void onRender(Element parent, int pos) {  
	    super.onRender(parent, pos);  
	    
	    createTabPanel();
	    
	  } 
	  
	  //metodo que cria o TabPanel principal
	  private void createTabPanel(){

		    //painel responsavel por abrigar o tabPanel
		    VerticalPanel vp = new VerticalPanel();  
		    vp.setSpacing(10);  
		    
		    FormData formData = new FormData("100%");
		    
		    //criação do tabPanel
		    TabPanel tabPanel = new TabPanel();  
		    tabPanel.setWidth(1250);  
		    tabPanel.setAutoHeight(true);  
		    
		    //criação da aba "Dados Principais" 
		    TabItem tabItemDadosPrincipais = new TabItem("Dados Principais");  
		    tabItemDadosPrincipais.addStyleName("tab-item-dados-principais");  
		    tabPanel.add(tabItemDadosPrincipais);  
		  
		    //criação da aba "Modulos"
		    TabItem tabItemModulos = new TabItem("Modulos"); 
		    tabItemDadosPrincipais.addStyleName("tab-item-modulos");  
		    tabPanel.add(tabItemModulos);
		    
		    //criação da aba "Layout" 
		    TabItem tabItemLayout = new TabItem("Layout");  
		    tabItemLayout.addStyleName("tab-item-layout");  
		    tabPanel.add(tabItemLayout);
		    
		    //criação da aba "Final" 
		    TabItem tabItemFinal = new TabItem("Final");  
		    tabItemFinal.addStyleName("tab-item-final");  
		    tabPanel.add(tabItemFinal);
		  
		    
		    //criação dos conteudos das abas
		    
		    
		    
		    //chamada ao metodo que criará o formulario da aba Dados Principais
		    VerticalPanel vpAbaDP = createFormDP();

		    //chamada ao metodo que criará o formulario da aba Modulos
		    VerticalPanel vpAbaModulos = createModulos();

		    //chamada ao metodo que criará o conteudo da aba Layout
		    VerticalPanel vpAbaLayout = createLayout();

		    //chamada ao metodo que criará o conteudo da aba Final
		    VerticalPanel vpAbaFinal = createFinal();

		    
		    //colocando os conteudos criados dentro das abas correspondentes
		    
		    
		    
		    //adicionando o formulario da aba DP
		    tabItemDadosPrincipais.add(vpAbaDP);
		    
		    //adicionando o formulario da aba Modulos
		    tabItemModulos.add(vpAbaModulos);
		    
		    //adicionando o conteudo da aba Layout
		    tabItemLayout.add(vpAbaLayout);
	    
		    //adicionando o conteudo da aba Final
		    tabItemFinal.add(vpAbaFinal);
	    
		    
		    //colocando o tabPanel dentro do Vertical Panel
		    vp.add(tabPanel);  
		    add(vp);

	  }
	  
	  
	  
	
	//metodo que cria o formulario da aba "Dados Principais" (DP) 
	  
	  private VerticalPanel createFormDP() {  
		
		//criacao do verticalPanel que abrigará o formulario
		VerticalPanel vpFormDP = new VerticalPanel();  
		
		//criação do formulario
		FormPanel formDP = new FormPanel();  
	    formDP.setHeading("Dados Principais");
	    formDP.setFrame(true);  
	    formDP.setWidth(550);
	
	    Label labelDP1 = new Label("Informacoes gerais sobre o site:");
	    formDP.add(labelDP1);
	    
	    TextField<String> textFieldNomeSite = new TextField<String>();  
	    textFieldNomeSite.setFieldLabel("Nome da Instituicao");  
	    textFieldNomeSite.setAllowBlank(false);   
	    formDP.add(textFieldNomeSite);  
	  
	    TextField<String> textFieldTituloSite = new TextField<String>();  
	    textFieldTituloSite.setFieldLabel("Titulo do site");  
	    textFieldTituloSite.setAllowBlank(false);  
	    formDP.add(textFieldTituloSite);  
    
	    TextArea textAreaDescricao = new TextArea();  
	    textAreaDescricao.setPreventScrollbars(true);  
	    textAreaDescricao.setFieldLabel("Descricao");  
	    formDP.add(textAreaDescricao);
	    
	    TextField<String> textFieldBanner = new TextField<String>();  
	    textFieldBanner.setFieldLabel("Banner");  
	    textFieldBanner.setAllowBlank(false);  
	    formDP.add(textFieldBanner);
	    
	    //formDP.add(new Button("Procurar..."));
	    
	    HorizontalPanel hp = new HorizontalPanel();
	    hp.setTableWidth("100%");
	    TableData td = new TableData();
	    td.setHorizontalAlign(HorizontalAlignment.CENTER);
	    hp.add(new Button("Procurar..."), td);
	    
	    formDP.add(hp);
	    
	    HorizontalPanel hpBotoes = new HorizontalPanel();
		hpBotoes.setTableWidth("100%");
		td = new TableData();
		td.setHorizontalAlign(HorizontalAlignment.LEFT);
		hpBotoes.add(new Button("Limpar"), td);
		td = new TableData();
		td.setHorizontalAlign(HorizontalAlignment.RIGHT);
		hpBotoes.add(new Button("Proximo Passo"), td);
		  
		formDP.add(hpBotoes);
	    
		//adicionando o formulario no VerticalPanel
	    vpFormDP.add(formDP);
	    
	    return vpFormDP;
	  }
	  
	  
	  //metodo que cria o formulario da aba "Dados Principais" (DP)
	  
	  private VerticalPanel createModulos(){

		  //criacao do verticalPanel que abrigará o formulario
		  VerticalPanel vpModulos = new VerticalPanel();  
		  
		  //criação do formulario
		  FormPanel formModulos = new FormPanel();  
		  formModulos.setHeading("Formulario para a escolha dos modulos");
		  formModulos.setFrame(true);  
		  formModulos.setWidth(550);
		  
		  Label labelModulos1 = new Label("Opcoes de modulos ");
		  formModulos.add(labelModulos1);
		  
		  CheckBox check1 = new CheckBox();  
		  check1.setBoxLabel("Graduacao");  
		  
		  CheckBox check2 = new CheckBox();  
		  check2.setBoxLabel("Pos-Graduacao");    
		  
		  CheckBox check3 = new CheckBox();  
		  check3.setBoxLabel("Mestrado");  

		  CheckBox check4 = new CheckBox();  
		  check4.setBoxLabel("Doutorado");  
  
		  formModulos.add(check1);
		  formModulos.add(check2);
		  formModulos.add(check3);
		  formModulos.add(check4);
		 
		  HorizontalPanel hpBotoes = new HorizontalPanel();
		  hpBotoes.setTableWidth("100%");
		  TableData td = new TableData();
		  td.setHorizontalAlign(HorizontalAlignment.LEFT);
		  hpBotoes.add(new Button("Limpar"), td);
		  td = new TableData();
		  td.setHorizontalAlign(HorizontalAlignment.RIGHT);
		  hpBotoes.add(new Button("Proximo Passo"), td);
		  
		  formModulos.add(hpBotoes);
		  
		  vpModulos.add(formModulos);
		
		  return vpModulos;
	  }
	  

		private VerticalPanel createLayout() {
			
			VerticalPanel vpLayout = new VerticalPanel();
			HorizontalPanel hpLayout = new HorizontalPanel();
			
			FormPanel formLayout = new FormPanel();  
		    formLayout.setHeading("Escolha um dos Layouts abaixo");
		    formLayout.setFrame(true);  
		    formLayout.setWidth(550);

		    Button btn = new Button("Classico");  
		    ToolTipConfig config1 = new ToolTipConfig();  
		    //config1.setText("Prints the current document1");  
		    config1.setTitle("Layout Classico");  
		    config1.setMouseOffset(new int[] {0, 0});  
		    config1.setAnchor("left");  
		    config1.setTemplate(new Template(getTemplate01()));  
		    config1.setCloseable(true);  
		    config1.setMaxWidth(500);  
		    btn.setToolTip(config1);  
		    hpLayout.add(btn);
		    
		    Button btn2 = new Button("Moderno");  
		    ToolTipConfig config2 = new ToolTipConfig();  
		    config2.setText("Prints the current document2");  
		    config2.setTitle("Layout Moderno");  
		    config2.setMouseOffset(new int[] {0, 0});  
		    config2.setAnchor("left");  
		    config2.setTemplate(new Template(getTemplate02()));  
		    config2.setCloseable(true);  
		    config2.setMaxWidth(500);  
		    btn2.setToolTip(config2);  
		    hpLayout.add(btn2);
		    
		    Button btn3 = new Button("Dark");  
		    ToolTipConfig config3 = new ToolTipConfig();  
		    config3.setText("Prints the current document3");  
		    config3.setTitle("Layout Dark");  
		    config3.setMouseOffset(new int[] {0, 0});  
		    config3.setAnchor("left");  
		    config3.setTemplate(new Template(getTemplate03()));  
		    config3.setCloseable(true);  
		    config3.setMaxWidth(520);  
		    btn3.setToolTip(config3);  
		    hpLayout.add(btn3);
		    
		    formLayout.add(hpLayout);
		    
		    HorizontalPanel hpBotoes = new HorizontalPanel();
		  	hpBotoes.setTableWidth("100%");
		  	TableData td2 = new TableData();
		  	td2.setHorizontalAlign(HorizontalAlignment.LEFT);
		  	hpBotoes.add(new Button("Limpar"), td2);
		  	td2 = new TableData();
		  	td2.setHorizontalAlign(HorizontalAlignment.RIGHT);
		  	hpBotoes.add(new Button("Proximo Passo"), td2);
		  
		  	formLayout.add(hpBotoes);
			
		  	vpLayout.add(formLayout);
		  	
			return vpLayout;
		}

		private native String getTemplate01() /*-{ 
	    var html = [ 
	    '<div>', 
	    '<img width="480" height="300" src="images/layout01.JPG" style="border: 1px solid #ddd">', 
	    '</div>' 
	    ]; 
	    return html.join(""); 
	  }-*/;  
		
		private native String getTemplate02() /*-{ 
	    	var html = [ 
	    	'<div>', 
	    	'<img width="480" height="300" src="images/layout02.JPG" style="border: 1px solid #ddd">', 
	    	'</div>' 
	    ]; 
	    return html.join(""); 
	  	}-*/;
		
		private native String getTemplate03() /*-{ 
    		var html = [ 
    		'<div>',  
    		'<img width="480" height="300" src="images/layout03.JPG" style="border: 1px solid #ddd">', 
    		'</div>' 
    	]; 
    	return html.join(""); 
  		}-*/;
		
	 	private VerticalPanel createFinal() {
		
	 		VerticalPanel vpFinal = new VerticalPanel();
	 		
	 		//criacao do verticalPanel que abrigará o formulario
	 		FormPanel formFinal = new FormPanel();  
		    formFinal.setHeading("Finalizacao");
		    formFinal.setFrame(true);  
		    formFinal.setWidth(550);
	 		
		    HorizontalPanel hpBotoes = new HorizontalPanel();
		  	hpBotoes.setTableWidth("100%");
		  	TableData td = new TableData();
		  	td.setHorizontalAlign(HorizontalAlignment.CENTER);
		  	hpBotoes.add(new Button("Visualizar Site"), td);
		  	td = new TableData();
		  	td.setHorizontalAlign(HorizontalAlignment.CENTER);
		  	hpBotoes.add(new Button("Criar e Exportar"), td);
		  
		  	formFinal.add(hpBotoes);
			
		  	vpFinal.add(formFinal);
		  	
	 		return vpFinal;
		}
}