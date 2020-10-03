package voyage;

public class Voyageur {
	public String nom;
	public String prenom;
	public int age;
	public String mail;
	
	public Voyageur(String nom, String prenom, int age, String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Voyageur "+ this.nom +" "+ this.prenom +"\nAge: "+ this.age +"\nMail: "+ this.mail +"\n";
	}
		
}
