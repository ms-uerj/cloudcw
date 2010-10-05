package com.cloudwb.project.client;

public class PaginaCliente {
  private String nomeSite;
  private String tituloSite;
  private String bannerSite;
  private int[] moduloSite;
  private int layoutSite;
  
  public String getNomeSite(){
    return nomeSite;
  }
  
  public void setNomeSite(String nome){
    nomeSite = nome;
  }
  
  public String getTituloSite(){
	return tituloSite;
  }
  
  public void setTituloSite(String titulo){
	tituloSite = titulo;
  }
  
  public String getBannerSite(){
	return bannerSite;
  }
  
  public void setBannerSite(String banner){
    bannerSite = banner;
  }
  
  public int getModuloSite( int i ){
  	return moduloSite[i];    	
  }

  public void setModuloSite(int i, int opc){
	moduloSite[i] = opc;
  }
  
  public int getLayoutSite(){
	return layoutSite;
  }
  
  public void setLayoutSite(int layout){
    layoutSite = layout;
  }
}
