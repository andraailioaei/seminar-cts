package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;
import dubluri.StudentStub;

public class TestGrupaWithStub {

	Grupa grupa;
	
	@Test
	public void testPromovabilitate() {
		IStudent student= new StudentStub();
		grupa= new Grupa(1004);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}


}
