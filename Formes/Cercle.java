package Formes;

public class Cercle extends Forme {
	private double rayon;
	
	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getSurface() {
		return Math.PI * rayon * rayon;
	}
}
