package com.cloudwb.project.client;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ImageStyle;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.CheckboxItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.SelectOtherItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.IconClickEvent;
import com.smartgwt.client.widgets.form.fields.events.IconClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;


public class CriadorTab {

	public static PaginaCliente pagCliente = new PaginaCliente();
	
	

	public VLayout criaTabForm(){
			
			final ValuesManager vm = new ValuesManager();  
		 
			VLayout vLayoutDP = new VLayout();

			//tabset
	        final TabSet tabSetPrincipal = new TabSet();  
	        tabSetPrincipal.setWidth(600);  
	        tabSetPrincipal.setHeight(600);
	        tabSetPrincipal.setTabBarPosition(Side.BOTTOM); 
	        
	        //tab
	        Tab tabDP = new Tab("Dados Principais","icondp.png");    
	          
	        //form
	        final DynamicForm dynFormDP = new DynamicForm();  
	        dynFormDP.setID("dynFormDP");  
	        dynFormDP.setValuesManager(vm);
	        dynFormDP.setIsGroup(true);
	        dynFormDP.setAlign(Alignment.CENTER);							
	        dynFormDP.setGroupTitle("Caracteristicas Gerais do Website");
	        
	        //itens form
	        
	        FormItemIcon iconDuvida = new FormItemIcon();  
	        iconDuvida.setSrc("help.png");  
	          
	        final TextItem txtItemNomeInstituicao = new TextItem();  
	        txtItemNomeInstituicao.setName("txtItemNomeInstituicao");  
	        txtItemNomeInstituicao.setTitle("<nobr>Nome da Instituicao</nobr>");
	        txtItemNomeInstituicao.setIcons(iconDuvida);
	        txtItemNomeInstituicao.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro");
					
				}  
                

            });  

	        
	        final TextItem txtItemTitulo = new TextItem();  
	        txtItemTitulo.setName("txtItemTitulo");  
	        txtItemTitulo.setTitle("Titulo do Website");
	        txtItemTitulo.setIcons(iconDuvida);
	        txtItemTitulo.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro");
					
				}  
                

            });  


	        final TextAreaItem txtAreaDescricao = new TextAreaItem();
	        txtAreaDescricao.setName("txtAreaDescricao");  
	        txtAreaDescricao.setTitle("Descricao do Website");
	        txtAreaDescricao.setHint("Escreva aqui uma visao geral do que seu Website oferece, para que os motores de busca como Google, Bing e Yahoo possam localizar melhor o seu site.");
	          
	        final TextItem txtItemKeyWords = new TextItem();  
	        txtItemKeyWords.setName("txtItemKeyWords");  
	        txtItemKeyWords.setTitle("Palavras-Chave");
	        txtItemKeyWords.setHint("Palavras relacionadas ao seu Instituto, utilizadas pelos motores de busca como Google, Bing e Yahoo para localizar seu site.");
	        
	        final TextItem txtItemFooter = new TextItem();  
	        txtItemFooter.setName("txtItemFooter");  
	        txtItemFooter.setTitle("Nota do Footer");
	        txtItemFooter.setIcons(iconDuvida);  
	        txtItemFooter.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro - Copyright - Todos os direitos reservados 2010");
					
				}  
                

            });  

	        
	        final TextItem txtItemFavicon = new TextItem();  
	        txtItemFavicon.setName("txtItemFavicon");  
	        txtItemFavicon.setTitle("Icone do Website");

	        final TextItem txtItemBanner = new TextItem();  
	        txtItemBanner.setName("txtItemBanner");  
	        txtItemBanner.setTitle("Banner do Website");
	        
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesDP = new HLayout();
	        hLayoutBotoesDP.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveDP = new Button("Salvar Alteracoes");
	        Button ButtonResetDP = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesDP.addMember(ButtonSaveDP);
	        hLayoutBotoesDP.addMember(ButtonResetDP);
	        
	        //colocando os itens no formulario
	        dynFormDP.setItems(txtItemNomeInstituicao,txtItemTitulo,txtAreaDescricao,txtItemKeyWords,txtItemFooter,txtItemFavicon,txtItemBanner);

	        //add formulario e botoes no Vlayout 
			vLayoutDP.addMember(dynFormDP);
			vLayoutDP.addMember(hLayoutBotoesDP);
	        
			//add VLayoutDP na aba DP
	        tabDP.setPane(vLayoutDP);  
	        
	  
	        
	        //nova tab
	        Tab tabModulos = new Tab("Modulos","iconmodulos.png");  
	        
	        VLayout vLayoutMod = new VLayout();

	        //form Modulos
	        final DynamicForm dynFormMod = new DynamicForm();  
	        dynFormMod.setID("dynFormMod");  
	        dynFormMod.setValuesManager(vm);
	        dynFormMod.setIsGroup(true);
	        //dynFormMod.setWidth(570);
	        dynFormMod.setGroupTitle("Configuracao / Escolha dos Modulos");
	        	        
	        //itens form Modulos
	        
	        final CheckboxItem ChBoxGraduacao = new CheckboxItem();  
	        ChBoxGraduacao.setName("ChBoxGraduacao");
	        ChBoxGraduacao.setWidth(115);
	        ChBoxGraduacao.setTitle("Graduacao");
	        ChBoxGraduacao.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada a Graduacao");
	        

	        final CheckboxItem ChBoxPos = new CheckboxItem();  
	        ChBoxPos.setName("ChBoxPos");  
	        ChBoxPos.setWidth(115);
	        ChBoxPos.setTitle("Pos-Graduacao");
	        ChBoxPos.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada a Pos-Graduacao");

	        final CheckboxItem ChBoxMestrado = new CheckboxItem();  
	        ChBoxMestrado.setName("ChBoxMestrado"); 
	        ChBoxMestrado.setWidth(115);
	        ChBoxMestrado.setTitle("Mestrado"); 
	        ChBoxMestrado.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada ao Mestrado");
	        
	        final CheckboxItem ChBoxDoutorado = new CheckboxItem(); 
	        ChBoxDoutorado.setWidth(115);
	        ChBoxDoutorado.setName("ChBoxDoutorado");  
	        ChBoxDoutorado.setTitle("Doutorado");
	        ChBoxDoutorado.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada ao Doutorado");
	        
	        final CheckboxItem ChBoxArquivos = new CheckboxItem();  
	        ChBoxArquivos.setName("ChBoxAraquivos");
	        ChBoxArquivos.setWidth(115);
	        ChBoxArquivos.setTitle("Arquivos");
	        ChBoxArquivos.setHint("Nesse modulo ficarao disponiveis para download os arquivos relacionados ao seu Instituto, como por exemplo, teses e artigos");

	        //adicionando os itens no formulario
	        dynFormMod.setFields(ChBoxGraduacao,ChBoxPos,ChBoxMestrado,ChBoxDoutorado,ChBoxArquivos);
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesMod = new HLayout();
	        hLayoutBotoesMod.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveMod = new Button("Salvar Alteracoes");
	        Button ButtonResetMod = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesMod.addMember(ButtonSaveMod);
	        hLayoutBotoesMod.addMember(ButtonResetMod);
	        
	        //add formulario e botoes no Vlayout 
			vLayoutMod.addMember(dynFormMod);
			vLayoutMod.addMember(hLayoutBotoesMod);
	        
			//add VLayout na aba Modulos
	        tabModulos.setPane(vLayoutMod);
          
	        
	        //nova tab
	        Tab tabTemplate = new Tab("Template","icontemplate.png");  

	        //layout principal da aba template 
	        VLayout vLayoutTemplate = new VLayout();

	        //label principal da aba template
	        Label labelTemplate = new Label();  
	        labelTemplate.setHeight(40);  
	        labelTemplate.setPadding(10);  
	        labelTemplate.setAlign(Alignment.CENTER);  
	        labelTemplate.setValign(VerticalAlignment.CENTER);  
	        labelTemplate.setWrap(false);  
	        labelTemplate.setShowEdges(true);  
	        labelTemplate.setContents("<b>Escolha um dos layouts abaixo</b>");  
	        
	        //label preVisualizacao da aba template
	        Label labelTemplatePre = new Label();  
	        labelTemplatePre.setHeight(40);  
	        labelTemplatePre.setPadding(10);  
	        labelTemplatePre.setAlign(Alignment.CENTER);  
	        labelTemplatePre.setValign(VerticalAlignment.CENTER);  
	        labelTemplatePre.setWrap(false);  
	        labelTemplatePre.setShowEdges(true);  
	        labelTemplatePre.setContents("<b>Pre-Visualizacao</b>");
	        
	        
	        //hlayout para acomodar os botoes para escolha dos layouts
	        HLayout hLayoutOpcLayouts = new HLayout();
	        hLayoutOpcLayouts.setAlign(Alignment.CENTER);
	        
	        
	        //vlayout responsavel pela pre-visualizacao do layout escolhido
	        final HLayout hLayoutPreVisu = new HLayout();
	        hLayoutPreVisu.setAlign(Alignment.CENTER);

	        
	        //imagens dos layouts
	        String caminhoClassico = "layout01.jpg";  
	        final Img imgClassico = new Img(caminhoClassico, 480, 300);  
	        imgClassico.setImageType(ImageStyle.STRETCH);  
	        imgClassico.setBorder("1px solid gray");  
	        imgClassico.setLeft(10);
	        imgClassico.setTop(30);
	        imgClassico.setAlign(Alignment.CENTER);
	        
	        String caminhoModerno = "layout02.jpg";  
	        final Img imgModerno = new Img(caminhoModerno, 480, 300);  
	        imgModerno.setImageType(ImageStyle.STRETCH);  
	        imgModerno.setBorder("1px solid gray");  
	        imgModerno.setLeft(10);
	        imgModerno.setTop(30);
	        imgModerno.setAlign(Alignment.CENTER);
	        
	        String caminhoDark = "layout03.jpg";  
	        final Img imgDark = new Img(caminhoDark, 480, 300);  
	        imgDark.setImageType(ImageStyle.STRETCH);  
	        imgDark.setBorder("1px solid gray");  
	        imgDark.setLeft(10);
	        imgDark.setTop(30);
	        imgDark.setAlign(Alignment.CENTER);
	        
	        Button btnClassico = new Button("Classico");
	        btnClassico.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	hLayoutPreVisu.removeMember(imgClassico);
	            	hLayoutPreVisu.removeMember(imgModerno);
	            	hLayoutPreVisu.removeMember(imgDark);
	            	hLayoutPreVisu.addMember(imgClassico);
	            	
	            	pagCliente.setLayoutSite(1);

	            }  
	        });
	        
	        Button btnModerno = new Button("Moderno");
	        btnModerno.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	hLayoutPreVisu.removeMember(imgClassico);
	            	hLayoutPreVisu.removeMember(imgModerno);
	            	hLayoutPreVisu.removeMember(imgDark);
	            	hLayoutPreVisu.addMember(imgModerno);
	            	
	            	pagCliente.setLayoutSite(2);
	            }  
	        });
	        
	        Button btnDark = new Button("Dark");
	        btnDark.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	hLayoutPreVisu.removeMember(imgClassico);
	            	hLayoutPreVisu.removeMember(imgModerno);
	            	hLayoutPreVisu.removeMember(imgDark);
	            	hLayoutPreVisu.addMember(imgDark);
	            	
	            	pagCliente.setLayoutSite(3);
	            	
	            }  
	        });
	        
	        //add botoes no hlayout
	        hLayoutOpcLayouts.addMember(btnClassico);
	        hLayoutOpcLayouts.addMember(btnModerno);
	        hLayoutOpcLayouts.addMember(btnDark);
	       
	        //	hlayout dos botoes
	        HLayout hLayoutBotoesTemplate = new HLayout();
	        hLayoutBotoesTemplate.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveTemplate = new Button("Salvar Alteracoes");
	        Button ButtonResetTemplate = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesTemplate.addMember(ButtonSaveTemplate);
	        hLayoutBotoesTemplate.addMember(ButtonResetTemplate);
	        
        	//colocando o layout classico como img inicial do preVisualizacao
	        hLayoutPreVisu.addMember(imgClassico);
	        
	        //add itens no vlayoutTemplate
	        vLayoutTemplate.addMember(labelTemplate);
	        vLayoutTemplate.addMember(hLayoutOpcLayouts);
	        vLayoutTemplate.addMember(labelTemplatePre);
	        vLayoutTemplate.addMember(hLayoutPreVisu);
	        vLayoutTemplate.addMember(hLayoutBotoesTemplate);
	        
	        //add o VLayoutTemplate na aba template
	        tabTemplate.setPane(vLayoutTemplate);


	        
	        
	        //nova tab
	        Tab tabCustomTemplate = new Tab("Customizacao do Template","iconct.png");  

	        //criacao do VLayout que abrigara os forms
	        VLayout vLayoutCT = new VLayout();
	        
	        //criacao do HLayout que abrigara os forms
	        HLayout hLayoutCT1 = new HLayout();

	        //add HLayout no VLayout
	        vLayoutCT.addMember(hLayoutCT1);
	        
	        //criando o formulario1
	        final DynamicForm dynFormCT1 = new DynamicForm();  
	        dynFormCT1.setID("dynFormCT1");  
	        dynFormCT1.setValuesManager(vm);
	        dynFormCT1.setIsGroup(true);
	        dynFormCT1.setWidth(295);
	        dynFormCT1.setHeight(300);
	        dynFormCT1.setGroupTitle("Frames");

	        //criando as imagens que serao modificadas com o form3
	        final Canvas canvasCT = new Canvas();
	        String caminho2 = "layout01.jpg";  
	        Img imgCT = new Img(caminho2, 480, 300);  
	        imgCT.setImageType(ImageStyle.STRETCH);  
	        imgCT.setBorder("1px solid gray");  
	        imgCT.setLeft(10);
	        imgCT.setTop(30);
	        canvasCT.addChild(imgCT);
	        
	        final Canvas canvas2 = new Canvas();
        	String caminho3 = "layout02.jpg";
        	final Img imgCT1 = new Img(caminho3, 480, 300);  
	        imgCT1.setImageType(ImageStyle.STRETCH);  
	        imgCT1.setBorder("1px solid gray");  
	        imgCT1.setLeft(10);
	        imgCT1.setTop(30);
	        canvas2.addChild(imgCT1);

	        final Canvas canvas3 = new Canvas();
        	String caminho4 = "layout03.jpg";
        	final Img imgCT2 = new Img(caminho4, 480, 300);  
	        imgCT2.setImageType(ImageStyle.STRETCH);  
	        imgCT2.setBorder("1px solid gray");  
	        imgCT2.setLeft(10);
	        imgCT2.setTop(30);
	        canvas3.addChild(imgCT2);

	        final Canvas canvas4 = new Canvas();
        	String caminho5 = "layout03.jpg";
        	final Img imgCT3 = new Img(caminho5, 480, 300);  
	        imgCT3.setImageType(ImageStyle.STRETCH);  
	        imgCT3.setBorder("1px solid gray");  
	        imgCT3.setLeft(10);
	        imgCT3.setTop(30);
	        canvas4.addChild(imgCT3);

	        //add itens no formCT
	        dynFormCT1.addChild(canvasCT);
	        
	        //criando o formulario2
	        final DynamicForm dynFormCT2 = new DynamicForm();  
	        dynFormCT2.setID("dynFormCT2");  
	        dynFormCT2.setValuesManager(vm);
	        dynFormCT2.setIsGroup(true);
	        dynFormCT2.setWidth(295);
	        dynFormCT2.setHeight(300);
	        dynFormCT2.setGroupTitle("Menu de Edicao");

	        //add forms no HLayout
	        hLayoutCT1.addMember(dynFormCT1);
	        hLayoutCT1.addMember(dynFormCT2);

	        //criando botoes que mudarao as imagens e o menu
	        Button bHeader = new Button("Header");
	        bHeader.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	//TODO mudar a imgem e mudar o formulario  //complicado, talvez nao facamos desse jeito
	            	//dynFormCT1.addChild(canvas2);
	            	
	            	dynFormCT1.addChild(canvasCT);
	            	SC.say("Clicou");
	            }  
	        });  
	        
	        Button bCenter = new Button("Center");
	        bCenter.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	//TODO mudar a imgem e mudar o formulario  //complicado, talvez nao facamos desse jeito
	            	
	            	dynFormCT1.addChild(canvas2);
	            	SC.say("Clicou");
	            }  
	        });
	        
	        Button bCenterLeft = new Button("Center-Left");
	        bCenterLeft.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	//TODO mudar a imgem e mudar o formulario  //complicado, talvez nao facamos desse jeito
	            	
	            	dynFormCT1.addChild(canvas3);
	            	SC.say("Clicou");
	            }  
	        });
	        
	        Button bFooter = new Button("Footer");
	        bFooter.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	//TODO mudar a imgem e mudar o formulario  //complicado, talvez nao facamos desse jeito
	            	
	            	dynFormCT1.addChild(canvas4);
	            	SC.say("Clicou");
	            	
	            }  
	        });
	        
	        //criando HLayout para comportar os botoes
	        HLayout HLayoutCTBotoes = new HLayout();
	        HLayoutCTBotoes.setAlign(Alignment.CENTER);
	        
	        HLayoutCTBotoes.addMember(bHeader);
	        HLayoutCTBotoes.addMember(bCenter);
	        HLayoutCTBotoes.addMember(bCenterLeft);
	        HLayoutCTBotoes.addMember(bFooter);
	        
	        //add HLayout no VLayout
	        vLayoutCT.addMember(HLayoutCTBotoes);

	        //hlayout dos botoes
	        HLayout hLayoutBotoesCT2 = new HLayout();
	        hLayoutBotoesCT2.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveCT = new Button("Salvar Alteracoes");
	        Button ButtonResetCT = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesCT2.addMember(ButtonSaveCT);
	        hLayoutBotoesCT2.addMember(ButtonResetCT);
	        
	        //add botoes no vlayout
	        vLayoutCT.addMember(hLayoutBotoesCT2);
	        
	        //add VLayout na aba CT
	        tabCustomTemplate.setPane(vLayoutCT);

	        
	        
	        
	        //nova tab
	        Tab tabConfigModulos = new Tab("Configuracao dos Modulos","iconcmod.png");  

	        //vlayout principal
	        final VLayout vLayoutCMod = new VLayout();
	        
	        //formulario graduacao
	        final DynamicForm dynFormCModG = new DynamicForm();    
	        dynFormCModG.setID("dynFormCModG");  
	        dynFormCModG.setValuesManager(vm);
	        dynFormCModG.setGroupTitle("Graduacao");
	        
	        //formulario pos-graduacao
	        final DynamicForm dynFormCModPG = new DynamicForm();    
	        dynFormCModPG.setID("dynFormCModPG");  
	        dynFormCModPG.setValuesManager(vm);
	        dynFormCModPG.setGroupTitle("Pos-Graduacao");
	        
	        //formulario mestrado
	        final DynamicForm dynFormCModM = new DynamicForm();    
	        dynFormCModM.setID("dynFormCModM");  
	        dynFormCModM.setValuesManager(vm);
	        dynFormCModM.setGroupTitle("Mestrado");
	        
	        //formulario Doutorado
	        final DynamicForm dynFormCModD = new DynamicForm();    
	        dynFormCModD.setID("dynFormCModD");  
	        dynFormCModD.setValuesManager(vm);
	        dynFormCModD.setGroupTitle("Doutorado");

	        
	        
	        //itens do formulario de graduacao
	        ComboBoxItem cbItemCursosG = new ComboBoxItem();
	        cbItemCursosG.setTitle("Selecione um curso");  
	        cbItemCursosG.setType("comboBox");
	        cbItemCursosG.setValueMap("Administracao","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo"); 
	        
	        TextAreaItem txtAreaDescricaoCursoG = new TextAreaItem();    
	        txtAreaDescricaoCursoG.setTitle("Descricao do Curso");
	        txtAreaDescricaoCursoG.setHint("Escreva aqui a descricao do seu curso.");
	        
	        //add itens no formulario
	        dynFormCModG.setFields(cbItemCursosG,txtAreaDescricaoCursoG);

	        
	        
	        //itens do formulario de pos graduacao
	        ComboBoxItem cbItemCursosPG = new ComboBoxItem();
	        cbItemCursosPG.setTitle("Selecione um curso");  
	        cbItemCursosPG.setType("comboBox");
	        cbItemCursosPG.setValueMap("Administracaoo","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo"); 
	        
	        TextAreaItem txtAreaDescricaoCursoPG = new TextAreaItem();    
	        txtAreaDescricaoCursoPG.setTitle("Descricao do Curso");
	        txtAreaDescricaoCursoPG.setHint("Escreva aqui a descricao do seu curso.");
	        
	        //add itens no formulario
	        dynFormCModPG.setFields(cbItemCursosPG,txtAreaDescricaoCursoPG);
	        
	        
	        
	        //itens do formulario de mestrado
	        ComboBoxItem cbItemCursosM = new ComboBoxItem();
	        cbItemCursosM.setTitle("Selecione um curso");  
	        cbItemCursosM.setType("comboBox");
	        cbItemCursosM.setValueMap("Administracaoo","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo"); 
	        
	        TextAreaItem txtAreaDescricaoCursoM = new TextAreaItem();    
	        txtAreaDescricaoCursoM.setTitle("Descricao do Curso");
	        txtAreaDescricaoCursoM.setHint("Escreva aqui a descricao do seu curso.");
	        
	        //add itens no formulario
	        dynFormCModM.setFields(cbItemCursosM,txtAreaDescricaoCursoM);
	        
	        
	        
	        //itens do formulario de doutorado
	        ComboBoxItem cbItemCursosD = new ComboBoxItem();
	        cbItemCursosD.setTitle("Selecione um curso");  
	        cbItemCursosD.setType("comboBox");
	        cbItemCursosD.setValueMap("Administracaoo","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo"); 
	        
	        TextAreaItem txtAreaDescricaoCursoD = new TextAreaItem();    
	        txtAreaDescricaoCursoD.setTitle("Descricao do Curso");
	        txtAreaDescricaoCursoD.setHint("Escreva aqui a descricao do seu curso.");
	        
	        //add itens no formulario
	        dynFormCModD.setFields(cbItemCursosD,txtAreaDescricaoCursoD);
