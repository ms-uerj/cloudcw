package com.cloudwb.project.client;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Diretorio {
	
	private PaginaCliente pag_cliente = new PaginaCliente();
	
	public Diretorio(PaginaCliente pag_cliente){
		
		this.pag_cliente = pag_cliente;
	}
		
	public void cria_Diretorio(){
	
		int a = pag_cliente.getGraduacao();
		int b = pag_cliente.getPosGraduacao();
		int c = pag_cliente.getMestrado();
		int d = pag_cliente.getDoutorado();
		
		// cria a pagina principal do site
		File file0 = new File("pag_cliente");
		file0.mkdirs();
		
		file0 = new File("pag_cliente/home.html");
				
		try {
			file0.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//cria as páginas dos módulos, se assim escolhido pelo usuário
		if(a == 1){
			File file1 = new File("pag_cliente/graduacao");	
			file1.mkdirs();
			
			try {    
		        BufferedWriter bw = new BufferedWriter( new FileWriter( "pag_cliente/graduacao/Home.html" ));
		        
		        String linha = "<html><head><title></title></head><body><h1>Hello World</h1><div class='mainnav'><ul><li><a href='#'>Home</a></li><li><a href='#'>News</a></li><li><a href='#'>Photos</a></li><li><a href='#'>Videos</a></li><li><a href='#'>Downloads</a></li><li><a href='#'>Contact</a></li></ul></div><!--mainnav--></body></html>";	        		

		        bw.write( linha, 0, linha.length() );  

		        bw.close();

		    }catch (IOException exc){
		          exc.printStackTrace();  
		    }
		}
		
		try {
			BufferedWriter bw = new BufferedWriter( new FileWriter( "pag_cliente/oi.txt" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(b == 1){
			File file2 = new File("pag_cliente/pos-graduacao");	
			file2.mkdirs();
		}
		if(c == 1){
			File file3 = new File("pag_cliente/mestrado");	
			file3.mkdirs();
		}
		if(d == 1){
			File file4 = new File("pag_cliente/doutorado");	
			file4.mkdirs();
		}		
	}
}