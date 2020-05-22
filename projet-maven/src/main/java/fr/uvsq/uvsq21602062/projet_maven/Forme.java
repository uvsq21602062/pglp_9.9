package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe abstraite dont chaque classe représentant une forme héritera.
 * @author jean
 *
 */
public abstract class Forme {
	/**
	 * Cette variable contient le type de la forme (cercle, carre, rectangle ou triangle).
	 */
	protected TypeForme type;
	
	/**
	 * Cette variable contient le nom de l'objet.
	 */
	protected String nom;
	
	/**
	 * Cette variable stock la positon en x de la forme.
	 */
	protected int x;
	
	/**
	 * Cette variable stock la position en y de la forme.
	 */
	protected int y;
	
	/**
	 * Getter de l'attribut type.
	 */
	public TypeForme getType() {
		return this.type;
	}
	
	/**
	 * Getter de l'attribut nom.
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getter de l'attribut x.
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Getter de l'attribut y.
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Setter de l'attribut x.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Setter de l'attribut y.
	 */
	public void setY(int y) {
		this.y = y;
	}
}
