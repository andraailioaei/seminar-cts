package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParam() {
		String nume = "Gigi";
		Student student = new Student(nume);

		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testConstructorFaraParam() {
		String nume = "Student";
		Student student = new Student();

		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testRestante() {
		Student student = new Student();
		student.adaugaNota(3);
		student.adaugaNota(7);
		
		assertTrue("Studentul care are restanta este marcat ca neavand restanta", student.areRestante());
	}
	
	@Test
	public void testFaraRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(7);
		
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta", student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(8);
		
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testNotaAdaugataCorecta() {
		Student student = new Student();
		int nota = 7;
		student.adaugaNota(nota);
		
		assertEquals(nota, student.getNota(0));
	}
}
