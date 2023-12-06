package Pokemon;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, int pv, int atk) {
		super(nom, pv, atk);
	}

	public void attaquer(PokemonEau p) {
		p.prendreDegats(getAtk()*2);
	}
	
	public void attaquer(PokemonFeu p) {
		p.prendreDegats(getAtk() / 2);
	}
	
	public void attaquer(PokemonPlante p) {
		p.prendreDegats(getAtk() / 2);
	}
}
