package voyage;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Requete {
	
	private Client client;
	private String domaine;
	
	public Requete () {
		client = Client.create();
		domaine = "http://localhost:8080/api/";
	}
	
	public void get_pays(String s) {
		String pays = get_format(s);
		print_requete ("pays/"+ pays);
	}
	
	public void get_all_pays() {
		print_requete ("pays");
	}
	
	public void get_voyageur (int id) {
		print_requete ("voyageurs/"+id);
	}

	public void get_all_voyageur() {
		print_requete ("voyageurs");
	}
	
	private String get_format (String s) {
		s = s.toUpperCase();
		char c = s.charAt(0);
		s = s.toLowerCase();
		s = s.substring(1);
		s = c+s;
		return s;
	}
	
	public void print_requete (String s) {
		WebResource webResource = client.resource(domaine+s);
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
		
		if (response.getStatus() != 200) {
			System.out.println("La requï¿½te a ï¿½chouï¿½ : " + response.getStatus());
			String error= response.getEntity(String.class);
			System.out.println("Error: "+error);
			return;
		}	
		
		String output = response.getEntity(String.class);
	 
		System.out.println(output +"\n");
	}
	
	public void add_voyageur (String nom, String prenom, String pays) {
		String json = "{\"nomVoyageur\" : \""+ nom +"\" , \"prenomVoyageur\" : \""+ prenom +"\"}";
		String path = get_format (pays);
		post_requete("voyageur/" + path, json);
		
	}
	
	private void post_requete(String path, String json) {		 
        WebResource webResource = client.resource(domaine + path);
         
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);
 
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return;
        }
 
        System.out.println("Output from Server .... \n");
        
        String output = response.getEntity(String.class);
        
        System.out.println(output);
    }
	
	public void update (int id, String pays) {
		WebResource webResource = client.resource(domaine + "voyageurs/"+id);
        String json = "{\"nomPays\" : \""+ get_format(pays) +"\"}";
        
        ClientResponse response = webResource.type("application/json").put(ClientResponse.class, json);
 
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return;
        }
 
        System.out.println("Output from Server .... \n");
        
        String output = response.getEntity(String.class);
        
        System.out.println(output);
	}
	
	public void delete_voyageur (int id) {
		WebResource webResource = client.resource(domaine +"voyageurs/"+id);
        
        ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);
 
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return;
        }
 
        System.out.println("Voyageur désinscrit.\n");
	}
}
