package HistoireDeVoitures;

public class Voiture {
	private int vitesseMax;
	private double prixDeBase;
	private String couleur;
	
	public int getVitesseMax() {
		return vitesseMax;
	}

	public double getPrixDeBase() {
		return prixDeBase;
	}

	public String getCouleur() {
		return couleur;
	}

	public Voiture(int vitesseMax, float prixDeBase, String couleur) {
		this.vitesseMax = vitesseMax;
		this.prixDeBase = prixDeBase;
		this.couleur = couleur;
	}

	public double calculerPrixDeVente() {
		return prixDeBase;
	}
	
}
