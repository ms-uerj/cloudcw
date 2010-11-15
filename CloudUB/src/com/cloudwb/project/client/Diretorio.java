package com.cloudwb.project.client;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gwt.user.client.Window;

public class Diretorio {
	
	private PaginaCliente pag_cliente = new PaginaCliente();
	
	public Diretorio(PaginaCliente pag_cliente){
		
		this.pag_cliente = pag_cliente;
	}
		
	public void cria_Diretorio(){
	
		//int a = pag_cliente.getGraduacao();
		int b = pag_cliente.getPosGraduacao();
		int c = pag_cliente.getMestrado();
		int d = pag_cliente.getDoutorado();
		
		// cria a pagina principal do site
		//File file0 = new File("pag_cliente");
		//file0.mkdirs();
		
		File file0 = new File("home.html");
				
		try {
			file0.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//cria as páginas dos módulos, se assim escolhido pelo usuário
		//if(a == 1){
			//File file1 = new File("pag_cliente/graduacao");	
			//file1.mkdirs();
			
			try {    
		        BufferedWriter bw = new BufferedWriter( new FileWriter( "Home.html" ));
		        
		        String linha = "<html><head><title></title></head><body><h1>Hello World</h1><div class='mainnav'><ul><li><a href='#'>Home</a></li><li><a href='#'>News</a></li><li><a href='#'>Photos</a></li><li><a href='#'>Videos</a></li><li><a href='#'>Downloads</a></li><li><a href='#'>Contact</a></li></ul></div><!--mainnav--></body></html>";	        		

		        bw.write( linha, 0, linha.length() );  

		        bw.close();
		       

		    }catch (IOException exc){
		          exc.printStackTrace();  
		    }
		//}

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
	
	public static void criaPaginas(){
		
		String textoHTML_Home = "";
		String textoHTML_Graduacao = "";
		String textoHTML_posGraduaco = "";
		String textoHTML_Mestrado = "";
		String textoHTML_Doutorado = "";
		String folderLayout = "";
		
		File folderCliente = new File("pagina_cliente");
		folderCliente.mkdir();
		
		try {    
	        
			if (CriadorTab.pagCliente.getLayoutSite() == 1){
				
				folderLayout = "layout_01";
				
				BufferedWriter bw_Home = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +  "/index.html" ));
								
				folderCliente = new File("pagina_cliente/" + folderLayout);
				folderCliente.mkdir();
				
	        	PaginaLayout_01.escreveHTML_Home();
	        	textoHTML_Home = PaginaLayout_01.geraCodigoHTML_Home();
	        	
	        	PaginaLayout_01.escreveHTML_Graduacao();
	        	textoHTML_Graduacao = PaginaLayout_01.geraCodigoHTML_Graduacao();
	        	
	        	PaginaLayout_01.escreveHTML_posGraduacao();
        		textoHTML_posGraduaco = PaginaLayout_01.geraCodigoHTML_posGraduacao();
        		
        		PaginaLayout_01.escreveHTML_Mestrado();
	        	textoHTML_Mestrado = PaginaLayout_01.geraCodigoHTML_Mestrado();
	        	
	        	PaginaLayout_01.escreveHTML_Doutorado();	        		
	        	textoHTML_Doutorado = PaginaLayout_01.geraCodigoHTML_Doutorado();
	        	
	        	bw_Home.write( textoHTML_Home, 0,textoHTML_Home.length() ); 
		        bw_Home.close();		        
			}
			
			if (CriadorTab.pagCliente.getLayoutSite() == 2){
				
				folderLayout = "layout_02";
				
				BufferedWriter bw_Home = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +  "/index.html" ));
								
				folderCliente = new File("pagina_cliente/" + folderLayout);
				folderCliente.mkdir();			
				
				PaginaLayout_02.escreveHTML_Home();
	        	textoHTML_Home = PaginaLayout_02.geraCodigoHTML_Home();
	        	
	        	PaginaLayout_02.escreveHTML_Graduacao();
	        	textoHTML_Graduacao = PaginaLayout_02.geraCodigoHTML_Graduacao();
	        	
	        	PaginaLayout_02.escreveHTML_posGraduacao();
        		textoHTML_posGraduaco = PaginaLayout_02.geraCodigoHTML_posGraduacao();
        		
        		PaginaLayout_02.escreveHTML_Mestrado();
	        	textoHTML_Mestrado = PaginaLayout_02.geraCodigoHTML_Mestrado();
	        	
	        	PaginaLayout_02.escreveHTML_Doutorado();	        		
	        	textoHTML_Doutorado = PaginaLayout_02.geraCodigoHTML_Doutorado();
	        	
	        	bw_Home.write( textoHTML_Home, 0,textoHTML_Home.length() ); 
		        bw_Home.close();		        
			}
			
