package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Cette classe hérite de la classe abstraite forme.
 * Elle représente un cercle.
 * @author jean
 *
 */
public class Cercle extends Forme{
	/**
	 * Attribut stockant le rayon du cercle.
	 */
	private int rayon;
	
	/**
	 * Constructeur de la classe
	 */
	public Cercle(int rayon, String nom, int x, int y) {
		this.rayon = rayon;
		super.type = TypeForme.CERCLE;
		super.nom = nom;
		super.x = x;
		super.y = y;
	}
	
	/**
	 * Getter de l'attribut rayon
	 */
	public int getRayon() {
		return this.rayon;
	}
}
