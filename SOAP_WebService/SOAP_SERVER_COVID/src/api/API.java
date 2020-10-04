package api;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.StringTokenizer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@XmlRootElement
public class API {
	
	private static Client client;
	
	private final static String domaine = "https://api.covid19api.com/summary";
	private static ClientResponse response;
	private static WebResource webResource;
	
	private static Data data;
	
	public static String output;
	
	public API () {
		client = Client.create();
		
		data = new Data();
		
		webResource = client.resource(domaine);
		response = webResource.accept("application/json").get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			System.out.println("La requête a échoué : " + response.getStatus());
			String error= response.getEntity(String.class);
			System.out.println("Error: "+error);
			return;
		}
		
		output = response.getEntity(String.class);
		
		//this.print_requete();
		
		this.update_data();
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
		
		output = response.getEntity(String.class);
		
	}
	
	public void print_requete () {
			 
		System.out.println(output +"\n");
	}
	
	public void update_data () {
		
		StringTokenizer st = new StringTokenizer(output, ",", false);
		
		for (int i = 0; i<7; i++) {
			
			Data.input[i] = st.nextToken();
			//System.out.println(st.nextToken());
		}
		
		Data.update_values();
		Data.printAll();
	}
	
	public static int getGlobalDeaths () {
		return 0;
	}
	
	public static int getGlobalRecov () {
		return 0;
	}

}
