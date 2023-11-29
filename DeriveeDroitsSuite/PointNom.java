package DeriveeDroitsSuite;

public class PointNom extends Point {
	private String nom;
	
	public void setPointNom(int x, int y, String nom) {
		setPoint(x,y);
		this.nom = nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void affCordNom() {
		super.afficheCoords();
		System.out.println("Nom : "+nom);
	}
	
	public PointNom(int x, int y, String nom) {
		setPointNom(x,y,nom);
	}
	
	public static void afficheCoords(PointNom pt) {
		pt.afficheCoords();
	}
}
