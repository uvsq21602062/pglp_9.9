package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe héritant de la classe abstraite DAO permettant la gestion des
 * cercles dans la bdd
 * @author jean
 *
 */
public class CercleDAO extends DAO<Cercle>{
	
	/**
	 * Constructeur de la classe
	 */
	public CercleDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(this.urlConnexion, this.username, this.password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de donner tous les cercles dans la bdd
	 */
	public ArrayList<Cercle> toutObtenir() {
		ArrayList<Cercle> listCercle = new ArrayList<Cercle>();
		try {
			PreparedStatement p = this.conn.prepareStatement("select * from Cercle");
			ResultSet result = p.executeQuery();
			while(result.next()) {
				Cercle c = new Cercle(result.getInt("rayon"),
						result.getString("nom"),
						result.getInt("x"),
						result.getInt("y"));
				listCercle.add(c);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return listCercle;
	}
	
	/**
	 * Méthode permettant d'ajouter un cercle dans la bdd
	 */
	public void ajouter(Cercle c) {
		try {
			PreparedStatement p = this.conn.prepareStatement("insert into Cercle values(?, ?, ?, ?)");
			p.setString(1, c.getNom());
			p.setInt(2, c.getRayon());
			p.setInt(3, c.getX());
			p.setInt(4, c.getY());
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de modifier dans la bdd un cercle
	 */
	public void modifier(Cercle c) {
		try {
			PreparedStatement p = this.conn.prepareStatement("update Cercle set x = ?, y = ? where nom = ?");
			p.setInt(1, c.getX());
			p.setInt(2, c.getY());
			p.setString(3, c.getNom());
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
