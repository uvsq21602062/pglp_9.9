package fr.uvsq.uvsq21602062.projet_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeFormeTest {

	@Test
	public void testAjout() {
		CompositeForme f = new CompositeForme();
		Forme f1 = new Triangle(4, "T", 3, 2);
		Forme f2 = new Cercle(5, "C", 1, 0);
		f.ajout(f1);
		f.ajout(f2);
		assertEquals(f.getForme("T"), f1);
	}
	
	@Test
	public void testDeplacer() {
		CompositeForme f = new CompositeForme();
		Forme f1 = new Triangle(4, "T", 3, 2);
		Forme f2 = new Cercle(5, "C", 1, 0);
		f.ajout(f1);
		f.ajout(f2);
		f.deplacer("T", 8, 9);
		assertTrue(f.getForme("T").getX() == 8);
	}

}
