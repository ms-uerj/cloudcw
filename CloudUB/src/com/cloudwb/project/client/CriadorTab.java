package com.cloudwb.project.client;

import com.google.gwt.user.client.Window;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ImageStyle;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.ImgButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.form.fields.events.IconClickEvent;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.CheckboxItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.RadioGroupItem;
import com.smartgwt.client.widgets.form.fields.SectionItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.SelectOtherItem;
import com.smartgwt.client.widgets.form.fields.StaticTextItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.IconClickHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
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
	        //TODO olhar esse metodo align   //nao eh prioridade
	        dynFormDP.setGroupTitle("Caracteristicas Gerais do Website");
	        
	        //itens form
	        
	        FormItemIcon iconDuvida = new FormItemIcon();  
	        iconDuvida.setSrc("help.png");  
	          
	        TextItem txtItemNomeInstituicao = new TextItem();  
	        txtItemNomeInstituicao.setName("txtItemNomeInstituicao");  
	        txtItemNomeInstituicao.setTitle("<nobr>Nome da Instituicao</nobr>");
	        txtItemNomeInstituicao.setIcons(iconDuvida);
	        txtItemNomeInstituicao.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro");
					
				}  
                

            });  

	        
	        TextItem txtItemTitulo = new TextItem();  
	        txtItemTitulo.setName("txtItemTitulo");  
	        txtItemTitulo.setTitle("Titulo do Website");
	        txtItemTitulo.setIcons(iconDuvida);
	        txtItemTitulo.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro");
					
				}  
                

            });  

	        
	        TextAreaItem txtAreaDescricao = new TextAreaItem();
	        txtAreaDescricao.setName("txtAreaDescricao");  
	        txtAreaDescricao.setTitle("Descricao do Website");
	        txtAreaDescricao.setHint("Escreva aqui uma visao geral do que seu Website oferece, para que os motores de busca como Google, Bing e Yahoo possam localizar melhor o seu site.");
	          
	        TextItem txtItemKeyWords = new TextItem();  
	        txtItemKeyWords.setName("txtItemKeyWords");  
	        txtItemKeyWords.setTitle("Palavras-Chave");
	        txtItemKeyWords.setHint("Palavras relacionadas ao seu Instituto, utilizadas pelos motores de busca como Google, Bing e Yahoo para localizar seu site.");
	        
	        TextItem txtItemFooter = new TextItem();  
	        txtItemFooter.setName("txtItemFooter");  
	        txtItemFooter.setTitle("Nota do Footer");
	        txtItemFooter.setIcons(iconDuvida);  
	        txtItemFooter.addIconClickHandler(new IconClickHandler() {

				@Override
				public void onIconClick(IconClickEvent event) {
					
					SC.say("Exemplo: <br/><br/>Universidade do Estado do Rio de Janeiro - Copyright - Todos os direitos reservados 2010");
					
				}  
                

            });  

	        
	        TextItem txtItemFavicon = new TextItem();  
	        txtItemFavicon.setName("txtItemFavicon");  
	        txtItemFavicon.setTitle("Icone do Website");
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesDP = new HLayout();
	        hLayoutBotoesDP.setAlign(Alignment.CENTER);
	        
	        Button ButtonSaveDP = new Button("Salvar Alteracoes");
	        Button ButtonResetDP = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesDP.addMember(ButtonSaveDP);
	        hLayoutBotoesDP.addMember(ButtonResetDP);
	        
	        //colocando os itens no formulario
	        dynFormDP.setItems(txtItemNomeInstituicao,txtItemTitulo,txtAreaDescricao,txtItemKeyWords,txtItemFooter,txtItemFavicon);

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
	        
	        CheckboxItem ChBoxGraduacao = new CheckboxItem();  
	        ChBoxGraduacao.setName("ChBoxGraduacao");
	        ChBoxGraduacao.setWidth(115);
	        ChBoxGraduacao.setTitle("Graduacao");
	        ChBoxGraduacao.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada a Graduacao");
	        

	        CheckboxItem ChBoxPos = new CheckboxItem();  
	        ChBoxPos.setName("ChBoxPos");  
	        ChBoxPos.setWidth(115);
	        ChBoxPos.setTitle("Pos-Graduacao");
	        ChBoxPos.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada a Pos-Graduacao");

	        CheckboxItem ChBoxMestrado = new CheckboxItem();  
	        ChBoxMestrado.setName("ChBoxMestrado"); 
	        ChBoxMestrado.setWidth(115);
	        ChBoxMestrado.setTitle("Mestrado"); 
	        ChBoxMestrado.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada ao Mestrado");
	        
	        CheckboxItem ChBoxDoutorado = new CheckboxItem(); 
	        ChBoxDoutorado.setWidth(115);
	        ChBoxDoutorado.setName("ChBoxDoutorado");  
	        ChBoxDoutorado.setTitle("Doutorado");
	        ChBoxDoutorado.setHint("Esse modulo possiblita que seu site tenha uma pagina dedicada ao Doutorado");
	        
	        CheckboxItem ChBoxArquivos = new CheckboxItem();  
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
          
