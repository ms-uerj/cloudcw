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

public class Compactador {   
  
   // ------------------------------------------------ Constantes   
   static final int TAMANHO_BUFFER = 2048; // 2kb  
  
  
   // ------------------------------------------------ M�todos p�blicos   
   public void compactar (String arqSaida) {   
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
         f = new File("."); // Todos os arquivos da pasta onde a classe est�
         
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
   }//fim compactar()
}//Compactador.class  