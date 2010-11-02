package com.cloudwb.project.client;

import com.google.gwt.user.client.Window;

public class GeradorArquivos {

	public GeradorArquivos(PaginaCliente pgCliente){
		String htmlIndex = new String("<HTML>\n" +
				"<HEAD>\n <TITLE>" +
				pgCliente.getTituloSite()+
				"<\\TITLE>\n <\\HEAD>\n" +
				"<BODY>\n" +
				"<H2>" +
				pgCliente.getNomeSite()+
				"<H2>\n"+
				"<\\BODY>\n" +
				"<\\HTML>");
		this.gerarSite(htmlIndex);
	}
	
	public void gerarSite(String conteudoPagina){
		Window.alert(conteudoPagina);
	}
}