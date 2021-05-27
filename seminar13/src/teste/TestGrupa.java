package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {

	public Grupa grupa;
	@Before
	public void setUp() {
		grupa = new Grupa(1003);
		for( int i=0; i<10; i++) {
			Student student = new Student("Student"+i);
			student.adaugaNota(5);
			student.adaugaNota(4);
			student.adaugaNota(10);

			grupa.adaugaStudent(student);
		}
	}
	
	@Test
	public void testPromovabilitateRight() {
		Student s1 = new Student("Ion");
		s1.adaugaNota(8);
		s1.adaugaNota(9);
		Student s2 = new Student("Ion");
		s2.adaugaNota(5);
		s2.adaugaNota(6);
		
		grupa.adaugaStudent(s1);
		grupa.adaugaStudent(s2);

		assertEquals(0.16, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testPromovabilitateLimitaInferioara() {
		
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupaNoua= new Grupa(1003);
		Student s1 = new Student("Ion");
		s1.adaugaNota(8);
		s1.adaugaNota(9);
		Student s2 = new Student("Ion");
		s2.adaugaNota(7);
		s2.adaugaNota(6);
		
		Student s3 = new Student("Ion");
		s2.adaugaNota(7);
		s2.adaugaNota(8);
		
		grupaNoua.adaugaStudent(s1);
		grupaNoua.adaugaStudent(s2);
		grupaNoua.adaugaStudent(s3);
		assertEquals(1, grupaNoua.getPromovabilitate(), 0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPromovabilitateErrorInferior() {
		Grupa grupa2= new Grupa(1040);
		grupa2.getPromovabilitate();
	}
	
	@Test(timeout = 500)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
		
	}
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
