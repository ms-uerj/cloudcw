package com.cloudwb.project.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;




import com.google.gwt.user.client.ui.FileUpload;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ImageStyle;
import com.smartgwt.client.types.MultipleAppearance;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.ImgButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.ValuesManager;
import com.smartgwt.client.widgets.form.fields.CheckboxItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.FormItemIcon;
import com.smartgwt.client.widgets.form.fields.RadioGroupItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
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
	        Tab tabDP = new Tab();  
	        tabDP.setTitle("Dados Principais");  
	          
	        //form
	        final DynamicForm dynFormDP = new DynamicForm();  
	        dynFormDP.setID("dynFormDP");  
	        dynFormDP.setValuesManager(vm);
	        dynFormDP.setIsGroup(true);
	        //dynFormDP.setAlign();							
	        //TODO olhar esse metodo align   //nao eh prioridade
	        dynFormDP.setGroupTitle("Caracteristicas Gerais do Website");
	        
	        //itens form
	        
	        FormItemIcon iconDuvida = new FormItemIcon();  
	        iconDuvida.setSrc("help.png");  
	          
	        TextItem txtItemNomeInstituicao = new TextItem();  
	        txtItemNomeInstituicao.setName("txtItemNomeInstituicao");  
	        txtItemNomeInstituicao.setTitle("<nobr>Nome da Instituicao</nobr>");
	        txtItemNomeInstituicao.setIcons(iconDuvida);
	        
	        TextItem txtItemTitulo = new TextItem();  
	        txtItemTitulo.setName("txtItemTitulo");  
	        txtItemTitulo.setTitle("Titulo do Website");
	        txtItemTitulo.setIcons(iconDuvida);

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
	        
	        TextItem txtItemFavicon = new TextItem();  
	        txtItemFavicon.setName("txtItemFavicon");  
	        txtItemFavicon.setTitle("Icone do Website");
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesDP = new HLayout();
	        
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
	        Tab tabModulos = new Tab();  
	        tabModulos.setTitle("Modulos");  
	        
	        VLayout vLayoutMod = new VLayout();

	        //form Modulos
	        final DynamicForm dynFormMod = new DynamicForm();  
	        dynFormMod.setID("dynFormMod");  
	        dynFormMod.setValuesManager(vm);
	        dynFormMod.setIsGroup(true);
	        dynFormMod.setWidth(570);
	        dynFormMod.setGroupTitle("Configuracao / Escolha dos Modulos");
	        	        
	        //itens form Modulos
	        FormItemIcon iconMessage = new FormItemIcon();  
	        iconMessage.setSrc("message.png");  
	        
	        
	        CheckboxItem ChBoxGraduacao = new CheckboxItem();  
	        ChBoxGraduacao.setName("ChBoxGraduacao"); 
	        ChBoxGraduacao.setTitle("Graduacao");
	        ChBoxGraduacao.setIcons(iconMessage);
	        ChBoxGraduacao.setHint("<nobr>Esse modulo possiblita que seu site tenha uma pagina</nobr> dedicada a Graduacao");
	        

	        CheckboxItem ChBoxPos = new CheckboxItem();  
	        ChBoxPos.setName("ChBoxPos");  
	        ChBoxPos.setTitle("Pos-Graduacao");  
	        ChBoxPos.setIcons(iconMessage);
	        ChBoxPos.setHint("<nobr>Esse modulo possiblita que seu site tenha uma pagina</nobr> dedicada a Pos-Graduacao");

	        CheckboxItem ChBoxMestrado = new CheckboxItem();  
	        ChBoxMestrado.setName("ChBoxMestrado");  
	        ChBoxMestrado.setTitle("Mestrado"); 
	        ChBoxMestrado.setIcons(iconMessage);
	        ChBoxMestrado.setHint("<nobr>Esse modulo possiblita que seu site tenha uma pagina</nobr> dedicada ao Mestrado");
	        
	        CheckboxItem ChBoxDoutorado = new CheckboxItem();  
	        ChBoxDoutorado.setName("ChBoxDoutorado");  
	        ChBoxDoutorado.setTitle("Doutorado");
	        ChBoxDoutorado.setIcons(iconMessage);
	        ChBoxDoutorado.setHint("<nobr>Esse modulo possiblita que seu site tenha uma pagina</nobr> dedicada ao Doutorado");
	        
	        CheckboxItem ChBoxArquivos = new CheckboxItem();  
	        ChBoxArquivos.setName("ChBoxAraquivos");  
	        ChBoxArquivos.setTitle("Arquivos");
	        ChBoxArquivos.setIcons(iconMessage);
	        ChBoxArquivos.setHint("<nobr>Nesse modulo ficarao disponiveis para download os arquivos</nobr> relacionados ao seu Instituto, como por exemplo, teses e artigos");

