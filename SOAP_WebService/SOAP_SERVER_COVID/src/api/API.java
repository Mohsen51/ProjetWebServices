package api;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@XmlRootElement
public class API {
	
	private static Client client;
	private final static String domaine = "https://api.covid19api.com/";
	private static ClientResponse response;
	private static WebResource webResource;
	
	public API () {
		client = Client.create();
		
		webResource = client.resource(domaine);
		response = webResource.accept("application/json").get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			System.out.println("La requête a échoué : " + response.getStatus());
			String error= response.getEntity(String.class);
			System.out.println("Error: "+error);
			return;
		}
		
		this.print_requete("");
	}
	
	public void requestAPI (String s) {
		
		webResource = client.resource(domaine+s);
		response = webResource.accept("application/json").get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			System.out.println("La requête a échoué : " + response.getStatus());
			String error= response.getEntity(String.class);
			System.out.println("Error: "+error);
			return;
		}
		
		
		
	}
	
	public void print_requete (String s) {
		
		String output = response.getEntity(String.class);
	 
		System.out.println(output +"\n");
	}
	
	public static int getGlobalDeaths () {
		return 0;
	}
	
	public static int getGlobalRecov () {
		return 0;
	}

}
