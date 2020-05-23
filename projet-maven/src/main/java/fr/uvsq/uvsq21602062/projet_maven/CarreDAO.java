package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe héritant de la classe abstraite DAO permettant la gestion des
 * carres dans la bdd
 * @author jean
 *
 */
public class CarreDAO extends DAO<Carre>{
	
	/**
	 * Constructeur de la classe
	 */
	public CarreDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(this.urlConnexion, this.username, this.password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de trouver dans la bdd un carre
	 */
	public Carre trouverParNom(String nom) {
		Carre c = null;
		try {
			PreparedStatement p = this.conn.prepareStatement("select * from Carre where nom = ?");
			p.setString(1, nom);
			ResultSet result = p.executeQuery();
			if(result.first()) {
				c = new Carre(result.getInt("longueur"),
						result.getString("nom"),
						result.getInt("x"),
						result.getInt("y"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	/**
	 * Méthode permettant d'ajouter un carre dans la bdd
	 */
	public void ajouter(Carre c) {
		try {
			PreparedStatement p = this.conn.prepareStatement("insert into Carre values(?, ?, ?, ?)");
			p.setString(1, c.getNom());
			p.setInt(2, c.getLongueur());
			p.setInt(3, c.getX());
			p.setInt(4, c.getY());
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de modifier dans la bdd un carre
	 */
	public void modifier(Carre c) {
		try {
			PreparedStatement p = this.conn.prepareStatement("update Carre set x = ?, set y = ? where nom = ?");
			p.setInt(1, c.getX());
			p.setInt(2, c.getY());
			p.setString(3, c.getNom());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}