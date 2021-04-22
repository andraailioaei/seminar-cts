package ro.ase.cts.State.program;

import ro.ase.cts.State.clase.Libera;
import ro.ase.cts.State.clase.Masa;

public class Program {
	
	public static void main (String args[]) {
		Masa masa = new Masa("100");
		masa.rezerva();
		masa.ocupa();
		//masa.rezerva();
		//masa.setStare(new Libera());
		masa.rezerva();
		masa.elibereaza();
		
	}
}
