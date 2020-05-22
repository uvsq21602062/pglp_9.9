package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe héritant de Forme représentant un triangle isocèle.
 * @author jean
 *
 */
public class Triangle extends Forme {
	/**
	 * Attribut représentant la longueur du triangle.
	 */
	private int longueur;
	
	/**
	 * Constructeur de la classe.
	 */
	public Triangle(int longueur, String nom, int x, int y) {
		this.longueur = longueur;
		super.type = TypeForme.TRIANGLE;
		super.nom = nom;
		super.x = x;
		super.y = y;
	}
	
	/**
	 * Getter de l'attribut longueur;
	 */
	public int getLongueur() {
		return this.longueur;
	}
}
