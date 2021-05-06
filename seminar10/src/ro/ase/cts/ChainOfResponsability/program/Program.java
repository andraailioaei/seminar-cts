package ro.ase.cts.ChainOfResponsability.program;

import ro.ase.cts.ChainOfResponsability.clase.Cont;
import ro.ase.cts.ChainOfResponsability.clase.ContCurent;
import ro.ase.cts.ChainOfResponsability.clase.ContDeCredit;
import ro.ase.cts.ChainOfResponsability.clase.ContEconomii;
import ro.ase.cts.ChainOfResponsability.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent= new ContCurent("Andra", 100);
		Cont contEconomiiCont= new ContEconomii("Andra", 200);
		Cont contDeCreditCont= new ContDeCredit("Andra", 500);
		Cont contIndisponibil= new ContIndisponibil("Andra");
		
		contCurent.setSuccesor(contEconomiiCont);
		contEconomiiCont.setSuccesor(contDeCreditCont);
		contDeCreditCont.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(70);
		contCurent.realizeazaPlata(210);
		contCurent.realizeazaPlata(410);
	}

}
