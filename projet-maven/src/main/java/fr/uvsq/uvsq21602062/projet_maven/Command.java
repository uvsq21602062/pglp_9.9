package fr.uvsq.uvsq21602062.projet_maven;

/**
 * Interface représentant les fonctions communes des differentes commandes.
 * @author jean
 *
 */

public interface Command {
	/**
	 * Fonction executant la commande en particulier. La valeur de retour correspond au succes
	 * ou non de l'execution.
	 */
	public void execute();
}
