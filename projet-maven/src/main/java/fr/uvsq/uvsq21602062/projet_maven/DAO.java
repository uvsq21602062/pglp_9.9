package fr.uvsq.uvsq21602062.projet_maven;

import java.sql.Connection;

	

/**
 * Classe abstraite implémentant le design patern DAO
 * @author jean
 *
 * @param <T>
 */
public abstract class DAO<T> {
	/**
	 * Attribut stockant le nom de l'utilisateur de la bdd
	*/
	protected String username = "jdbc-user";
	
	/**
	 * Attribut stockant le mdp de l'utilisateur
	 */
	protected String password = "1234";

	/**
	 * Attribut stockant l'url de connexion à la bdd
	 */
	protected String urlConnexion = "jdbc:mysql://localhost:3306/Forme?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	/**
	 * Attribut stockant la connexion à la bdd
	 */
	protected Connection conn;
			
	/**
	 * Méthode permettant de trouver dans la bdd une certaine forme
	 */
	public abstract T trouverParNom(String nom);
	
	/**
	 * Méthode permettant d'ajouter une cetaine forme dans la bdd
	 */
	public abstract void ajouter(T forme); 
	
	/**
	 * Méthode permettant de modifier dans la bdd une certaine forme
	 */
	public abstract void modifier(T forme);
}
