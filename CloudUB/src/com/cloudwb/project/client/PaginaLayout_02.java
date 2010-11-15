package com.cloudwb.project.client;


public class PaginaLayout_02 {	

	
	private static String codigoHTML_Home = "";
	private static String codigoHTML_Graduacao = "";
	private static String codigoHTML_posGraduacao = "";
	private static String codigoHTML_Mestrado = "";
	private static String codigoHTML_Doutorado = "";
	
	
	public static void escreveHTML_Home(){
		codigoHTML_Home = "<!DOCTYPE html PUBLIC>"+
		"<html xmlns='http://www.w3.org/1999/xhtml'>"+
		"<head>"+
		"<meta name='keywords' content='' />"+
		"<meta name='description' content='' />"+
		"<meta http-equiv='content-type' content='text/html; charset=utf-8' />"+
		"<title>Web Site</title>"+
		"<link href='style.css' rel='stylesheet' type='text/css' media='screen' />"+
		"</head>"+
		"<body>"+
			"<div id='header'>"+
				"<div id='logo'>"+
					"<h1><a href='pagina_cliente/layout_02/index.html'>" + CriadorTab.pagCliente.getNomeSite() + "</a></h1>"+
				"</div>"+
			"</div>"+
			"<!-- end #header -->"+
			"<div id='menu'>"+
				"<ul>"+
					"<li class='first'>"+
		            "<a href='index.html'>Home</a></li>";
		            
		            if (CriadorTab.pagCliente.getGraduacao() == 1){
		            	codigoHTML_Home = codigoHTML_Home + "<li><a href='graduacao.html'>Graduacao</a></li>";
		        	}
		        	if (CriadorTab.pagCliente.getPosGraduacao() == 1){
		        		codigoHTML_Home = codigoHTML_Home + "<li><a href='pos_graduacao.html'>Pos-Graduacao</a></li>";
		        	}
		        	if (CriadorTab.pagCliente.getMestrado() == 1){
		        		codigoHTML_Home = codigoHTML_Home + "<li><a href='mestrado.html'>Mestrado</a></li>";
		        	}
		        	if (CriadorTab.pagCliente.getDoutorado() == 1){
		        		codigoHTML_Home = codigoHTML_Home +  "<li><a href='doutorado.html'>Doutorado</a></li>";
		        	} 
		            
					
		     codigoHTML_Home = codigoHTML_Home +            
		            
		           
				"</ul>"+
			"</div>"+
			"<!-- end #menu -->"+
		    "<div id='wrapper'>"+
		    "<div class='btm'>"+
			    "<div id='page'>"+
				    "<div id='content'>"+
					    "<div class='post'>"+
						    "<h1 class='title'>" + CriadorTab.pagCliente.getTituloSite() + "</h1>"+
						    "<div class='entry'>"+
						    CriadorTab.pagCliente.getDescricaoSite() +
						    "</div>"+
						"</div>"+
				    "</div>"+
		    "</div>"+
		    "</div>"+
		    "<div style='clear: both;'>&nbsp;</div>"+
			"</div>"+	
		    "<!-- footer -->"+
			"<div id='footer'>"+
				"<p>Copyright (c) 2010 - Criado por Web Solutions 4 U</p>"+
			"</div>"+
			"<!-- end #footer -->"+
		"</body>"+
		"</html>";
	}
	
	public static void escreveHTML_Graduacao(){	
	}
	
	public static void escreveHTML_posGraduacao(){	
	}
	
	public static void escreveHTML_Mestrado(){	
	}
	
	public static void escreveHTML_Doutorado(){	
	}

	public static String geraCodigoHTML_Home(){
		return codigoHTML_Home;
	}
	
	public static String geraCodigoHTML_Graduacao(){
		return codigoHTML_Graduacao;
	}
	
	public static String geraCodigoHTML_posGraduacao(){
		return codigoHTML_posGraduacao;
	}
	
	public static String geraCodigoHTML_Mestrado(){
		return codigoHTML_Mestrado;
	}
	
	public static String geraCodigoHTML_Doutorado(){
		return codigoHTML_Doutorado;
	}
	
}