//opa	        
	        //criando vlayouts de G,PG,Mestrado e Doutorado
	        final VLayout vLayoutCModG = new VLayout();
	        vLayoutCModG.addMember(dynFormCModG);
	        
	        final VLayout vLayoutCModPG = new VLayout();
	        vLayoutCModPG.addMember(dynFormCModPG);
	        
	        final VLayout vLayoutCModM = new VLayout();
	        vLayoutCModM.addMember(dynFormCModM);
	        
	        final VLayout vLayoutCModD = new VLayout();
	        vLayoutCModD.addMember(dynFormCModD);
	        
	        //criando os labels para os niveis de escolaridade
	        Label labelG = new Label();  
	        labelG.setHeight(40);  
	        labelG.setPadding(10);  
	        labelG.setAlign(Alignment.CENTER);  
	        labelG.setValign(VerticalAlignment.CENTER);  
	        labelG.setWrap(false);  
	        labelG.setShowEdges(true);  
	        labelG.setContents("<b>Graduacao</b>");  
	        
	        Label labelPG = new Label();  
	        labelPG.setHeight(40);  
	        labelPG.setPadding(10);  
	        labelPG.setAlign(Alignment.CENTER);  
	        labelPG.setValign(VerticalAlignment.CENTER);  
	        labelPG.setWrap(false);  
	        labelPG.setShowEdges(true);  
	        labelPG.setContents("<b>Pos-Graduacao</b>");  
  
	        Label labelM = new Label();  
	        labelM.setHeight(40);  
	        labelM.setPadding(10);  
	        labelM.setAlign(Alignment.CENTER);  
	        labelM.setValign(VerticalAlignment.CENTER);  
	        labelM.setWrap(false);  
	        labelM.setShowEdges(true);  
	        labelM.setContents("<b>Mestrado</b>");  
	        
	        Label labelD = new Label();  
	        labelD.setHeight(40);  
	        labelD.setPadding(10);  
	        labelD.setAlign(Alignment.CENTER);  
	        labelD.setValign(VerticalAlignment.CENTER);  
	        labelD.setWrap(false);  
	        labelD.setShowEdges(true);  
	        labelD.setContents("<b>Doutorado</b>");  
          
	        
