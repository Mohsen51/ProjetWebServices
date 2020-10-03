package voyage;

import java.util.*;

public class Pays {
	public String name;
	protected int regle;
	protected ArrayList<Voyageur> list_voyageur;
	
	public Pays(String s, int regle, ArrayList<Voyageur> list_voyageur) {
		this.name = s;
		set_regle(regle);
		this.list_voyageur = list_voyageur;
	}

	public Pays(String name, int regle) {
		this.name = name;
		set_regle(regle);
	}

	public Pays(String name) {
		this.name = name;
		set_regle(4);
	}
	
	public int set_regle (int a) {
		if (a >= 0 || a <= 4 ) {
			this.regle = a;
			return a;
		}
		return -1;
	}

	@Override
	public String toString() {
		String s = this.name +"\n";
		switch (this.regle) {
		case 0 : s += "Ce pays est fermer. N'�ssayez pas d'y acc�der, sinon, ca va �tre compliqu� pour vous !\n";
				break;
		case 1 : s += "Pour acc�der � ce pays, vous devez pr�senter un test PCR n�gatif et �tre mis en quarantaine.\n";
				break;
		case 2 : s += "Pour acc�der � ce pays, vous devez pr�senter un test PCR n�gatif\n";
				break;
		case 3 : s += "Pour acc�der � ce pays, vous devez �tre mis en quarantaine.\n";
				break;
		default : s += "Ce pays est ouvert. Pour le moment ...\n";
		}
		s += "Liste des voyageurs :\n";
		for (int i=0; i<list_voyageur.size(); i++)
			s += "-"+ this.list_voyageur.get(i);
		return s;
	}
		
}
