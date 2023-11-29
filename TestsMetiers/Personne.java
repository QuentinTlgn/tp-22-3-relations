package TestsMetiers;

public class Personne {
	
	private String nom;
	
	public void afficher() {
		System.out.println("Je m'apelle "+nom);
	}

	public Personne(String nom) {
		super();
		this.nom = nom;
	}
}
