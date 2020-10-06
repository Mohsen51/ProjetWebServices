package client;

import services.COVID19OpenData;
import services.Services;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		Services stub = new COVID19OpenData().getServicesPort();
		Scanner sc = new Scanner (System.in);
		int i = -1;
		
		while (i != 0) {
			System.out.println("Bonjour,\nEntrez 0 pour quitter.\n"
					+ "Entrez 1 pour obtenir le nombre de nouveau cas sur 24h.\n"
					+ "Entrez 2 pour obtenir le nombre de mort sur 24h.\n"
					+ "Entrez 3 pour obtenir le nombre de personne soigné sur 24h\n"
					+ "Entrez 4 pour obtenir le nombre total de cas.\n"
					+ "Entrez 5 pour obtenir le nombre total de décès.\n"
					+ "Entrez 6 pour obtenir le nombre total de personne soigné.\n");
			i = sc.nextInt();
			switch (i) {
			case 1 :
				System.out.println("Nouveau cas sur 24h : "+ stub.newConfirmed() +"\n");
				break;
			case 2 :
				System.out.println("Morts sur 24h : "+ stub.newDeaths() +"\n");
				break;
			case 3 :
				System.out.println("Soignées sur 24h : "+ stub.newRecovered() +"\n");
				break;
			case 4 :
				System.out.println("Cas total : "+ stub.totalConfirmed() +"\n");
				break;
			case 5 :
				System.out.println("Morts total : "+ stub.totalDeaths() +"\n");
				break;
			case 6:
				System.out.println("Soignées total : "+ stub.totalRecovered() +"\n");
				break;
			}
		}
		System.out.println("Merci et a bientôt!\n");
	}
}
