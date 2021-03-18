package ro.ase.cts.program;

import ro.ase.cts.clase.Manager;
import ro.ase.cts.clase.ManagerLazy;

public class Main {

	public static void main(String[] args) {

		// eager
		Manager manager = Manager.getInstance();
		Manager manager1 = Manager.getInstance();
		System.out.println(manager.toString());
		System.out.println(manager1.toString());

		// lazy
		ManagerLazy managerLazy1 = ManagerLazy.getInstance(1200, "Man", 44);
		ManagerLazy managerLazy2 = ManagerLazy.getInstance(1300, "Man2", 52);
		managerLazy2.setNume("Ioan");
		managerLazy2.setVarsta(55);
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	}

}
