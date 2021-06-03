package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import dubluri.StudentFake;
import teste.categorii.TesteGetPromovabilitate;

public class TestGrupaWithFake {

	@Test
	@Category(TesteGetPromovabilitate.class) 
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);;
		for( int i=0; i<8; i++) {
			StudentFake student= new StudentFake();
			student.setValoareGetRestante(false);
			grupa.adaugaStudent(student);
		}
		
		for(int i=8; i<10; i++) {
			StudentFake student= new StudentFake();
			student.setValoareGetRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
	}

}
