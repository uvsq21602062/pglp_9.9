package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe héritant de Forme et représentant un Carre
 * @author jean
 *
 */
public class Carre extends Forme {
	/**
	 * Attribut stockant la longueur du carré
	 */
	private int longueur;
	
	/**
	 * Constructeur de la classe
	 */
	public Carre(int longueur, String nom, int x, int y) {
		this.longueur = longueur;
		super.type = TypeForme.CARRE;
		super.nom = nom;
		super.x = x;
		super.y = y;
	}
	
	/**
	 * Getter de l'attribut longueur
	 */
	public int getLongueur() {
		return this.longueur;
	}
}
