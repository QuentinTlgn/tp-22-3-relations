package HistoireDeVoitures;

public class Renault extends Voiture{
	private int anneeFabrication;
	private int reductionConstructeur;

	public Renault(int vitesseMax, float prixDeBase, String couleur, int anneeFabrication, int reductionConstructeur) {
		super(vitesseMax, prixDeBase, couleur);
		this.anneeFabrication = anneeFabrication;
		this.reductionConstructeur=reductionConstructeur;

	}
	
	public double calculerPrixDeVente() {
		return super.calculerPrixDeVente() - reductionConstructeur;
	}

	public int getAnneeFabrication() {
		return anneeFabrication;
	}
}