// other controls-> dialog	        
	        
	        //adicionando os itens no formulario
	        dynFormMod.setFields(ChBoxGraduacao,ChBoxPos,ChBoxMestrado,ChBoxDoutorado,ChBoxArquivos);
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesMod = new HLayout();
	        
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
//TODO colocar um icone para cada aba      //nao eh prioridade
	        
	        
	        //nova tab
	        Tab tabTemplate = new Tab();  
	        tabTemplate.setTitle("Template");
	        
	        //criacao de dois VLayouts para comportar a parte de cima e a de baixo da aba
	        VLayout vLayoutTemplate1 = new VLayout();
	        vLayoutTemplate1.setWidth(590);
	        
	        //criando componentes do VlayoutTemplate1
	        final DynamicForm dynFormTemplate = new DynamicForm();  
	        dynFormTemplate.setID("dynFormTemplate");  
	        dynFormTemplate.setValuesManager(vm);
	        dynFormTemplate.setIsGroup(true);
	        dynFormTemplate.setWidth(590);
	        dynFormTemplate.setGroupTitle("Selecione um dos templates na lista abaixo ou crie seu proprio template");
	        
	        RadioGroupItem radioTemplate = new RadioGroupItem();  
	        radioTemplate.setTitle("");
	        radioTemplate.setValueMap("Template Personalizado", "Template Padrao");
	        
	        ComboBoxItem cbItemTemplate = new ComboBoxItem();  
	        cbItemTemplate.setTitle("Template");    
	        cbItemTemplate.setType("comboBox");  
	        cbItemTemplate.setValueMap("Classico", "Moderno", "Dark"); 
	        
	        //add os itens no formulario1
	        dynFormTemplate.setFields(radioTemplate,cbItemTemplate);    
	        
	        //criando o formulario2
	        final DynamicForm dynFormTemplate2 = new DynamicForm();  
	        dynFormTemplate2.setID("dynFormTemplate2");  
	        dynFormTemplate2.setValuesManager(vm);
	        dynFormTemplate2.setIsGroup(true);
	        dynFormTemplate2.setHeight(240);
	        dynFormTemplate2.setWidth(340);
	        dynFormTemplate2.setGroupTitle("Pre-Visualizacao");
	        
	        Canvas canvas1 = new Canvas();
	        
	        String caminho1 = "Crysis.jpg";  
	        Img imgPre = new Img(caminho1, 320, 240);  
	        imgPre.setImageType(ImageStyle.STRETCH);  
	        imgPre.setBorder("1px solid gray");  
	        imgPre.setLeft(10);
	        imgPre.setTop(10);
	        
	        canvas1.addChild(imgPre);
	        
	        //add img ao formulario2
	        dynFormTemplate2.addChild(canvas1);

	        //criando o formulario3
	        final DynamicForm dynFormTemplate3 = new DynamicForm();  
	        dynFormTemplate3.setID("dynFormTemplate3");  
	        dynFormTemplate3.setValuesManager(vm);
	        dynFormTemplate3.setIsGroup(true);
	        dynFormTemplate3.setWidth(590);
	        dynFormTemplate3.setGroupTitle("Cores");
	        
	        //criando itens do form3
	        RadioGroupItem radioTemplateCores = new RadioGroupItem();  
	        radioTemplateCores.setTitle("Escolha uma cor");
	        radioTemplateCores.setValueMap("Preto","Branco","Cinza");
	        
	        //add itens ao form3
	        dynFormTemplate3.setFields(radioTemplateCores);
	       
	        //hlayout dos botoes
	        HLayout hLayoutBotoesTemplate = new HLayout();
	        
	        Button ButtonSaveTemplate = new Button("Salvar Alteracoes");
	        Button ButtonResetTemplate = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesTemplate.addMember(ButtonSaveTemplate);
	        hLayoutBotoesTemplate.addMember(ButtonResetTemplate);

	        //add formulario, formulario2 e formulario3 e hLayout no VLayout
	        vLayoutTemplate1.addMember(dynFormTemplate);
	        vLayoutTemplate1.addMember(dynFormTemplate2);
	        vLayoutTemplate1.addMember(dynFormTemplate3);
	        vLayoutTemplate1.addMember(hLayoutBotoesTemplate);
	        
	        //add o VLayoutTemplate na aba template
	        tabTemplate.setPane(vLayoutTemplate1);


	        
	        
	        //nova tab
	        Tab tabCustomTemplate = new Tab();  
	        tabCustomTemplate.setTitle("Customizacao do Template");

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
	        String caminho2 = "Crysis.jpg";  
	        Img imgCT = new Img(caminho2, 280, 210);  
	        imgCT.setImageType(ImageStyle.STRETCH);  
	        imgCT.setBorder("1px solid gray");  
	        imgCT.setLeft(10);
	        imgCT.setTop(30);
	        canvasCT.addChild(imgCT);
	        
	        final Canvas canvas2 = new Canvas();
        	String caminho3 = "roxo.jpg";
        	final Img imgCT1 = new Img(caminho3, 280, 210);  
	        imgCT1.setImageType(ImageStyle.STRETCH);  
	        imgCT1.setBorder("1px solid gray");  
	        imgCT1.setLeft(10);
	        imgCT1.setTop(30);
	        canvas2.addChild(imgCT1);

	        final Canvas canvas3 = new Canvas();
        	String caminho4 = "Crysis.jpg";
        	final Img imgCT2 = new Img(caminho4, 280, 210);  
	        imgCT2.setImageType(ImageStyle.STRETCH);  
	        imgCT2.setBorder("1px solid gray");  
	        imgCT2.setLeft(10);
	        imgCT2.setTop(30);
	        canvas3.addChild(imgCT2);

	        final Canvas canvas4 = new Canvas();
        	String caminho5 = "roxo.jpg";
        	final Img imgCT3 = new Img(caminho5, 280, 210);  
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
	        HLayoutCTBotoes.addMember(bHeader);
	        HLayoutCTBotoes.addMember(bCenter);
	        HLayoutCTBotoes.addMember(bCenterLeft);
	        HLayoutCTBotoes.addMember(bFooter);
	        
	        //add HLayout no VLayout
	        vLayoutCT.addMember(HLayoutCTBotoes);

	        //hlayout dos botoes
	        HLayout hLayoutBotoesCT2 = new HLayout();
	        
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
	        Tab tabConfigModulos = new Tab();  
	        tabConfigModulos.setTitle("Configuracao dos Modulos");

	        //vlayout principal
	        VLayout vLayoutCMod = new VLayout();
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesCMod = new HLayout();
	        
	        Button ButtonSaveCMod = new Button("Salvar Alteracoes");
	        Button ButtonResetCMod = new Button("Reset");
	        
	        //add botoes no hlayout
	        hLayoutBotoesCMod.addMember(ButtonSaveCMod);
	        hLayoutBotoesCMod.addMember(ButtonResetCMod);
	        
	        //add botoes no vlayout
	        vLayoutCMod.addMember(hLayoutBotoesCMod);
	        
	        //add VLayout na aba CT
	        tabConfigModulos.setPane(vLayoutCMod);

	        
	        //nova tab
	        Tab tabFinal = new Tab();  
	        tabFinal.setTitle("Finalizacao");

	        //vlayout principal
	        VLayout vLayoutFinal = new VLayout();
	        
	        //hlayout dos botoes
	        HLayout hLayoutBotoesFinal = new HLayout();
	        
	        Button ButtonVisuFinal = new Button("Visualizar Site");
	        Button ButtonCriaFinal = new Button("Criar Site");
	        
	        //add botoes no hlayout
	        hLayoutBotoesFinal.addMember(ButtonVisuFinal);
	        hLayoutBotoesFinal.addMember(ButtonCriaFinal);
	        
	        //add botoes no vlayout
	        vLayoutFinal.addMember(hLayoutBotoesFinal);
	        
	        //add VLayout na aba CT
	        tabFinal.setPane(vLayoutFinal);
	        
	        
	        //adicionando as abas no TabSet
	        tabSetPrincipal.setTabs(tabDP,tabTemplate,tabCustomTemplate,tabModulos,tabConfigModulos,tabFinal);  
	        
	        
	        IButton submit = new IButton();  
	        submit.setTitle("Submit");  
	        submit.addClickHandler(new ClickHandler() {  
	            public void onClick(ClickEvent event) {  
	                vm.validate();  
	                if (dynFormDP.hasErrors()) {  
	                    tabSetPrincipal.selectTab(1);  
	                } else {  
	                    tabSetPrincipal.selectTab(0);  
	                }  
	            }  
	        });  
	          
	        VLayout vLayout = new VLayout();  
	        vLayout.setMembersMargin(10);  
	        vLayout.addMember(tabSetPrincipal);  
	        vLayout.addMember(submit);  
	  
	 
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


