package voyage;

import java.util.*;

public class Client {

	public static Voyageur inscription (Scanner sc) {
		System.out.print ("INSCRIPTION :\nVeuillez entrez votre nom : ");
		String nom = sc.next();
		System.out.println("Veuillez entrez votre prenom : ");
		String prenom = sc.next();
		System.out.println("Veuillez entrez votre age : ");
		int age = sc.nextInt();
		System.out.println("Veuillez entrez votre adresse mail : ");
		String mail = sc.next();
		Voyageur v = new Voyageur (nom, prenom, age, mail);
		return v;
	}
	
	public static void desinscription () {
		System.out.println ("desinscription");
	}
	
	public static void informations (Scanner sc, Requete rq) {
		System.out.println ("INFORMATIONS :\nSouhaitez vous consulter un pays en particulier ? (y/n)");
		String s = sc.next();
		if (s.equals("y")) {
			System.out.println("Entrez le nom du pays en minuscule :");
			s = sc.next();
			rq.get_pays(s);
		}else if (s.equals("n"))
			rq.get_all_pays();
	}
	
	public static void modification () {
		System.out.println ("modification");
	}
	
	public static void main(String[] args) {
		Requete rq = new Requete();
		String s = "";
		
		rq.print_requete(s);
	}

}
