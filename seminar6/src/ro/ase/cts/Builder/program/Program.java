package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.clase.Builder;
import ro.ase.cts.Builder.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Rezervare rezervare1 = builder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2 = new Builder().setAreMancareInclusa(true).build();

		System.out.println(rezervare1);
		System.out.println(rezervare2);	
	}

}
