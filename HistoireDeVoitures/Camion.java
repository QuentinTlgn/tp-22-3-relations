package HistoireDeVoitures;

public class Camion extends Voiture {
	private int poids;
	
	public Camion(int vitesseMax, float prixDeBase, String couleur, int poids) {
		super(vitesseMax, prixDeBase, couleur);
		this.poids = poids;
	}

	public double calculerPrixDeVente() {
		if(poids > 2000) {
			return super.calculerPrixDeVente()*0.9;
		}
		else return super.calculerPrixDeVente()*0.8;
	}
}
