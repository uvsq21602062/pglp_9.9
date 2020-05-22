package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe héritant de la classe Forme représentant un rectangle.
 * @author jean
 *
 */
public class Rectangle extends Forme{
	/**
	 * Attribut stockant la longueur du rectangle.
	 */
	private int longueur;
	
	/**
	 * Attribut stockant la largeur du rectangle.
	 */
	private int largeur;
	
	/**
	 * Constructeur de la classe
	 */
	public Rectangle(int longueur, int largeur, String nom, int x, int y) {
		this.longueur = longueur;
		this.largeur = largeur;
		super.type = TypeForme.RECTANGLE;
		super.nom = nom;
		super.x = x;
		super.y = y;
	}
	
	/**
	 * Getter de l'attribut longueur.
	 */
	public int getLongueur() {
		return this.longueur;
	}
	
	/**
	 * Getter de l'attribut largeur.
	 */
	public int getLargeur() {
		return this.largeur;
	}
}
