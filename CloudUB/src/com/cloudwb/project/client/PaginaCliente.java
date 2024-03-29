package com.cloudwb.project.client;

public class PaginaCliente {
	private String nomeInstituicao;
	private String tituloSite;
	private String bannerSite;
	private String descricaoSite;
	private String notaFooterSite;
	private String keywordsSite;
	private String iconeSite;
	private int graduacao;
	private int posGraduacao;
	private int mestrado;
	private int doutorado;
	private int arquivos;
	private int layoutSite = 1;
	private String tituloGraduacao;
	private String tituloPosGraduacao;
	private String tituloMestrado;
	private String tituloDoutorado;
	private String descricaoGraduacao;
	private String descricaoPosGraduacao;
	private String descricaoMestrado;
	private String descricaoDoutorado;
	
	PaginaCliente() {
		nomeInstituicao = new String("Nao");
		tituloSite = new String("Nao");
		bannerSite = new String("Nao");
		descricaoSite = new String("Nao");
		keywordsSite = new String("Nao");
		notaFooterSite = new String("Nao");
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nome) {
		nomeInstituicao = nome;
	}
	
	public String getTituloSite() {
		return tituloSite;
	}

	public void setTituloSite(String titulo) {
		tituloSite = titulo;
	}
	
	public String getDescricaoSite() {
		return descricaoSite;
	}

	public void setDescricaoSite(String descricao) {
		descricaoSite = descricao;
	}
	
	public String getKeywordsSite() {
		return keywordsSite;
	}

	public void setKeywordsSite(String keywords) {
		keywordsSite = keywords;
	}

	public String getBannerSite() {
		return bannerSite;
	}

	public void setBannerSite(String banner) {
		bannerSite = banner;
	}
	
	public String getNotaFooterSite() {
		return notaFooterSite;
	}

	public void setNotaFooterSite(String nota) {
		notaFooterSite = nota;
	}

	public String getIconeSite() {
		return iconeSite;
	}

	public void setIconeSite(String nomeIcone) {
		iconeSite = nomeIcone;
	}
	
	public int getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(int i) {
		graduacao = i;
	}

	public int getPosGraduacao() {
		return posGraduacao;
	}

	public void setPosGraduacao(int i) {
		posGraduacao = i;
	}

	public int getMestrado() {
		return mestrado;
	}

	public void setMestrado(int i) {
		mestrado = i;
	}

	public int getDoutorado() {
		return doutorado;
	}

	public void setDoutorado(int i) {
		doutorado = i;
	}
	
	public int getArquivos() {
		return arquivos;
	}

	public void setArquivos(int i) {
		arquivos = i;
	}

	public int getLayoutSite() {
		return layoutSite;
	}

	public void setLayoutSite(int layout) {
		layoutSite = layout;
	}
	
	public String getTituloGraduacao() {
		return tituloGraduacao;
	}

	public void setTituloGraduacao(String titulo) {
		tituloGraduacao = titulo;
	}
	
	public String getTituloPosGraduacao() {
		return tituloPosGraduacao;
	}

	public void setTituloPosGraduacao(String titulo) {
		tituloPosGraduacao = titulo;
	}
	
	public String getTituloMestrado() {
		return tituloMestrado;
	}

	public void setTituloMestrado(String titulo) {
		tituloMestrado = titulo;
	}
	
	public String getTituloDoutorado() {
		return tituloDoutorado;
	}

	public void setTituloDoutorado(String titulo) {
		tituloDoutorado = titulo;
	}
	
	public String getDescricaoGraduacao() {
		return descricaoGraduacao;
	}

	public void setDescricaoGraduacao(String descricao) {
		descricaoGraduacao = descricao;
	}
	
	public String getDescricaoPosGraduacao() {
		return descricaoPosGraduacao;
	}

	public void setDescricaoPosGraduacao(String descricao) {
		descricaoPosGraduacao = descricao;
	}
	
	public String getDescricaoMestrado() {
		return descricaoMestrado;
	}

	public void setDescricaoMestrado(String descricao) {
		descricaoMestrado = descricao;
	}
	
	public String getDescricaoDoutorado() {
		return descricaoDoutorado;
	}

	public void setDescricaoDoutorado(String descricao) {
		descricaoDoutorado = descricao;
	}	
}
