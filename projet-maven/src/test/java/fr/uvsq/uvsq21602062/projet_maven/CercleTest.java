package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CercleTest {

	@Test
	public void testGetRayon() {
		Cercle c = new Cercle(4, "C", 3, 2);
		assertTrue(c.getRayon() == 4);
	}
	
	@Test
	public void testGetNom() {
		Cercle c = new Cercle(4, "C", 3, 2);
		assertTrue(c.getNom() == "C");
	}

}
