package com.cloudwb.project.client;

// Bibliotecas
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
//import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CriadorTab {

	// Componentes dos Tabs
	private Button guardaDadosPrincButton = new Button("Guardar");
	private Button limpaDadosPrincButton = new Button("Limpar");
	private Button uploadBannerButton = new Button("Upload");
	private Button guardaModulosButton = new Button("Guardar");
	private Button limpaModulosButton = new Button("Limpar");
	private Button guardaLayoutButton = new Button("Guardar");
	private Button visualizaPaginaButton = new Button("Visualizar");
	private Button criaPaginaButton = new Button("Criar");

	private TextBox caixaNomeSite = new TextBox();
	private TextBox caixaTituloSite = new TextBox();
	private TextBox caixaBannerSite = new TextBox();

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

	public PaginaCliente pagCliente = new PaginaCliente();
	public GreetingServiceAsync manipuladorServer = GWT
			.create(GreetingService.class);

	// Construtor da Classe
	public CriadorTab(final DecoratedTabPanel extTabPanel,
			final HorizontalPanel princPanel) {

		// Zera campos
		caixaNomeSite.setValue("");
		caixaTituloSite.setValue("");
		caixaBannerSite.setValue("");

		/* Atribui funções para os botões */
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

		// Método que executa a função do botão 'Visualizar' tab Visualizar
		visualizaPaginaButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				visualizaPagina();
			}
		});

		// Método que executa a função do botão 'Criar' tab Visualizar
		criaPaginaButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				criaPagina();
			}
		});
	}

	// Cria Tab de Dados Principais
	public VerticalPanel criaTabPrincipal() {

		VerticalPanel vPanelPrincDados = new VerticalPanel();

		HorizontalPanel hPanelNomeSite = new HorizontalPanel();
		HorizontalPanel hPanelTituloSite = new HorizontalPanel();
		HorizontalPanel hPanelBannerSite = new HorizontalPanel();
		HorizontalPanel hPanelBottPrinc = new HorizontalPanel();

		HTML hTMLChamadaPrinc = new HTML("Informacoes gerais sobre o site<br>");
		HTML hTMLNomeSite = new HTML("<P>Nome do Site:");
		HTML hTMLTituloSite = new HTML("<P>Titulo: ");
		HTML hTMLBannerSite = new HTML("<P>Banner: ");

		hPanelNomeSite.add(hTMLNomeSite);
		hPanelNomeSite.add(caixaNomeSite);

		hPanelTituloSite.add(hTMLTituloSite);
		hPanelTituloSite.add(caixaTituloSite);

		hPanelBannerSite.add(hTMLBannerSite);
		hPanelBannerSite.add(caixaBannerSite);
		hPanelBannerSite.add(uploadBannerButton);

		hPanelBottPrinc.add(guardaDadosPrincButton);
		hPanelBottPrinc.add(limpaDadosPrincButton);

		vPanelPrincDados.add(hTMLChamadaPrinc);
		vPanelPrincDados.add(hPanelNomeSite);
		vPanelPrincDados.add(hPanelTituloSite);
		vPanelPrincDados.add(hPanelBannerSite);
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
		HPanelButtVisu.add(visualizaPaginaButton);
		HPanelButtVisu.add(criaPaginaButton);

		vPanelVisual.add(HPanelChamadaVisu);
		vPanelVisual.add(HPanelButtVisu);

		return vPanelVisual;
	}

	/* metodos que executam as ações chamadas pelos botões */

	private void guardaDadosPrinc(DecoratedTabPanel tabPanel) {
		pagCliente.setNomeSite(caixaNomeSite.getValue());
		pagCliente.setTituloSite(caixaTituloSite.getValue());
		pagCliente.setBannerSite(caixaBannerSite.getValue());
		tabPanel.selectTab(1);
	}

	private void limpaDadosPrinc() {
		caixaNomeSite.setValue("");
		pagCliente.setNomeSite("Nao");

		caixaTituloSite.setValue("");
		pagCliente.setTituloSite("Nao");

		caixaBannerSite.setValue("");
		pagCliente.setBannerSite("Nao");
	}

	private void uploadBanner() {
		Window.alert("Buscando Banner");
	}

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
	}

	private void criaPagina() {

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

	}

}
