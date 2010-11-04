package com.cloudwb.project.server;

import java.io.File;
import java.io.IOException;
import com.cloudwb.project.client.GreetingService;
import com.cloudwb.project.shared.FieldVerifier;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {

		File arqLogErro = new File("LOG.TXT");
		Window.alert(""+arqLogErro.canRead());
		try {
			arqLogErro.createNewFile();
		} catch (IOException e) {
			Window.alert("Não Criou!");
			e.printStackTrace();
		}
		return input;
	}

}
