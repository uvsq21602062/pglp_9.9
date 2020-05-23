package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(this.urlConnexion, this.username, this.password);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant d'obtenir tous les Triangle dans la bdd
	 */
	public ArrayList<Triangle> toutObtenir() {
		ArrayList<Triangle> listTriangle = new ArrayList<Triangle>();
		try {
			PreparedStatement p = this.conn.prepareStatement("select * from Triangle");
			ResultSet result = p.executeQuery();
			while(result.next()) {
				Triangle t = new Triangle(result.getInt("longueur"),
						result.getString("nom"),
						result.getInt("x"),
						result.getInt("y"));
				listTriangle.add(t);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return listTriangle;
	}
	
	/**
	 * Méthode permettant d'ajouter un triangle dans la bdd
	 */
	public void ajouter(Triangle t) {
		try {
			PreparedStatement p = this.conn.prepareStatement("insert into Triangle values(?, ?, ?, ?)");
			p.setString(1, t.getNom());
			p.setInt(2, t.getLongueur());
			p.setInt(3, t.getX());
			p.setInt(4, t.getY());
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Méthode permettant de modifier dans la bdd un triangle
	 */
	public void modifier(Triangle t) {
		try {
			PreparedStatement p = this.conn.prepareStatement("update Triangle set x = ?, set y = ? where nom = ?");
			p.setInt(1, t.getX());
			p.setInt(2, t.getY());
			p.setString(3, t.getNom());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
