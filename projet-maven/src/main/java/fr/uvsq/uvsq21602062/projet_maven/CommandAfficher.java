package fr.uvsq.uvsq21602062.projet_maven;

import java.util.ArrayList;

/**
 * Classe implementant Command permettant l'affichage des formes.
 * @author jean
 *
 */
public class CommandAfficher implements Command {
	/**
	 * Constructeur de la classe
	 */
	CommandAfficher() {
	}
	
	/**
	 * Méthode s'occupant de l'execution de cette commande
	 */
	public void execute() {
		CompositeForme compoForme = new CompositeForme();
		DAO<Triangle> triangleDAO = new TriangleDAO();
		DAO<Rectangle> rectangleDAO = new RectangleDAO();
		DAO<Cercle> cercleDAO = new CercleDAO();
		DAO<Carre> carreDAO = new CarreDAO();
		ArrayList<Triangle> listTriangle = triangleDAO.toutObtenir();
		ArrayList<Rectangle> listRectangle = rectangleDAO.toutObtenir();
		ArrayList<Cercle> listCercle = cercleDAO.toutObtenir();
		ArrayList<Carre> listCarre = carreDAO.toutObtenir();
		for(int i = 0; i < listTriangle.size(); i++) {
			compoForme.ajout(listTriangle.get(i));
		}
		for(int i = 0; i < listRectangle.size(); i++) {
			compoForme.ajout(listRectangle.get(i));
		}
		for(int i = 0; i < listCercle.size(); i++) {
			compoForme.ajout(listCercle.get(i));
		}
		for(int i = 0; i < listCarre.size(); i++) {
			compoForme.ajout(listCarre.get(i));
		}
		System.out.println("\n" + compoForme.toString() + "\n");
	}
}
