package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe qui stockera un ensemble de forme selon le patern composite.
 * Cette classe hérite de la classe abstraite Forme.
 * @author jean
 *
 */
public class CompositeForme extends Forme {
	/**
	 * Attribut stockant une liste de Forme
	 */
	private ArrayList<Forme> listeFormes;
	
	/**
	 * Constructeur de la classe.
	 */
	public CompositeForme() {
		this.listeFormes = new ArrayList<Forme>();
	}
	
	/**
	 * Methode permettant d'obtenir une forme à partir de son nom
	 */
	public Forme getForme(String nom) {
		for(Forme f : this.listeFormes) {
			if(f.getNom().equals(nom))
				return f;
		}
		return null;
	}
	
	/**
	 * Methode permettant l'ajout d'une forme à la liste.
	 */
	public void ajout(Forme f) {
		this.listeFormes.add(f);
	}
	
	/**
	 * Methode permettant de déplacer un ensemble de forme.
	 */
	public void deplacer(String nom, int x, int y) {
		Forme f = this.getForme(nom);
		f.setX(x);
		f.setY(y);
	}
	
	public String toString() {
		String ret = "";
		for(int i = 0; i < this.listeFormes.size(); i++) {
			ret += listeFormes.get(i).toString() + "\n";
		}
		return ret;
	}
}
