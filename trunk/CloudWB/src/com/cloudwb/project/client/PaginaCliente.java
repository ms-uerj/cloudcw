package com.cloudwb.project.client;

public class PaginaCliente {
	private String nomeSite;
	private String tituloSite;
	private String bannerSite;
	private int graduacao;
	private int posGraduacao;
	private int mestrado;
	private int doutorado;
	private int layoutSite;

	PaginaCliente() {
		nomeSite = new String("Nao");
		tituloSite = new String("Nao");
		bannerSite = new String("Nao");
	}

	public String getNomeSite() {
		return nomeSite;
	}

	public void setNomeSite(String nome) {
		nomeSite = nome;
	}

	public String getTituloSite() {
		return tituloSite;
	}

	public void setTituloSite(String titulo) {
		tituloSite = titulo;
	}

	public String getBannerSite() {
		return bannerSite;
	}

	public void setBannerSite(String banner) {
		bannerSite = banner;
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

	public int getLayoutSite() {
		return layoutSite;
	}

	public void setLayoutSite(int layout) {
		layoutSite = layout;
	}
}
