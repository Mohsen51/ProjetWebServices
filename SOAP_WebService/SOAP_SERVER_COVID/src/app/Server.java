package app;

import java.io.IOException;

import javax.xml.ws.Endpoint;

import api.API;
import services.Services;

public class Server {
	
public static void main(String[] args) throws IOException {
		
		API client_rest_api = new API();
	
		String URL="http://localhost:7777/";
		Endpoint.publish(URL, new Services());
		System.out.println("SERVEUR : "+URL);
	}

}
