package com.cloudwb.project.client;

import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GeradorArquivos {

	HTML htmlIndex;
	
	public GeradorArquivos(PaginaCliente pgCliente, DecoratedTabPanel tabPanelVisualizaPagina){
		VerticalPanel vPanelVisualizaPagina = new VerticalPanel();
		htmlIndex = new HTML("<TABLE ALIGN=CENTER BGCOLOR=BLACK WIDTH=80% CELLSPACING=1 BORDER=1>"+
				"<TR ALIGN=CENTER TEXT=BLACK><TD WIDTH=100%>"+
				pgCliente.getNomeSite()+
				"</TD></TR>"+
				"<TR TEXT=GRAY>"+
				((pgCliente.getGraduacao() == 0)? "":"Graduacao<BR>" )+
				((pgCliente.getPosGraduacao() == 0)? "":"Pos-Graduacao<BR>" )+
				((pgCliente.getMestrado() == 0)? "":"Mestrado<BR>" )+
				((pgCliente.getDoutorado() == 0)? "":"Doutorado<BR>" )+
				"</TR><TR><TD WIDTH=85%>Teste</TD>"+
				"</TR></TABLE>");
		
		vPanelVisualizaPagina.add(htmlIndex);
		tabPanelVisualizaPagina.add(vPanelVisualizaPagina, pgCliente.getTituloSite());
	}
	

}