package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa= new Grupa(1003);
		
		assertEquals(1003, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa= new Grupa(1000);
		
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa= new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorInferior() {
		Grupa grupa= new Grupa(100);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorSuperior() {
		Grupa grupa= new Grupa(1200);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa= new Grupa(1000);
		
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa1= new Grupa(1100);
		assertNotNull(grupa1.getStudenti());
	}
}
