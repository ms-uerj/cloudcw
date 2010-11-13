package com.cloudwb.project.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;	// o erro pode ser pq estamos passando um bufferedoutputstream para o zipoutputstream, teoricamente nao ha erro nenhum, porem o bufferedinputstream é do pacote java


//import java.util.zip.ZipOutputStream;
//import java.util.zip.ZipEntry;

public class Compactador {   
      
   // ------------------------------------------------ Constantes   
   static final int TAMANHO_BUFFER = 2048; // 2kb  
  
  
   // ------------------------------------------------ Métodos públicos   
   public void compactar (String arqSaida) {
	   
      int i, cont;   
      byte[] dados = new byte[TAMANHO_BUFFER];   
      File f = null;
      BufferedInputStream origem = null;   
      FileInputStream streamDeEntrada = null;   
      FileOutputStream destino = null;
      ZipOutputStream saida = null; 	  
      ZipEntry entry = null;
      String arquivos[];
        
      try {   
         destino = new FileOutputStream(arqSaida,false);	// cria um fluxo de dados que irá escrever no arquivo arqSaida	
         
    	  
    	 // dá erro na linha de cima
    	  
    	  
         System.out.println("Aki 3");  				//imprime até aqui!
         
         f = new File(".");  	//cria o ponteiro para o path war/.					//link para D:\Arquivos de programas\Eclipse Helios 6.1\eclipse\workspace created by vbaeta\CloudWB\war\pag_cliente
         System.out.println(f.getAbsolutePath()); 	// comprovação do link

         arquivos = f.list();	// Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
        
         for (i = 0; i < arquivos.length; i++) {   	//enquanto existirem nomes de arquivos/pastas nao percorridos no String arquivos[] faça...

        	File arquivo = new File(arquivos[i]);	//cria um abstract pathname com o nome do arquivos[i]		System.out.println("Aki "+ i);    //aki ----------------------------- 
   
            if (arquivo.isFile() && !(arquivo.getName()).equals(arqSaida)) { //isfile() retorna true se a variavel arquivo guarda um ponteiro para um arquivo normal (que nao é diretório) e se arquivo existe; getName() retorna o nome do arquivo; nesse caso ele compara se é igual ao nome do arquivo de saida pq o arquivo de saida será criado na mesma pasta 
            	
               System.out.println("Entrou IF");				//aki -----------------------------

               System.out.println("Compactando: " + arquivos[i]);
   
               System.out.println("TTTT");
               
               saida = new ZipOutputStream(new BufferedOutputStream(destino)); 				//recebe um stream (outputstream) para ser escrito no formato zip; note que estamos passando um BufferedOutputStream, porém esta classe é filha de OutputStream, por isso, nao deve dar erro. Creates a new ZIP output stream to write in a zip file
               
               System.out.println("ZZZZ");
               
               streamDeEntrada = new FileInputStream(arquivo);	//A FileInputStream obtains input bytes from a file in a file system.
               origem = new BufferedInputStream(streamDeEntrada, TAMANHO_BUFFER); //coloca o StreamDeEntrada em um BufferedInputStream
               entry = new ZipEntry(arquivos[i]);				//This class is used to represent a ZIP file entry. Nesse caso, estamos passando uma String, logo o construtor instacianrá uma entrada zip com esse nome

               saida.putNextEntry(entry);	//  Begins writing a new ZIP file entry and positions the stream to the start of the entry data.
               
               while((cont = origem.read(dados, 0, TAMANHO_BUFFER)) != -1) {   // enquanto origem nao tiver chegado ao fim (end of file). metodo read só retorna -1 se chegar ao fim do arquivo
               
            	   try{
            		   saida.write(dados, 0, cont);   
            	   }catch(IOException ioe){
            		   System.out.println("Erro de entrada e saida no zip!");
            		   
            	   }
               }   
   
               origem.close();   
            }   
         }   
   
         saida.close();  
            
      } catch(Exception e) {   
         e.printStackTrace();   
      }   
   }//fim compactar()
}//Compactador.class  