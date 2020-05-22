package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetLongueur() {
		Triangle t = new Triangle(5, "T", 4, 2);
		assertTrue(t.getLongueur() == 5);
	}
	
	@Test
	public void testGetNom() {
		Triangle t = new Triangle(5, "T", 4, 2);
		assertTrue(t.getNom() == "T");
	}

}
