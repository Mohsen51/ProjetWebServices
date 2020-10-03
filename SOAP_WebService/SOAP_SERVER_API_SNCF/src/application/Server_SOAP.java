package application;

import java.io.IOException;

import javax.xml.ws.Endpoint;

import com_api.SNCF;
import services.MobilityService;

public class Server_SOAP {
	
	public static void main(String[] args) throws IOException {
		
		SNCF client_rest_api = new SNCF();
	
		String URL="http://localhost:7777/";
		Endpoint.publish(URL, new MobilityService());
		System.out.println("SERVEUR : "+URL);
	}

}