			if (CriadorTab.pagCliente.getLayoutSite() == 3){
				
				folderLayout = "layout_03";
				
				BufferedWriter bw_Home = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +  "/index.html" ));
								
				folderCliente = new File("pagina_cliente/" + folderLayout);
				folderCliente.mkdir();
				
	        	PaginaLayout_01.escreveHTML_Home();
	        	textoHTML_Home = PaginaLayout_01.geraCodigoHTML_Home();
	        	
	        	bw_Home.write( textoHTML_Home, 0,textoHTML_Home.length() ); 
		        bw_Home.close();		        
			}
			
			if (CriadorTab.pagCliente.getLayoutSite() == 4){
				
				folderLayout = "layout_04";
				
				BufferedWriter bw_Home = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +  "/index.html" ));
								
				folderCliente = new File("pagina_cliente/" + folderLayout);
				folderCliente.mkdir();
				
	        	PaginaLayout_01.escreveHTML_Home();
	        	textoHTML_Home = PaginaLayout_01.geraCodigoHTML_Home();
	        	
	        	bw_Home.write( textoHTML_Home, 0,textoHTML_Home.length() ); 
		        bw_Home.close();		        
			}
	         
	        	
	        	if (CriadorTab.pagCliente.getGraduacao() == 1){
	        		BufferedWriter bw_Graducao = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +   "/graduacao.html" ));
	        				        	
		        	bw_Graducao.write(textoHTML_Graduacao, 0,textoHTML_Graduacao.length() );
			        bw_Graducao.close();
	        	}
	        	
	        	if (CriadorTab.pagCliente.getPosGraduacao() == 1){
	        		BufferedWriter bw_posGraducao = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +  "/pos_graduacao.html" ));	        		
		        	
		        	bw_posGraducao.write(textoHTML_posGraduaco, 0,textoHTML_posGraduaco.length() );
		        	bw_posGraducao.close();
	        	}
	        	
	        	if (CriadorTab.pagCliente.getMestrado() == 1){
	        		BufferedWriter bw_Mestrado = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +   "/mestrado.html" ));
	        				        	
		        	bw_Mestrado.write(textoHTML_Mestrado, 0,textoHTML_Mestrado.length() );
		        	bw_Mestrado.close();
	        	}
	        	
	        	if (CriadorTab.pagCliente.getDoutorado() == 1){
	        		BufferedWriter bw_Doutorado = new BufferedWriter( new FileWriter( "pagina_cliente/" + folderLayout +   "/doutorado.html" ));
	        				        	
		        	bw_Doutorado.write(textoHTML_Doutorado, 0,textoHTML_Doutorado.length() );
		        	bw_Doutorado.close();
	        	}
	        	
	        	
	    }
		catch (IOException exc){
	          exc.printStackTrace();  
	    }
	    
		Window.alert("Pagina criada com sucesso!");
		com.google.gwt.user.client.Window.open("pagina_cliente/" + folderLayout + "/index.html","","");
	}
	
}