//TODO fazer um metodo que chame cada tab  //nao eh prioridade
	        

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
	            	
	            	//TODO mudar na pagina cliente o atributo do layuot escolhido
	            }  
	        });
	        
	        Button btnModerno = new Button("Moderno");
	        btnModerno.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	hLayoutPreVisu.removeMember(imgClassico);
	            	hLayoutPreVisu.removeMember(imgModerno);
	            	hLayoutPreVisu.removeMember(imgDark);
	            	hLayoutPreVisu.addMember(imgModerno);
	            	
	            	//TODO mudar na pagina cliente o atributo do layuot escolhido
	            }  
	        });
	        
	        Button btnDark = new Button("Dark");
	        btnDark.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	            	
	            	hLayoutPreVisu.removeMember(imgClassico);
	            	hLayoutPreVisu.removeMember(imgModerno);
	            	hLayoutPreVisu.removeMember(imgDark);
	            	hLayoutPreVisu.addMember(imgDark);
	            	
	            	//TODO mudar na pagina cliente o atributo do layuot escolhido
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de salvar informacoes na PaginaCliente
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de visualizar site
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de resetar o form
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de resetar o form
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de resetar o form
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de resetar o form
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de resetar o form
		                        } else {  
		                        	SC.say("Nao");  
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
		                            SC.say("Sim");  
		                            //TODO chamar metodo de criar site
		                        } else {  
		                        	SC.say("Nao");  
		                        }  
		                    }  
		                });  
					 
				}
			});
			
		return vLayout;
	}
}


