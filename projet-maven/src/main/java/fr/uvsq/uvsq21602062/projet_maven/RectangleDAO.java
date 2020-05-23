package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe héritant de la classe abstraite DAO permettant la gestion des
 * rectangles dans la bdd
 * @author jean
 *
 */
public class RectangleDAO extends DAO<Rectangle>{
	
	/**
	 * Constructeur de la classe
	 */
	public RectangleDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(this.urlConnexion, this.username, this.password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de trouver dans la bdd un rectangle
	 */
	public Rectangle trouverParNom(String nom) {
		Rectangle r = null;
		try {
			PreparedStatement p = this.conn.prepareStatement("select * from Rectangle where nom = ?");
			p.setString(1, nom);
			ResultSet result = p.executeQuery();
			if(result.first()) {
				r = new Rectangle(result.getInt("longueur"),
						result.getInt("largeur"),
						result.getString("nom"),
						result.getInt("x"),
						result.getInt("y"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	/**
	 * Méthode permettant d'ajouter un rectangle dans la bdd
	 */
	public void ajouter(Rectangle r) {
		try {
			PreparedStatement p = this.conn.prepareStatement("insert into Rectangle values(?, ?, ?, ?, ?)");
			p.setString(1, r.getNom());
			p.setInt(2, r.getLongueur());
			p.setInt(3, r.getLargeur());
			p.setInt(3, r.getX());
			p.setInt(4, r.getY());
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de modifier dans la bdd un rectangle
	 */
	public void modifier(Rectangle r) {
		try {
			PreparedStatement p = this.conn.prepareStatement("update Rectangle set x = ?, set y = ? where nom = ?");
			p.setInt(1, r.getX());
			p.setInt(2, r.getY());
			p.setString(3, r.getNom());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}