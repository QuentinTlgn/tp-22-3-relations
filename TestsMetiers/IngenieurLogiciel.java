package TestsMetiers;

public class IngenieurLogiciel extends Personne{

	public IngenieurLogiciel(String nom) {
		super(nom);
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Et je suis ingénieur logiciel.");
	}

}
