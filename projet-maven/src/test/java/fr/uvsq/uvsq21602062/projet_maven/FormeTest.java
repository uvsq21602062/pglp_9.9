package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormeTest {

	@Test
	public void testGetType() {
		Forme f = new Cercle(4, "F", 3, 2);
		assertTrue(f.getType() == TypeForme.CERCLE);
	}
	
	@Test
	public void testGetNom() {
		Forme f = new Cercle(4, "F", 3, 2);
		assertTrue(f.getNom() == "F");
	}
	
	@Test
	public void testGetX() {
		Forme f = new Cercle(4, "F", 3, 2);
		assertTrue(f.getX() == 3);
	}
	
	@Test
	public void testGetY() {
		Forme f = new Cercle(4, "F", 3, 2);
		assertTrue(f.getY() == 2);
	}
	
	@Test
	public void testSetX() {
		Forme f = new Cercle(4, "F", 3, 2);
		f.setX(1);
		assertTrue(f.getX() == 1);
	}
	
	@Test
	public void testSetY() {
		Forme f = new Cercle(4, "F", 3, 2);
		f.setY(1);
		assertTrue(f.getY() == 1);
	}

}
