package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Classe implementant l'interface Command s'occupant de créer une nouvelle forme.
 * @author jean
 *
 */
public class CommandCreation implements Command {
	/**
	 * Attribut stockant la forme à créer
	 */
	private Forme forme;
	
	/**
	 * Constructeur de la classe
	 */
	CommandCreation(Forme forme) {
		this.forme = forme;
	}
	
	/**
	 * Méthode s'occupant de l'execution de cette commande
	 */
	public void execute() {
		if(this.forme.getType() == TypeForme.TRIANGLE) {
			DAO<Triangle> bdd = new TriangleDAO();
			bdd.ajouter((Triangle) this.forme); 
		}
		else if(this.forme.getType() == TypeForme.CARRE) {
			DAO<Carre> bdd = new CarreDAO();
			bdd.ajouter((Carre) this.forme); 
		}
		else if(this.forme.getType() == TypeForme.CERCLE) {
			DAO<Cercle> bdd = new CercleDAO();
			bdd.ajouter((Cercle) this.forme);
		}
		else {
			DAO<Rectangle> bdd = new RectangleDAO();
			bdd.ajouter((Rectangle) this.forme); 
		}
	}
}
