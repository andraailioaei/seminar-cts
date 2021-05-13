package ro.ase.cts.Memento.program;

import ro.ase.cts.Memento.clase.ManagerMemento;
import ro.ase.cts.Memento.clase.MeciJucat;
import ro.ase.cts.Memento.clase.Memento;

public class Program {

	public static void main(String[] args) {
		
		MeciJucat meciJucat= new MeciJucat(100, "FCSB", "Dinamo", 100, 50, 30);
		ManagerMemento managerMemento= new ManagerMemento();
		managerMemento.adauga(meciJucat.creareMemento());
		
		meciJucat.setNrSpectatori(200);
		meciJucat.setEchipaGazda("Chiajna");
		meciJucat.setEchipaOaspeti("Targoviste");
		managerMemento.adauga(meciJucat.creareMemento());
		
		System.out.println(meciJucat.toString());
		meciJucat.revenire(managerMemento.getMemento(0));
		System.out.println(meciJucat.toString());

		
	}

}
