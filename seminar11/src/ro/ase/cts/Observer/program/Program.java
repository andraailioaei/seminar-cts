package ro.ase.cts.Observer.program;

import ro.ase.cts.Observer.clase.Client;
import ro.ase.cts.Observer.clase.Manager;

public class Program {

	public static void main(String[] args) {
	
		Manager manager= new Manager();
		Client client= new Client("Maria");
		Client client1= new Client("Andrei");
		Client client2= new Client("VIctor");
		
		manager.adaugaObserver(client);
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.anuntaMeciFotbal();
		
		manager.stergeObserver(client);
		manager.anuntaMeciHandbal();

	}
}
