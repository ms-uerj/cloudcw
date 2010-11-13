package com.cloudwb.project.server;

import com.cloudwb.project.client.GreetingService;
import com.cloudwb.project.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.io.*;
import java.util.zip.*;


/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		//File zip = compactar("saida.zip");
		
		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}


	private File compactar (String arqSaida) {
		   
		  final int TAMANHO_BUFFER = 2048; // 2kb

	      int i, cont;   
	      byte[] dados = new byte[TAMANHO_BUFFER];   
	      String arquivos[];   
	      File f = null;   
	      BufferedInputStream origem = null;   
	      FileInputStream streamDeEntrada = null;   
	      FileOutputStream destino = null;   
	      ZipOutputStream saida = null;   
	      ZipEntry entry = null;  
	        
	      try {   
	         destino = new FileOutputStream(arqSaida);   
	         saida = new ZipOutputStream(new BufferedOutputStream(destino));  
	         f = new File("."); // Todos os arquivos da pasta onde a classe está
	         
	         //f = new File("../../../../../war/pag_cliente");
	         arquivos = f.list();  
	           
	         for (i = 0; i < arquivos.length; i++) {   
	            File arquivo = new File(arquivos[i]);   
	   
	            if (arquivo.isFile() && !(arquivo.getName()).equals(arqSaida)) {   
	               System.out.println("Compactando: " + arquivos[i]);   
	   
	               streamDeEntrada = new FileInputStream(arquivo);   
	               origem = new BufferedInputStream(streamDeEntrada, TAMANHO_BUFFER);   
	               entry = new ZipEntry(arquivos[i]);   
	               saida.putNextEntry(entry);  
	                 
	               while((cont = origem.read(dados, 0, TAMANHO_BUFFER)) != -1) {   
	                  saida.write(dados, 0, cont);   
	               }   
	   
	               origem.close();   
	            }   
	         }   
	   
	         saida.close();  
	           
	         
	      } catch(Exception e) {   
	         e.printStackTrace();   
	      }
	      
	      f = new File("saida.zip");
	      
	      return f;
	   }//fim compactar()
	
	
	
	
	
	
	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}