//opa
	        //hlayout dos botoes
	        HLayout hLayoutBotoesCMod = new HLayout();
	        hLayoutBotoesCMod.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveCMod = new Button("Salvar Alteracoes");
	        Button ButtonResetCMod = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesCMod.addMember(ButtonSaveCMod);
	        hLayoutBotoesCMod.addMember(ButtonResetCMod);
	        
//____________________________________________________	        

	        Button ButtonAddG = new Button("Add Curso");
	        ButtonAddG.setIcon("add.png");
	        ButtonAddG.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
				
									final DynamicForm dfCursoNovo = new DynamicForm();
									
							        FormItemIcon iconRemoverCurso = new FormItemIcon();  
							        iconRemoverCurso.setSrc("remove.png");  

							        SelectOtherItem selectOtherItem = new SelectOtherItem();  
							        selectOtherItem.setOtherTitle("Outros...");  
							        selectOtherItem.setOtherValue("OtherVal");  
							        selectOtherItem.setTitle("Selecione um curso");  
							        selectOtherItem.setValueMap("Administracao","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo");    
							        
		                            TextAreaItem txtCursoNovo = new TextAreaItem();    
		                            txtCursoNovo.setTitle("Descricao do Curso");
		                            txtCursoNovo.setHint("Escreva aqui a descricao do seu curso.");
		                            txtCursoNovo.setIcons(iconRemoverCurso);
		                            txtCursoNovo.addIconClickHandler(new IconClickHandler() {

										@Override
										public void onIconClick(IconClickEvent event) {
											
											vLayoutCModG.removeMember(dfCursoNovo);
											
										}  
		                                

		                            });  


		                            
		                            dfCursoNovo.setFields(selectOtherItem,txtCursoNovo);
		                            
		                            vLayoutCModG.addMember(dfCursoNovo);
		                            
		                            /*Canvas[] forms = vLayoutCMod.getMembers();
		                            for (int i = 0; i < forms.length; i++) {
										
		                            		Canvas canvas = forms[i];
		                            	
										Window.alert("CANVAS atual: /n/n" + canvas.toString() + "FOR numero: /n/n" + i);
										
		                            	if(canvas instanceof DynamicForm){
		                            		
		                            		 Window.alert("E uma instancia de DynForm:");
		                            		 FormItem[] fields = ((DynamicForm) canvas).getFields();
		                            		 
		                            		 for (int j = 0; j < fields.length; j++) {
		                            			
		                            			FormItem formItem = fields[j];
		                            			Window.alert("Foi 4 agora vai ver se eh check ou text");
		                            			if(formItem instanceof TextAreaItem){
		                            				Window.alert("Foi 5 eh text");
		                            				Window.alert("Eh uma TextAreaItem: " + formItem.getValue());
		                            			}else{
		                            				Window.alert("in else");
		                            				if(formItem instanceof ComboBoxItem){
		                            					Window.alert("Eh uma ComboBoxItem: " + formItem.getValue());
		                            					Window.alert("in if checkbox");
		                            				}
		                            			 } Window.alert("out else");	
		                            		}Window.alert("out for2");
		                            	}Window.alert("out if se eh dynform");
		                            	
									}
		                            
		                            /* 
		                             * pegarei os cursos usando com um for:  Canvas[] a = vlayoutG.getMembers() e FormItem[] b = a.getfields()  
		                            */
					
		                            
		                            
				}
			});


	        Button ButtonAddPG = new Button("Add Curso");
	        ButtonAddPG.setIcon("add.png");
	        ButtonAddPG.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
				
									final DynamicForm dfCursoNovo = new DynamicForm();
									
							        FormItemIcon iconRemoverCurso = new FormItemIcon();  
							        iconRemoverCurso.setSrc("remove.png");  

							        SelectOtherItem selectOtherItem = new SelectOtherItem();  
							        selectOtherItem.setOtherTitle("Outros...");  
							        selectOtherItem.setOtherValue("OtherVal");  
							        selectOtherItem.setTitle("Selecione um curso");  
							        selectOtherItem.setValueMap("Administracao","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo");    
							        
		                            TextAreaItem txtCursoNovo = new TextAreaItem();    
		                            txtCursoNovo.setTitle("Descricao do Curso");
		                            txtCursoNovo.setHint("Escreva aqui a descricao do seu curso.");
		                            txtCursoNovo.setIcons(iconRemoverCurso);
		                            txtCursoNovo.addIconClickHandler(new IconClickHandler() {

										@Override
										public void onIconClick(IconClickEvent event) {
											
											vLayoutCModPG.removeMember(dfCursoNovo);
											
										}  
		                                

		                            });  


		                            
		                            dfCursoNovo.setFields(selectOtherItem,txtCursoNovo);
		                            
		                            vLayoutCModPG.addMember(dfCursoNovo);
				}
			});
	        
	        Button ButtonAddM = new Button("Add Curso");
	        ButtonAddM.setIcon("add.png");
	        ButtonAddM.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
				
									final DynamicForm dfCursoNovo = new DynamicForm();
									
							        FormItemIcon iconRemoverCurso = new FormItemIcon();  
							        iconRemoverCurso.setSrc("remove.png");  

							        SelectOtherItem selectOtherItem = new SelectOtherItem();  
							        selectOtherItem.setOtherTitle("Outros...");  
							        selectOtherItem.setOtherValue("OtherVal");  
							        selectOtherItem.setTitle("Selecione um curso");  
							        selectOtherItem.setValueMap("Administracao","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo");    
							        
		                            TextAreaItem txtCursoNovo = new TextAreaItem();    
		                            txtCursoNovo.setTitle("Descricao do Curso");
		                            txtCursoNovo.setHint("Escreva aqui a descricao do seu curso.");
		                            txtCursoNovo.setIcons(iconRemoverCurso);
		                            txtCursoNovo.addIconClickHandler(new IconClickHandler() {

										@Override
										public void onIconClick(IconClickEvent event) {
											
											vLayoutCModM.removeMember(dfCursoNovo);
											
										}  
		                                

		                            });  


		                            
		                            dfCursoNovo.setFields(selectOtherItem,txtCursoNovo);
		                            
		                            vLayoutCModM.addMember(dfCursoNovo);
				}
			});
	        
	        Button ButtonAddD = new Button("Add Curso");
	        ButtonAddD.setIcon("add.png");
	        ButtonAddD.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
				
									final DynamicForm dfCursoNovo = new DynamicForm();
									
							        FormItemIcon iconRemoverCurso = new FormItemIcon();  
							        iconRemoverCurso.setSrc("remove.png");  

							        SelectOtherItem selectOtherItem = new SelectOtherItem();  
							        selectOtherItem.setOtherTitle("Outros...");  
							        selectOtherItem.setOtherValue("OtherVal");  
							        selectOtherItem.setTitle("Selecione um curso");  
							        selectOtherItem.setValueMap("Administracao","Ciencias Atuariais","Comunicacao Social","Desenho Industrial","Direito","Educacao Fisica","Enfermagem","Engenharia Civil","Informatica","Letras","Medicina","Nutricao","Pedagogia","Quimica","Turismo");    
							        
		                            TextAreaItem txtCursoNovo = new TextAreaItem();    
		                            txtCursoNovo.setTitle("Descricao do Curso");
		                            txtCursoNovo.setHint("Escreva aqui a descricao do seu curso.");
		                            txtCursoNovo.setIcons(iconRemoverCurso);
		                            txtCursoNovo.addIconClickHandler(new IconClickHandler() {

										@Override
										public void onIconClick(IconClickEvent event) {
											
											vLayoutCModD.removeMember(dfCursoNovo);
											
										}  
		                                

		                            });  


		                            
		                            dfCursoNovo.setFields(selectOtherItem,txtCursoNovo);
		                            
		                            vLayoutCModD.addMember(dfCursoNovo);
				}
			});
