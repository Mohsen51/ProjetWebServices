package voyage;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Requete {
	
	private Client client;
	private String domaine;
	
	public Requete () {
		client = Client.create();
		domaine = "https://api.covid19api.com/summary";
	}
	
	public void get_pays(String s) {
		String pays = get_format(s);
		print_requete ("pays/"+ pays);
	}
	
	public void get_all_pays() {
		print_requete ("pays");
	}

	private String get_format (String s) {
		s = s.toUpperCase();
		char c = s.charAt(0);
		s = s.toLowerCase();
		s = s.replace(s.charAt(0), c);		
		return s;
	}
	
	public void print_requete (String s) {
		WebResource webResource = client.resource(domaine+s);
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			System.out.println("La requ�te a �chou� : " + response.getStatus());
			String error= response.getEntity(String.class);
			System.out.println("Error: "+error);
			return;
		}	
		
		String output = response.getEntity(String.class);
	 
		System.out.println(output +"\n");
	}
	
}
