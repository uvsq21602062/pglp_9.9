package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetLongueur() {
		Rectangle r = new Rectangle(4, 5, "R", 2, 3);
		assertTrue(r.getLongueur() == 4);
	}
	
	@Test
	public void testGetLargeur() {
		Rectangle r = new Rectangle(4, 5, "R", 2, 3);
		assertTrue(r.getLargeur() == 5);
	}
	@Test
	public void testGetNom() {
		Rectangle r = new Rectangle(4, 5, "R", 2, 3);
		assertTrue(r.getNom() == "R");
	}

}
