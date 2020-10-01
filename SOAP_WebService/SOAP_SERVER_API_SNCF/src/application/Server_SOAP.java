package application;

import javax.xml.ws.Endpoint;

import com_api.SNCF;
import services.MobilityService;

public class Server_SOAP {
	
	public static void main(String[] args) {
		
		SNCF api = new SNCF();
	
		String URL="http://localhost:7777/";
		Endpoint.publish(URL, new MobilityService());
		System.out.println("SERVEUR : "+URL);
	}

}
