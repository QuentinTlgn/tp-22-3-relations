package Pokemon;

public class Pokemon {
	private String nom;
	private int pv;
	private int atk;
	
	public Pokemon(String nom, int pv, int atk) {
		this.nom = nom;
		this.pv = pv;
		this.atk = atk;
	}
	
	public String getNom() {
		return nom;
	}
	public int getPv() {
		return pv;
	}
	protected int getAtk() {
		return atk;
	}
	
	public boolean estKO() {
		return pv==0;
	}
	
	protected void prendreDegats(int deg) {
		this.pv -= deg;
		if (pv < 0)
			pv = 0;
	}
	public void attaquer(Pokemon p) {
		p.prendreDegats(atk);
	}
	
	@Override
	public String toString() {
		return "[Pokémon "+ nom + ", pv: "+pv;
	}	
}
