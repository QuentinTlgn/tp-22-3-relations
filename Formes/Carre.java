package Formes;

public class Carre extends Forme {
	
	private double cote;
	
	public Carre(double cote) {
		super();
		this.cote = cote;
	}
	
	public double getSurface() {
		return cote*cote;
	}
}
