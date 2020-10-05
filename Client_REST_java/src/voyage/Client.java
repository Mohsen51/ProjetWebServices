package voyage;

import java.util.*;

public class Client {

	public static void inscription (Scanner sc, Requete rq) {
		System.out.println ("INSCRIPTION :\nVeuillez entrez votre nom : ");
		String nom = sc.next();
		System.out.println("INSCRIPTION : Veuillez entrez votre prenom : ");
		String prenom = sc.next();
		System.out.println("INSCRIPTION : Veuillez entrez le nom du pays en minuscule: ");
		String pays = sc.next();
		rq.add_voyageur(nom, prenom, pays);
	}

	public static void desinscription (Scanner sc, Requete rq) {
		System.out.println ("DESINSCRIPTION : Veuillez entrez l'ID du voyageur à désinscrire :");
		int id = sc.nextInt();
		rq.delete_voyageur(id);
	}

	public static void informations (Scanner sc, Requete rq) {
		System.out.println("INFORMATIONS : Entrez 1 pour les informations sur les voyageurs.\nEntrez 2 pour les informations sur les pays.");
		int i = sc.nextInt();
		if (i==1) {
			System.out.println ("INFORMATIONS : Souhaitez vous consulter un voyageur en particulier ? (y/n)");
			String s = sc.next();
			if (s.equals("y") ) {
				System.out.println("INFORMATIONS : Entrez l'ID du voyageur :");
				int j = sc.nextInt();
				rq.get_voyageur(j);
			} else {
				rq.get_all_voyageur();
			}
		} else {
			System.out.println ("INFORMATIONS : Souhaitez vous consulter un pays en particulier ? (y/n)");
			String s = sc.next();
			if (s.equals("y")) {
				System.out.println("INFORMATIONS : Entrez le nom du pays en minuscule :");
				s = sc.next();
				rq.get_pays(s);
			}else if (s.equals("n"))
				rq.get_all_pays();
		}
	}

	public static void modification (Scanner sc, Requete rq) {
		System.out.println ("MODIFICATION : Veuillez entrez l'ID du voyageur :");
		int id = sc.nextInt();
		System.out.println("MODIFICATION : Veuillez entrez le nom du pays en minuscule :");
		String pays = sc.next();
		rq.update (id, pays);
	}

	public static void main(String[] args) {
		Requete rq = new Requete();
		Scanner sc = new Scanner(System.in);
		String s = "";
		while (!s.equals("exit")) {
			System.out.println("Que voulez-vous faire :\n"
					+ "ins : inscription\n"
					+ "des : desinscription\n"
					+ "inf : information\n"
					+ "mod : modification des regles d'un pays\n");
			s = sc.next();
			if (s.equals("ins")) {
				inscription (sc, rq);
			} else if (s.equals("des")) {
				desinscription (sc, rq);
			} else if (s.equals("inf")) {
				informations (sc, rq);
			} else if (s.equals("mod")) {
				modification (sc, rq);
			}
		}

//		Voyageur antoine = new Voyageur ("Antoine", "Dutest", 21, "antoine.dutest@efrei.net");
//		Voyageur simon = new Voyageur ("Simon", "Tancev", 20, "simon.tancev@efrei.net");
//		ArrayList<Voyageur> list_v = new ArrayList<Voyageur>();
//		list_v.add(antoine);
//		list_v.add(simon);
//		Pays fr = new Pays ("France", 0, list_v);
//		System.out.println(fr);
		sc.close();	
	}

}
