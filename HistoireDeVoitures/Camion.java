package HistoireDeVoitures;

public class Camion extends Voiture {
	private int poids;
	
	public Camion(int vitesseMax, float prixDeBase, String couleur, int poids) {
		super(vitesseMax, prixDeBase, couleur);
		// TODO Auto-generated constructor stub
	}

	public double calculerPrixDeVente() {
		if(poids > 2000) {
			return getPrixDeBase()*0.9;
		}
		else return getPrixDeBase();
	}
}
