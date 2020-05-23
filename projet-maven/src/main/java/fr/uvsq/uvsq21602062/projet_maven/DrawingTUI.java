package fr.uvsq.uvsq21602062.projet_maven;

import java.util.Scanner;

/**
 * Classe se chargeant d'interpréter ce que l'utilisateur demande.
 * @author jean
 *
 */
public class DrawingTUI {
	/**
	 * Attribut stockant le scanner pour lire ce que l'utilisateur entre
	 */
	private Scanner scan;
	
	/**
	 * Constructeur de la classe
	 */
	public DrawingTUI() {
		this.scan = new Scanner(System.in);
		
		System.out.println("Bonjour, pour créer un cercle veuillez entrer : Cercle(nom_du_cercle, pos_x, pos_y, rayon)");
		System.out.println("Pour créer un carré veuillez entrer : Carre(nom_du_cercle, pos_x, pos_y, longueur)");
		System.out.println("Pour créer un rectangle veuillez entrer : Rectangle(nom_du_cercle, pos_x, pos_y, longueur, largeur)");
		System.out.println("Pour créer un triangle veuillez entrer : Triangle(nom_du_cercle, pos_x, pos_y, coté)");
		System.out.println("Si vous souhaitez déplacer une forme entrez (par exemple pour le cercle) : move(Cercle(nom_cercle, pos_x, pos_y))");
		System.out.println("Entrez print pour afficher vos forme");
		System.out.println("Entrez quit si vous souhaitez quitter.");
	}
	
	/**
	 * Interprete la ligne entré par l'utilisateur.
	 * Cette méthode retourne 0 lorsqu'on quite.
	 */
	public boolean prochaineLigne() {
		String saisie = this.scan.nextLine();
		saisie = saisie.replace(" ", "");
		saisie = saisie.replaceAll("[(),]", " ");
		String[] saisieSeparee = saisie.split(" ");
		Forme forme;
		
 		if(saisieSeparee[0].equals("Cercle")) {
			try {
				String nom = saisieSeparee[1];
				int x = Integer.parseInt(saisieSeparee[2]);
				int y = Integer.parseInt(saisieSeparee[3]);
				int rayon = Integer.parseInt(saisieSeparee[4]);
				forme = new Cercle(rayon, nom, x, y);
				Command c = new CommandCreation(forme);
				c.execute();
			}
			catch(NumberFormatException e) {
				System.out.println("Erreur : le format de la ligne n'est pas correcte.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur : pas assez d'argument ont été renseigné.");
			}
		}
 		else if(saisieSeparee[0].equals("Carre")) {
			try {
				String nom = saisieSeparee[1];
				int x = Integer.parseInt(saisieSeparee[2]);
				int y = Integer.parseInt(saisieSeparee[3]);
				int longueur = Integer.parseInt(saisieSeparee[4]);
				forme = new Carre(longueur, nom, x, y);
				Command c = new CommandCreation(forme);
				c.execute();
			}
			catch(NumberFormatException e) {
				System.out.println("Erreur le format de la ligne n'est pas correcte");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur : pas assez d'argument ont été renseigné.");
			}
		}
 		else if(saisieSeparee[0].equals("Rectangle")) {
			try {
				String nom = saisieSeparee[1];
				int x = Integer.parseInt(saisieSeparee[2]);
				int y = Integer.parseInt(saisieSeparee[3]);
				int longueur = Integer.parseInt(saisieSeparee[4]);
				int largeur = Integer.parseInt(saisieSeparee[5]);
				forme = new Rectangle(longueur, largeur, nom, x, y);
				Command c = new CommandCreation(forme);
				c.execute();
			}
			catch(NumberFormatException e) {
				System.out.println("Erreur le format de la ligne n'est pas correcte");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur : pas assez d'argument ont été renseigné.");
			}
		}
 		else if(saisieSeparee[0].equals("Triangle")) {
			try {
				String nom = saisieSeparee[1];
				int x = Integer.parseInt(saisieSeparee[2]);
				int y = Integer.parseInt(saisieSeparee[3]);
				int longueur = Integer.parseInt(saisieSeparee[4]);
				forme = new Triangle(longueur, nom, x, y);
				Command c = new CommandCreation(forme);
				c.execute();
			}
			catch(NumberFormatException e) {
				System.out.println("Erreur le format de la ligne n'est pas correcte");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur : pas assez d'argument ont été renseigné.");
			}
		}
 		else if(saisieSeparee[0].equals("move")) {
			try {
				if(saisieSeparee[1].equals("Cercle")) {
					String nom = saisieSeparee[2];
					int x = Integer.parseInt(saisieSeparee[3]);
					int y = Integer.parseInt(saisieSeparee[4]);
					forme = new Cercle(0, nom, x, y);
					Command c = new CommandDeplacer(forme);
					c.execute();
				}
				else if(saisieSeparee[1].equals("Carre")) {
					String nom = saisieSeparee[2];
					int x = Integer.parseInt(saisieSeparee[3]);
					int y = Integer.parseInt(saisieSeparee[4]);
					forme = new Carre(0, nom, x, y);
					Command c = new CommandDeplacer(forme);
					c.execute();
				}
				else if(saisieSeparee[1].equals("Rectangle")) {
					String nom = saisieSeparee[2];
					int x = Integer.parseInt(saisieSeparee[3]);
					int y = Integer.parseInt(saisieSeparee[4]);
					forme = new Rectangle(0, 0, nom, x, y);
					Command c = new CommandDeplacer(forme);
					c.execute();
				}
				else if(saisieSeparee[1].equals("Triangle")) {
					String nom = saisieSeparee[2];
					int x = Integer.parseInt(saisieSeparee[3]);
					int y = Integer.parseInt(saisieSeparee[4]);
					forme = new Triangle(0, nom, x, y);
					Command c = new CommandDeplacer(forme);
					c.execute();
				}
				else {
					System.out.print("Erreur : la chaine entrée n'est pas reconnu.");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Erreur le format de la ligne n'est pas correcte");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erreur : pas assez d'argument ont été renseigné.");
			}
		}
 		else if(saisieSeparee[0].equals("print")) {
 			Command c = new CommandAfficher();
 			c.execute();
 		}
 		else if(saisieSeparee[0].equals("quit")) {
 			System.out.println("Au revoir");
 			return false;
 		}
		else {
			System.out.println("Erreur : la chaine entrée n'est pas reconnu.");
		}
 		return true;
	}
}
