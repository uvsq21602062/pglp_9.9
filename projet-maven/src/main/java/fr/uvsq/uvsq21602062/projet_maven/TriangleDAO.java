package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.DriverManager;

/**
 * Classe héritant de la classe abstraite DAO permettant la gestion des
 * triangles dans la bdd
 * @author jean
 *
 */
public class TriangleDAO extends DAO<Triangle>{
	
	/**
	 * Constructeur de la classe
	 */
	public TriangleDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.bddName, this.username, this.password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de trouver dans la bdd un triangle
	 */
	public Triangle trouverParNom(String nom) {
		return null;
	}
	
	/**
	 * Méthode permettant d'ajouter un triangle dans la bdd
	 */
	public void ajouter(Triangle t) {
		
	}
	
	/**
	 * Méthode permettant de modifier dans la bdd un triangle
	 */
	public void modifier(Triangle t) {
		
	}
}
