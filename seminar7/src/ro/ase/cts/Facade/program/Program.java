package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.BazaDeDateHuligani;
import ro.ase.cts.Facade.clase.Bilet;
import ro.ase.cts.Facade.clase.Facade;
import ro.ase.cts.Facade.clase.Persoana;
import ro.ase.cts.Facade.clase.Politie;

public class Program {

	public static void main(String[] args) {
		Persoana p1 = new Persoana("Mihai", "1992365412588");
		Bilet b1 = new Bilet("Mihai", "12B");
		
//		if(p1.getNume().equals(b1.getNume())) {
//			if(!Politie.esteUrmarita(p1))
//			{
//				if(BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
//					System.out.println("Puteti intra :)");
//				}
//			}
//		}
		
		Persoana p2 = new Persoana("Ioan", "1995465419688");
		Bilet bb = new Bilet("Ioan", "11A");
		if(Facade.verifica(p2, bb))
			System.out.println("Puteti intra :)");
		else
			System.out.println("Ne pare rau, nu puteti intra :(");

	}

}