//____________________________________________________	        
	        
	        //add itens no vlayout
	        vLayoutCMod.addMember(labelG);
	        vLayoutCMod.addMember(ButtonAddG);
	        vLayoutCMod.addMember(vLayoutCModG);
	        
	        vLayoutCMod.addMember(labelPG);
	        vLayoutCMod.addMember(ButtonAddPG);
	        vLayoutCMod.addMember(vLayoutCModPG);
	        
	        vLayoutCMod.addMember(labelM);
	        vLayoutCMod.addMember(ButtonAddM);
	        vLayoutCMod.addMember(vLayoutCModM);
	        
	        vLayoutCMod.addMember(labelD);
	        vLayoutCMod.addMember(ButtonAddD);
	        vLayoutCMod.addMember(vLayoutCModD);
	        
	        vLayoutCMod.addMember(hLayoutBotoesCMod);
	        
			//add VLayout na aba CT
	        tabConfigModulos.setPane(vLayoutCMod);
	        
	        
	        
	        //nova tab
	        Tab tabFinal = new Tab("Finalizacao","iconfinal.png");  

	        //vlayout principal
	        VLayout vLayoutFinal = new VLayout();
	        
	        //label da tabFinal
	        Label labelFinal = new Label();  
	        labelFinal.setHeight(40);  
	        labelFinal.setPadding(10);  
	        labelFinal.setAlign(Alignment.CENTER);  
	        labelFinal.setValign(VerticalAlignment.CENTER);  
	        labelFinal.setWrap(false);  
	        labelFinal.setShowEdges(true);  
	        labelFinal.setContents("<b>Finalizacao do Website</b>");  
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesFinal = new HLayout();
	        hLayoutBotoesFinal.setAlign(Alignment.CENTER);  
	        
	        Button ButtonVisuFinal = new Button("Visualizar Site");
	        ButtonVisuFinal.setIcon("visualizar.png");
	        
	        Button ButtonCriaFinal = new Button("Criar Site");
	        ButtonCriaFinal.setIcon("exportar.png");
	        
	        //add botoes no hlayout
	        hLayoutBotoesFinal.addMember(ButtonVisuFinal);
	        hLayoutBotoesFinal.addMember(ButtonCriaFinal);
	        
	        //add botoes no vlayout
	        vLayoutFinal.addMember(labelFinal);
	        vLayoutFinal.addMember(hLayoutBotoesFinal);
	        
	        
	        //add VLayout na aba CT
	        tabFinal.setPane(vLayoutFinal);
	        
	        
	        //adicionando as abas no TabSet
	        tabSetPrincipal.setTabs(tabDP,tabTemplate,tabCustomTemplate,tabModulos,tabConfigModulos,tabFinal);  
	        
	        //criando vlayout principal que encapsulará a tabprincipal
	        VLayout vLayout = new VLayout();  
	        vLayout.setMembersMargin(10);  
	        vLayout.addMember(tabSetPrincipal);  
	          
	  
	 
	        //metodos que executam as acoes dos botoes
	        
	        // Método que executa a função do botão 'Guardar' tab DP
			ButtonSaveDP.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja salvar as alteracoes?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  

		                        	pagCliente.setNomeInstituicao(txtItemNomeInstituicao.getValue().toString());
		                    		pagCliente.setTituloSite(txtItemTitulo.getValue().toString());
		                    		pagCliente.setDescricaoSite(txtAreaDescricao.getValue().toString());
		                    		pagCliente.setKeywordsSite(txtItemKeyWords.getValue().toString());
		                    		pagCliente.setNotaFooterSite(txtItemFooter.getValue().toString());
		                    		pagCliente.setIconeSite(txtItemFavicon.getValue().toString());
		                    		pagCliente.setBannerSite(txtItemBanner.getValue().toString());
		                        	
		                    		SC.say("Alteracoes salvas com sucesso.");
		                    		 
		                        }  
		                    }  
		                });  
					 
				}
			});

	        // Método que executa a função do botão 'Guardar' tab Template
			ButtonSaveTemplate.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja salvar as alteracoes?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                           		                        	   
		                            SC.say("Layout salvo com sucesso.");
		                            
		                        }  
		                    }  
		                });  
					 
				}
			});

	        // Método que executa a função do botão 'Guardar' tab Custom Template
			ButtonSaveCT.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja salvar as alteracoes?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                         //TODO		                        	
		                        }  
		                    }  
		                });  
					 
				}
			});

			// Método que executa a função do botão 'Guardar' tab Modulos
			ButtonSaveMod.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja salvar as alteracoes?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                         
		                        	if(ChBoxGraduacao.getValueAsBoolean())
		                        		pagCliente.setGraduacao(1);
		                        	
		                        	if(ChBoxPos.getValueAsBoolean())
		                        		pagCliente.setPosGraduacao(1);
		                        	
		                        	if(ChBoxMestrado.getValueAsBoolean())
		                        		pagCliente.setMestrado(1);
		                        	
		                        	if(ChBoxDoutorado.getValueAsBoolean())
		                        		pagCliente.setDoutorado(1);
		                        	
		                        	if(ChBoxArquivos.getValueAsBoolean())
		                        		pagCliente.setArquivos(1);
		                        	
		                        	SC.say("Alteracoes salvas com sucesso.");
		                        	
		                        }  
		                    }  
		                });  
					 
				}
			});
			
	        // Método que executa a função do botão 'Guardar' tab Custom. Modulos
			ButtonSaveCMod.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja salvar as alteracoes?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                           
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        }  
		                    }  
		                });  
					 
				}
			});

	        // Método que executa a função do botão 'Visualizar Site' tab Final
			ButtonVisuFinal.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Confirma a visualizacao do site?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                           
		                        	Diretorio.criaPaginas();
		                        }  
		                    }  
		                });  
					 
				}
			});

			 //comeco dos metodos de reset
			
			
			// Método que executa a função do botão 'Resetar' tab DP
			ButtonResetDP.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja limpar os dados do formulario?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                              
		                            txtItemNomeInstituicao.setValue("");
		                            txtItemTitulo.setValue("");
		                            txtAreaDescricao.setValue("");
		                            txtItemKeyWords.setValue("");
		                            txtItemFooter.setValue("");
		                            txtItemFavicon.setValue("");
		                            txtItemBanner.setValue("");
		                            
		                        }  
		                    }  
		                });  
					 
				}
			});

			// Método que executa a função do botão 'Resetar' tab Template
			ButtonResetTemplate.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja limpar os dados do formulario?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  

		                            hLayoutPreVisu.removeMember(imgClassico);
		        	            	hLayoutPreVisu.removeMember(imgModerno);
		        	            	hLayoutPreVisu.removeMember(imgDark);
		        	            	hLayoutPreVisu.addMember(imgClassico);
		        	            	
		                        }
		                    }  
		                });  
					 
				}
			});
			
			// Método que executa a função do botão 'Resetar' tab Custom. Template
			ButtonResetCT.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja limpar os dados do formulario?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                            
		                            //TODO chamar metodo de resetar o form
		                        }  
		                    }  
		                });  
					 
				}
			});
			
			// Método que executa a função do botão 'Resetar' tab Modulos
			ButtonResetMod.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja limpar os dados do formulario?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                         
		                        	ChBoxGraduacao.setValue(false);
		                        	ChBoxPos.setValue(false);
		                        	ChBoxMestrado.setValue(false);
		                        	ChBoxDoutorado.setValue(false);
		                        	ChBoxArquivos.setValue(false);
		                        	
		                        }  
		                    }  
		                });  
					 
				}
			});
			
			// Método que executa a função do botão 'Resetar' tab Custom Modulos
			ButtonResetCMod.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Deseja limpar os dados do formulario?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                            
		                        	//TODO chamar metodo de resetar o form
		                        	
		                        }  
		                    }  
		                });  
					 
				}
			});
			
			// Método que executa a função do botão 'Criar Site' tab Final
			ButtonCriaFinal.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					
					 SC.ask("Confirma a criacao do site?", new BooleanCallback() {  
		                    public void execute(Boolean value) {  
		                        if (value != null && value) {  
		                        	
		                        	//Diretorio d = new Diretorio(pagCliente);
		                        	//d.cria_Diretorio();
		                        	Diretorio.criaPaginas();

		                        }  
		                    }  
		                });  
					 
				}
			});
		return vLayout;
	}
}