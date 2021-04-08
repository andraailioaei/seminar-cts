package ro.ase.cts.Adapter.program;

import ro.ase.cts.Adapter.clase.AdapterBilet;
import ro.ase.cts.Adapter.clase.AdapterBiletObiecte;
import ro.ase.cts.Adapter.clase.Bilet;
import ro.ase.cts.Adapter.clase.BiletOnline;

public class Program {

	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	public static void main(String[] args) {
		Bilet bilet = new Bilet(100);
//		rezervaSiVindeBilet(bilet);
		
		BiletOnline biletOnline = new AdapterBilet(50);
		rezervaSiVindeBilet(biletOnline);
		
		AdapterBiletObiecte adapter = new AdapterBiletObiecte(bilet);
		rezervaSiVindeBilet(adapter);
	}

}
