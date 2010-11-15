package com.cloudwb.project.client;

public class PaginaLayout_01 {	

	
	private static String codigoHTML = "";
	
	
	public static void escreveHTML(){
		
	
	codigoHTML = ""+
	"<html>"+
	"<head>"+
	"<title>Web Site</title>"+
	"<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1'>"+
	    "<style type='text/css'>"+
	        ".style1"+
	        "{"+
	            "width: 70%;"+
	        "}"+
	    "</style>"+
	"</head>"+
	"<body bgcolor='#CCCCCC' topmargin='0' leftmargin='0' text='#FFFFFF' background='images/back.gif' link='#FFFFCC' vlink='#CCCCCC'>"+
	"<table width='677' border='1' cellspacing='0' cellpadding='3' align='center' bordercolor='#313131'>"+
	  "<tr>"+
	    "<td>"+
	      "<table width='92%' border='0' cellspacing='0' cellpadding='0' align='center'>"+
	        "<tr bgcolor='#333333' valign='top'> "+
	          "<td>"+
	            "<table width='100%' border='0' cellspacing='0' cellpadding='10'>"+
	              "<tr>"+
	                "<td class='style1'><font face='Arial, Helvetica, sans-serif' size='4'><b><font size='5'> "+
	                  "&nbsp; <img src='images/logo.gif' width='50' height='50' align='absmiddle'> "+
	                  CriadorTab.pagCliente.getTituloSite() + "</font></b></font></td>"+
	                "<td width='50%'> "+
	                  "<div align='right'></font>" + CriadorTab.pagCliente.getNomeSite()+ 
	                    "</div>"+
	                "</td>"+
	              "</tr>"+
	            "</table>"+
	          "</td>"+
	        "</tr>"+
	        "<tr> "+
	          "<td> "+
	            "<table border='0' cellpadding='0' cellspacing='0' width='800'>"+
	              "<tr> <!-- Shim row, height 1. --> "+
	                "<td><img src='images/shim.gif' width='43' height='1' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='204' height='1' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='23' height='1' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='7' height='1' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='523' height='1' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='1' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 2 --> "+
	                "<td colspan='5'><img name='hooverwebdesign_index_r2_c1' src='images/hooverwebdesign_index_r2_c1.jpg' width='800' height='14' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='14' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 3 --> "+
	                "<td rowspan='4' background='images/hooverwebdesign_index_r3_c1R.jpg'><img name='hooverwebdesign_index_r3_c1' src='images/hooverwebdesign_index_r3_c1.jpg' width='43' height='414' border='0'></td>"+
	                "<td rowspan='2' background='images/hooverwebdesign_index_r3_c2.jpg'> "+
	                  "<div align='center'> "+
	                    "<table width='192' border='1' cellspacing='0' cellpadding='5' bordercolor='#000000'>"+
	                      "<tr> "+
	                        "<td> "+
	                          "<div align='center'><font face='Arial, Helvetica, sans-serif' size='2'><b>Menu</b></font></div>"+
	                        "</td>"+
	                      "</tr>"+
	                      "<tr> "+
	                        "<td> "+
	                          "<div align='center'>"+
	                          "<p><font size='2' face='Verdana, Arial, Helvetica, sans-serif'><b><font face='Arial, Helvetica, sans-serif'>&raquo;</font></b></font><font face='Arial, Helvetica, sans-serif' size='2'> "+
	                          "<a href='index.html'>Home</a></font></p>";
	                            
	
	if (CriadorTab.pagCliente.getGraduacao() == 1){
		codigoHTML = codigoHTML + "<p><font size='2' face='Verdana, Arial, Helvetica, sans-serif'><b><font face='Arial, Helvetica, sans-serif'>&raquo;</font></b></font><font face='Arial, Helvetica, sans-serif' size='2'> "+
        "<a href='graduacao.html'>Graduacao</a></font></p>";
	}
	if (CriadorTab.pagCliente.getPosGraduacao() == 1){
		codigoHTML = codigoHTML + "<p><font size='2' face='Verdana, Arial, Helvetica, sans-serif'><b><font face='Arial, Helvetica, sans-serif'>&raquo;</font></b></font><font face='Arial, Helvetica, sans-serif' size='2'> "+
        "<a href=''>Pós-graduacao</a></font></p>";
	}
	if (CriadorTab.pagCliente.getMestrado() == 1){
		codigoHTML = codigoHTML + "<p><font size='2' face='Verdana, Arial, Helvetica, sans-serif'><b><font face='Arial, Helvetica, sans-serif'>&raquo;</font></b></font><font face='Arial, Helvetica, sans-serif' size='2'> "+
        "<a href=''>Mestrado</a></font></p>";
	}
	if (CriadorTab.pagCliente.getDoutorado() == 1){
		codigoHTML = codigoHTML + "<p><font size='2' face='Verdana, Arial, Helvetica, sans-serif'><b><font face='Arial, Helvetica, sans-serif'>&raquo;</font></b></font><font face='Arial, Helvetica, sans-serif' size='2'> "+
        "<a href=''>Doutorado</a></font></p>";
	}
	                            
	                            
	codigoHTML = codigoHTML +                            
	                          "</div>"+
	                        "</td>"+
	                      "</tr>"+
	                    "</table>"+
	                    "<br>"+
	                  "</div>"+
	                "</td>"+
	                "<td colspan='3'><img name='hooverwebdesign_index_r3_c3' src='images/hooverwebdesign_index_r3_c3.jpg' width='553' height='65' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='65' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 4 --> "+
	                "<td colspan='2' background='images/hooverwebdesign_index_r4_c3.jpg'>&nbsp;</td>"+
	                "<td background='images/hooverwebdesign_index_r4_c5.jpg'> "+
	                  "<p><font face='Arial, Helvetica, sans-serif' size='2'>Visit "+
	                    "our Webmaster How To page for info about basic html tags, "+
	                    "how to stream real audio, password protecting your website, "+
	                    "free javascripts, free ebooks, and many more items to help "+
	                    "you with your web site. </font></p>"+
	                "</td>"+
	                "<td><img src='images/shim.gif' width='1' height='291' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 5 --> "+
	                "<td><img name='hooverwebdesign_index_r5_c2' src='images/hooverwebdesign_index_r5_c2.jpg' width='204' height='37' border='0'></td>"+
	                "<td rowspan='2'><img name='hooverwebdesign_index_r5_c3' src='images/hooverwebdesign_index_r5_c3.jpg' width='23' height='58' border='0'></td>"+
	                "<td rowspan='2' colspan='2'><img name='hooverwebdesign_index_r5_c4' src='images/hooverwebdesign_index_r5_c4.jpg' width='530' height='58' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='37' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 6 --> "+
	                "<td><img name='hooverwebdesign_index_r6_c2' src='images/hooverwebdesign_index_r6_c2.jpg' width='204' height='21' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='21' border='0'></td>"+
	              "</tr>"+
	              "<tr valign='top'><!-- row 7 --> "+
	                "<td colspan='5'><img name='hooverwebdesign_index_r7_c1' src='images/hooverwebdesign_index_r7_c1.jpg' width='800' height='59' border='0'></td>"+
	                "<td><img src='images/shim.gif' width='1' height='59' border='0'></td>"+
	              "</tr>"+
	            "</table>"+
	          "</td>"+
	        "</tr>"+
	        "<tr> "+
	          "<td> "+
	            "<div align='center'><font face='Arial, Helvetica, sans-serif' size='2'>"+
	              "Desenvolvido por Web Solutions 4 U - Copyright 2010</font></div>"+
	          "</td>"+
	        "</tr>"+
	      "</table>"+
	    "</td>"+
	  "</tr>"+
	"</table>"+
	"<p align='center'>&nbsp;</p>"+
	"</body>"+
	"</html>";
	}
	
	public static String geraCodigoHTML(){
		return codigoHTML;
	}
	
}
