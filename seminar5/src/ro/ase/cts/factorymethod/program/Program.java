package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.FundasFactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class Program {

	public static void printJucator(JucatorFactory factory, String nume) {
		Jucator jucator1 = factory.createJucator(nume);
		System.out.println(jucator1.toString());
		
	}
	public static void main(String[] args) {
		printJucator(new FundasFactory(), "Andrei");
		printJucator(new PortarFactory(), "Vasi");
		printJucator(new MijlocasFactory(), "Ion");
	}

}
