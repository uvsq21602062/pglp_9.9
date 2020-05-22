package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarreTest {

	@Test
	public void testGetLongueur() {
		Carre c = new Carre(4, "C", 3, 2);
		assertTrue(c.getLongueur() == 4);
	}
	
	@Test
	public void testGetNom() {
		Carre c = new Carre(4, "C", 3, 2);
		assertTrue(c.getNom() == "C");
	}
}
