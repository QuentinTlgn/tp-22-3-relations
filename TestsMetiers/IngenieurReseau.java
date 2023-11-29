package TestsMetiers;

public class IngenieurReseau extends Personne{

	public IngenieurReseau(String nom) {
		super(nom);
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Et je suis ingénieur réseau.");
	}

}