/*	
	// Componentes dos Tabs
	private Button guardaDadosPrincButton = new Button("Guardar");
	private Button limpaDadosPrincButton = new Button("Limpar");
	private Button uploadBannerButton = new Button("Upload");
	private Button guardaModulosButton = new Button("Guardar");
	private Button limpaModulosButton = new Button("Limpar");
	private Button guardaLayoutButton = new Button("Guardar");
	private Button visualizaPaginaButton = new Button("Criar e Visualizar");
	private Button criaPaginaButton = new Button("Criar e Exportar");
	
	//encapsulando o botão de visualizar pagina dentro de um link.		
	final HTML HTMLlink_visu = new HTML("<a href='pag_cliente/home.html' target='_blank'>"+visualizaPaginaButton+"</a>");
	
	
	private TextBox caixaNomeSite = new TextBox();
	private TextBox caixaTituloSite = new TextBox();
	private TextBox caixaBannerSite = new TextBox();
	private TextArea caixaDescricaoSite = new TextArea();

	private Tree treeModulos = new Tree();
	private TreeItem treeItemGraduacao = new TreeItem("Graduacao");
	private TreeItem treeItemPosGraduacao = new TreeItem("Pos-Graduacao");
	private TreeItem treeItemMestrado = new TreeItem("Mestrado");
	private TreeItem treeItemDoutorado = new TreeItem("Doutorado");

	private TextBox txtBoxTituloGraduacao = new TextBox();
	private TextBox txtBoxTituloPosGraduacao = new TextBox();
	private TextBox txtBoxTituloMestrado = new TextBox();
	private TextBox txtBoxTituloDoutorado = new TextBox();

	private CheckBox cBoxAdicionarGraduacao = new CheckBox("Adicionar");
	private CheckBox cBoxAdicionarPosGraduacao = new CheckBox("Adicionar");
	private CheckBox cBoxAdicionarMestrado = new CheckBox("Adicionar");
	private CheckBox cBoxAdicionarDoutorado = new CheckBox("Adicionar");

	private TextArea taDescricaoGraduacao = new TextArea();
	private TextArea taDescricaoPosGraduacao = new TextArea();
	private TextArea taDescricaoMestrado = new TextArea();
	private TextArea taDescricaoDoutorado = new TextArea();

	private RadioButton radioOpc1 = new RadioButton("opcao");
	private RadioButton radioOpc2 = new RadioButton("opcao");
	private RadioButton radioOpc3 = new RadioButton("opcao");
	private RadioButton radioOpc4 = new RadioButton("opcao");

	public static PaginaCliente pagCliente = new PaginaCliente();
	public GreetingServiceAsync manipuladorServer = GWT
			.create(GreetingService.class);

	// Construtor da Classe
	public CriadorTab(final DecoratedTabPanel extTabPanel,
			final HorizontalPanel princPanel) {

		// Zera campos
		caixaNomeSite.setValue("");
		caixaTituloSite.setValue("");
		caixaBannerSite.setValue("");
		caixaDescricaoSite.setValue("");

		// Atribui funções para os botões
		// Método que executa a função do botão 'Guardar' tab Principal
		guardaDadosPrincButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				guardaDadosPrinc(extTabPanel);
			}
		});

		// Método que executa a função do botão 'Limpar' tab Principal
		limpaDadosPrincButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				limpaDadosPrinc();
			}
		});

		// Método que executa a função do botão 'Upload' tab Principal
		uploadBannerButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				uploadBanner();
			}
		});

		// Método que executa a função do botão 'Guardar' tab Módulos
		guardaModulosButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				guardaModulos(extTabPanel);
			}
		});

		// Método que executa a função do botão 'Limpar' tab Módulos
		limpaModulosButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				limpaModulos();
			}
		});

		// Método que executa a função do botão 'Guardar' tab Layout
		guardaLayoutButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				guardaLayout(extTabPanel);
			}
		});

		HTMLlink_visu.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){
				visualizaPagina();
			}
		});

		// Método que executa a função do botão 'Criar' tab Visualizar
		criaPaginaButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				//criaPagina();
				if (pagCliente.getLayoutSite() == 0){
					Window.alert("Voce ainda nao escolheu nenhum layout!");
				}
				else{
					if (pagCliente.getLayoutSite() == 3 || pagCliente.getLayoutSite() == 4){
						Window.alert("Desculpe, esse layout ainda nao esta funcionando!");
					}else{
						Diretorio.criaPaginas();
					}
					
				}								
			}
		});
	}

	// Cria Tab de Dados Principais
	public VerticalPanel criaTabPrincipal() {

		VerticalPanel vPanelPrincDados = new VerticalPanel();

		HorizontalPanel hPanelNomeSite = new HorizontalPanel();
		HorizontalPanel hPanelTituloSite = new HorizontalPanel();
		HorizontalPanel hPanelBannerSite = new HorizontalPanel();
		HorizontalPanel hPanelDescricaoSite = new HorizontalPanel();
		HorizontalPanel hPanelBottPrinc = new HorizontalPanel();
		HorizontalPanel hPanelBlank1 = new HorizontalPanel();
		HorizontalPanel hPanelBlank2 = new HorizontalPanel();
		HorizontalPanel hPanelBlank3 = new HorizontalPanel();
		HorizontalPanel hPanelBlank4 = new HorizontalPanel();
		HorizontalPanel hPanelBlank5 = new HorizontalPanel();

		HTML pulaLinha1 = new HTML("<br>");
		HTML pulaLinha2 = new HTML("<br>");
		HTML pulaLinha3 = new HTML("<br>");
		HTML pulaLinha4 = new HTML("<br>");
		HTML pulaLinha5 = new HTML("<br>");
		Label chamadaPrincLabel = new Label("Informacoes gerais sobre o site");
		Label tituloSiteLabel = new Label("Titulo:  ");
		Label bannerSiteLabel = new Label("Banner:  ");
		Label descricaoSiteLabel = new Label("Descricao:  ");
		Label nomeSite = new Label("Nome do Site:  ");

		hPanelNomeSite.add(nomeSite);
		hPanelNomeSite.add(caixaNomeSite);		
		
		hPanelTituloSite.add(tituloSiteLabel);
		hPanelTituloSite.add(caixaTituloSite);

		hPanelDescricaoSite.add(descricaoSiteLabel);
		caixaDescricaoSite.setPixelSize(300, 100);
		hPanelDescricaoSite.add(caixaDescricaoSite);
		
		hPanelBannerSite.add(bannerSiteLabel);
		hPanelBannerSite.add(caixaBannerSite);
		hPanelBannerSite.add(uploadBannerButton);		

		hPanelBottPrinc.add(guardaDadosPrincButton);
		hPanelBottPrinc.add(limpaDadosPrincButton);
		
		hPanelBlank1.add(pulaLinha1);
		hPanelBlank2.add(pulaLinha2);
		hPanelBlank3.add(pulaLinha3);
		hPanelBlank4.add(pulaLinha4);
		hPanelBlank5.add(pulaLinha5);

		vPanelPrincDados.add(chamadaPrincLabel);
		vPanelPrincDados.add(hPanelBlank1);
		vPanelPrincDados.add(hPanelNomeSite);
		vPanelPrincDados.add(hPanelBlank2);
		vPanelPrincDados.add(hPanelTituloSite);
		vPanelPrincDados.add(hPanelBlank3);
		vPanelPrincDados.add(hPanelDescricaoSite);
		vPanelPrincDados.add(hPanelBlank4);
		vPanelPrincDados.add(hPanelBannerSite);
		vPanelPrincDados.add(hPanelBlank5);
		vPanelPrincDados.add(hPanelBottPrinc);

		return vPanelPrincDados;
	}

	// Cria Tab de Módulos
	public VerticalPanel criaTabModulo() {

		VerticalPanel vPanelModulo = new VerticalPanel();

		HorizontalPanel hPanelGraduacao = new HorizontalPanel();
		HorizontalPanel hPanelButtMod = new HorizontalPanel();

		HorizontalPanel hPanelTituloGraduacao = new HorizontalPanel();
		HorizontalPanel hPanelTituloPosGraduacao = new HorizontalPanel();
		HorizontalPanel hPanelTituloMestrado = new HorizontalPanel();
		HorizontalPanel hPanelTituloDoutorado = new HorizontalPanel();

		HorizontalPanel hPanelDescricaoGraduacao = new HorizontalPanel();
		HorizontalPanel hPanelDescricaoPosGraduacao = new HorizontalPanel();
		HorizontalPanel hPanelDescricaoMestrado = new HorizontalPanel();
		HorizontalPanel hPanelDescricaoDoutorado = new HorizontalPanel();

		HTML hTMLChamadaMod = new HTML("Formulario para a escolha dos modulos");
		HTML hTMLChamadaOpcao = new HTML("<P>Opcoes de modulos:</P>");

		HTML htmlTituloGraduacao = new HTML("Titulo: ");
		HTML htmlTituloPosGraduacao = new HTML("Titulo: ");
		HTML htmlTituloMestrado = new HTML("Titulo: ");
		HTML htmlTituloDoutorado = new HTML("Titulo: ");

		HTML htmlDescricaoGraduacao = new HTML("Descricao: <BR>");
		HTML htmlDescricaoPosGraduacao = new HTML("Descricao: <BR>");
		HTML htmlDescricaoMestrado = new HTML("Descricao: <BR>");
		HTML htmlDescricaoDoutorado = new HTML("Descricao: <BR>");

		hPanelTituloGraduacao.add(htmlTituloGraduacao);
		hPanelTituloGraduacao.add(txtBoxTituloGraduacao);

		hPanelTituloPosGraduacao.add(htmlTituloPosGraduacao);
		hPanelTituloPosGraduacao.add(txtBoxTituloPosGraduacao);

		hPanelTituloMestrado.add(htmlTituloMestrado);
		hPanelTituloMestrado.add(txtBoxTituloMestrado);

		hPanelTituloDoutorado.add(htmlTituloDoutorado);
		hPanelTituloDoutorado.add(txtBoxTituloDoutorado);

		hPanelDescricaoGraduacao.add(htmlDescricaoGraduacao);
		hPanelDescricaoGraduacao.add(taDescricaoGraduacao);

		hPanelDescricaoPosGraduacao.add(htmlDescricaoPosGraduacao);
		hPanelDescricaoPosGraduacao.add(taDescricaoPosGraduacao);

		hPanelDescricaoMestrado.add(htmlDescricaoMestrado);
		hPanelDescricaoMestrado.add(taDescricaoMestrado);

		hPanelDescricaoDoutorado.add(htmlDescricaoDoutorado);
		hPanelDescricaoDoutorado.add(taDescricaoDoutorado);

		taDescricaoGraduacao.setPixelSize(300, 100);
		taDescricaoPosGraduacao.setPixelSize(300, 100);
		taDescricaoMestrado.setPixelSize(300, 100);
		taDescricaoDoutorado.setPixelSize(300, 100);

		treeItemGraduacao.addItem(hPanelTituloGraduacao);
		treeItemGraduacao.addItem(hPanelDescricaoGraduacao);
		treeItemGraduacao.addItem(cBoxAdicionarGraduacao);

		treeItemPosGraduacao.addItem(hPanelTituloPosGraduacao);
		treeItemPosGraduacao.addItem(hPanelDescricaoPosGraduacao);
		treeItemPosGraduacao.addItem(cBoxAdicionarPosGraduacao);

		treeItemMestrado.addItem(hPanelTituloMestrado);
		treeItemMestrado.addItem(hPanelDescricaoMestrado);
		treeItemMestrado.addItem(cBoxAdicionarMestrado);

		treeItemDoutorado.addItem(hPanelTituloDoutorado);
		treeItemDoutorado.addItem(hPanelDescricaoDoutorado);
		treeItemDoutorado.addItem(cBoxAdicionarDoutorado);

		treeModulos.addItem(treeItemGraduacao);
		treeModulos.addItem(treeItemPosGraduacao);
		treeModulos.addItem(treeItemMestrado);
		treeModulos.addItem(treeItemDoutorado);

		hPanelGraduacao.add(treeModulos);

		hPanelButtMod.add(guardaModulosButton);
		hPanelButtMod.add(limpaModulosButton);

		vPanelModulo.add(hTMLChamadaMod);
		vPanelModulo.add(hTMLChamadaOpcao);
		vPanelModulo.add(hPanelGraduacao);
		vPanelModulo.add(hPanelButtMod);

		return vPanelModulo;
	}

	// Cria Tab de Layout
	public VerticalPanel criaTabLayout() {

		VerticalPanel vPanelLayout = new VerticalPanel();

		HorizontalPanel hPanelOpcao1 = new HorizontalPanel();
		HorizontalPanel hPanelOpcao2 = new HorizontalPanel();
		HorizontalPanel hPanelOpcao3 = new HorizontalPanel();
		HorizontalPanel hPanelOpcao4 = new HorizontalPanel();
		HorizontalPanel hPanelUP = new HorizontalPanel();
		HorizontalPanel hPanelDOWN = new HorizontalPanel();
		HorizontalPanel hPanelButtLay = new HorizontalPanel();

		HTML hTMLChamadaLayout = new HTML("Escolha o Layout das paginas:<br>");
		HTML hTMLChamadaOpcLay = new HTML("<P>Opcoes de layout:</P>");
		HTML hTMLImagemOp1 = new HTML(
				"&nbsp<IMG SRC='images/estrutura1.gif'> &nbsp&nbsp&nbsp&nbsp</P>");
		HTML hTMLImagemOp2 = new HTML(
				"&nbsp<IMG SRC='images/estrutura2.gif'> </P>");
		HTML hTMLImagemOp3 = new HTML(
				"&nbsp<IMG SRC='images/estrutura3.gif'> &nbsp&nbsp&nbsp&nbsp</P>");
		HTML hTMLImagemOp4 = new HTML(
				"&nbsp<IMG SRC='images/estrutura4.gif'> </P>");

		hPanelOpcao1.add(radioOpc1);
		hPanelOpcao1.add(hTMLImagemOp1);

		hPanelOpcao2.add(radioOpc2);
		hPanelOpcao2.add(hTMLImagemOp2);

		hPanelUP.add(hPanelOpcao1);
		hPanelUP.add(hPanelOpcao2);

		hPanelOpcao3.add(radioOpc3);
		hPanelOpcao3.add(hTMLImagemOp3);

		hPanelOpcao4.add(radioOpc4);
		hPanelOpcao4.add(hTMLImagemOp4);

		hPanelDOWN.add(hPanelOpcao3);
		hPanelDOWN.add(hPanelOpcao4);

		hPanelButtLay.add(guardaLayoutButton);

		vPanelLayout.add(hTMLChamadaLayout);
		vPanelLayout.add(hTMLChamadaOpcLay);
		vPanelLayout.add(hPanelUP);
		vPanelLayout.add(hPanelDOWN);
		vPanelLayout.add(hPanelButtLay);

		return vPanelLayout;
	}

	// Cria Tab de finalização
	public VerticalPanel criaTabFinal() {

		VerticalPanel vPanelVisual = new VerticalPanel();

		HorizontalPanel HPanelChamadaVisu = new HorizontalPanel();
		HorizontalPanel HPanelButtVisu = new HorizontalPanel();

		HTML HTMLChamadaVisu = new HTML("<P>Finalizando o projeto:</P>");

		HPanelChamadaVisu.add(HTMLChamadaVisu);
		HPanelButtVisu.add(HTMLlink_visu);
		HPanelButtVisu.add(criaPaginaButton);

		vPanelVisual.add(HPanelChamadaVisu);
		vPanelVisual.add(HPanelButtVisu);

		return vPanelVisual;
	}

	// metodos que executam as ações chamadas pelos botões 

	@SuppressWarnings("deprecation")
	private void guardaDadosPrinc(DecoratedTabPanel tabPanel) {
		pagCliente.setNomeSite(caixaNomeSite.getValue().toString());
		pagCliente.setTituloSite(caixaTituloSite.getValue());
		pagCliente.setBannerSite(caixaBannerSite.getValue());
		pagCliente.setDescricaoSite(caixaDescricaoSite.getValue());
		tabPanel.selectTab(1);
	}

	private void limpaDadosPrinc() {
		caixaNomeSite.setValue("");
		pagCliente.setNomeSite("Nao");

		caixaTituloSite.setValue("");
		pagCliente.setTituloSite("Nao");
		
		caixaDescricaoSite.setValue("");
		pagCliente.setDescricaoSite("Nao");

		caixaBannerSite.setValue("");
		pagCliente.setBannerSite("Nao");
	}

	private void uploadBanner() {
		Window.alert("Buscando Banner");
	}
	
	
	@SuppressWarnings("deprecation")
	private void guardaModulos(DecoratedTabPanel tabPanel) {
		
		int verificadorModulo = 0;

		if (cBoxAdicionarGraduacao.getValue() == true) {
			pagCliente.setGraduacao(1);
			pagCliente.setTituloGraduacao(txtBoxTituloGraduacao.getValue());
			pagCliente.setDescricaoGraduacao(taDescricaoGraduacao.getValue());
			verificadorModulo = 1;
		} else {
			pagCliente.setGraduacao(0);
			pagCliente.setTituloGraduacao(null);
			pagCliente.setDescricaoGraduacao(null);
		}

		if (cBoxAdicionarPosGraduacao.getValue() == true) {
			pagCliente.setPosGraduacao(1);
			pagCliente.setTituloPosGraduacao(txtBoxTituloPosGraduacao
					.getValue());
			pagCliente.setDescricaoPosGraduacao(taDescricaoPosGraduacao
					.getValue());
			verificadorModulo = 1;
		} else {
			pagCliente.setPosGraduacao(0);
			pagCliente.setTituloPosGraduacao(null);
			pagCliente.setDescricaoPosGraduacao(null);
		}

		if (cBoxAdicionarMestrado.getValue() == true) {
			pagCliente.setMestrado(1);
			pagCliente.setTituloMestrado(txtBoxTituloMestrado.getValue());
			pagCliente.setDescricaoMestrado(taDescricaoMestrado.getValue());
			verificadorModulo = 1;
		} else {
			pagCliente.setMestrado(0);
			pagCliente.setTituloMestrado(null);
			pagCliente.setDescricaoMestrado(null);
		}

		if (cBoxAdicionarDoutorado.getValue() == true) {
			pagCliente.setDoutorado(1);
			pagCliente.setTituloDoutorado(txtBoxTituloDoutorado.getValue());
			pagCliente.setDescricaoDoutorado(taDescricaoDoutorado.getValue());
			verificadorModulo = 1;
		} else {
			pagCliente.setDoutorado(0);
			pagCliente.setTituloDoutorado(null);
			pagCliente.setDescricaoDoutorado(null);
		}

		if (verificadorModulo == 0) {
			Window.alert("Escolha os Modulos!");
		} else {
			tabPanel.selectTab(2);
		}
	}

	private void limpaModulos() {

		cBoxAdicionarGraduacao.setValue(false);
		txtBoxTituloGraduacao.setValue(null);
		taDescricaoGraduacao.setValue(null);

		cBoxAdicionarPosGraduacao.setValue(false);
		txtBoxTituloPosGraduacao.setValue(null);
		taDescricaoPosGraduacao.setValue(null);


		cBoxAdicionarMestrado.setValue(false);
		txtBoxTituloMestrado.setValue(null);
		taDescricaoMestrado.setValue(null);

		cBoxAdicionarDoutorado.setValue(false);
		txtBoxTituloDoutorado.setValue(null);
		taDescricaoDoutorado.setValue(null);

		pagCliente.setGraduacao(0);
		pagCliente.setPosGraduacao(0);
		pagCliente.setMestrado(0);
		pagCliente.setDoutorado(0);
	}

	@SuppressWarnings("deprecation")
	private void guardaLayout(DecoratedTabPanel tabPanel) {
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

	private void visualizaPagina() {
		String dados = new String(
				"Nome do Site: "
						+ pagCliente.getNomeSite()
						+ "\nTitulo da Pagina: "
						+ pagCliente.getTituloSite()
						+ "\nBanner: "
						+ pagCliente.getBannerSite()
						+ "\n\nGraduacao: "
						+ ((pagCliente.getGraduacao() == 1) ? ("Sim\n  Titulo: "
								+ pagCliente.getTituloGraduacao()
								+ "\n  Descricao:\n" + pagCliente
								.getDescricaoGraduacao()) : "Nao")
						+ "\n\nPos-Graduacao: "
						+ ((pagCliente.getPosGraduacao() == 1) ? ("Sim\n  Titulo: "
								+ pagCliente.getTituloPosGraduacao()
								+ "\n  Descricao:\n" + pagCliente
								.getDescricaoPosGraduacao()) : "Nao")
						+ "\n\nMestrado: "
						+ ((pagCliente.getMestrado() == 1) ? ("Sim\n  Titulo: "
								+ pagCliente.getTituloMestrado()
								+ "\n  Descricao:\n" + pagCliente
								.getDescricaoMestrado()) : "Nao")
						+ "\n\nDoutorado: "
						+ ((pagCliente.getDoutorado() == 1) ? ("Sim\n  Titulo: "
								+ pagCliente.getTituloDoutorado()
								+ "\n  Descricao:\n" + pagCliente
								.getDescricaoDoutorado()) : "Nao")
						+ "\n\nLayout num: " + pagCliente.getLayoutSite());
		
		Window.alert(dados);
		
		Diretorio diretorio = new Diretorio(pagCliente);
		diretorio.cria_Diretorio();
	}

	/*private void criaPagina() {

		Diretorio diretorio = new Diretorio(pagCliente);
		diretorio.cria_Diretorio();

		Compactador comp = new Compactador();
		comp.compactar("pagina_cliente.rar");
		
		Window.alert("Pagina criada!");*/

		
				
		/*
		 * if (manipuladorServer == null) { manipuladorServer =
		 * GWT.create(GreetingService.class); } AsyncCallback<String> callback =
		 * new AsyncCallback<String>() {
		 * 
		 * @Override public void onFailure(Throwable caught) { }
		 * 
		 * @Override public void onSuccess(String result) { }
		 * 
		 * }; manipuladorServer.greetServer(null, callback);
*/
