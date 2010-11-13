package com.cloudwb.project.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.zip.ZipEntry;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;
//import java.util.zip.ZipOutputStream;

import org.apache.tools.zip.*;

public class Compactador {
		
	static final int TAMANHO_BUFFER = 2048; // 2kb
	
	public void compactar(String arqSaida) {
		   
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
	         // TODO o erro estah na linha abaixo
	         saida = new ZipOutputStream(new BufferedOutputStream(destino));  
	         f = new File("."); // Todos os arquivos da pasta onde a classe está
	         
	         if (f.isDirectory()){
	        	 String[] arquivosDoDiretorio = f.list();
	        	 for (int j = 0; j < arquivosDoDiretorio.length; j++) {
					System.out.println("Arquivo " + j + ": " + arquivosDoDiretorio[j]);
				}
	         } 
	         
	         System.out.println(f);
	         
	         //f = new File("../../../../../war/pag_cliente/.");
	         
	         if (f != null) {
	        	 arquivos = f.list();
	         } else {
	        	 System.err.println("Erro - arquivo não criado");
	        	 arquivos = null;
	         }

	         String texto = "Size "+ f.length() + "; Path " + f.getAbsolutePath() + "" + "" + "" + "";
	         String caminho = "pag_cliente/home.html";
	         
	         try {    
			        BufferedWriter bw = new BufferedWriter( new FileWriter( caminho ));
			        
			        bw.write(texto, 0, texto.length() );  

			        bw.close();

			    }catch (IOException exc){
			          exc.printStackTrace();  
			    }
			    

	         for (i = 0; i < arquivos.length; i++) {
	        	 System.out.println(arquivos.length);
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
	      
	      return;
	   }//fim compactar()
}
