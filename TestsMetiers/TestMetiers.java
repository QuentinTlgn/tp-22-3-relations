package TestsMetiers;

public class TestMetiers {
	public static void main(String[] arg) {
		Personne[] personnes = new Personne[3];
		personnes[0] = new IngenieurReseau("Paul");
		personnes[1] = new IngenieurLogiciel("Philippe");
		personnes[2] = new IngenieurReseau("Pierre");
		for (int i = 0; i < personnes.length; i++)
		personnes[i].afficher();
	}
}
