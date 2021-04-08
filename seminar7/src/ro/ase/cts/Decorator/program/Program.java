package ro.ase.cts.Decorator.program;

import ro.ase.cts.Decorator.clase.Bilet;
import ro.ase.cts.Decorator.clase.Decorator;
import ro.ase.cts.Decorator.clase.Decorator2;
import ro.ase.cts.Decorator.clase.DecoratorAbstract;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB", "Dinamo", "Gigel");
		bilet.rezerva();

		Decorator decorator = new Decorator(bilet);
		decorator.rezerva();
		System.out.println("\n");
		Decorator2 decorator2 = new Decorator2(bilet);
		decorator2.rezerva();
		
		System.out.println("\n");
		DecoratorAbstract decorator3 = new Decorator2(decorator);
		decorator3.rezerva();
	}

}
