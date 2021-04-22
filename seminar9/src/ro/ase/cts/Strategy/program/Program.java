package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.Card;
import ro.ase.cts.Strategy.clase.Cash;
import ro.ase.cts.Strategy.clase.Client;

public class Program {

	public static void main(String[] args) {
		Card card= new Card(1000);
		Client client= new Client("Ioana", card);
		client.platesteNota(320);
		client.setModPlata(new Cash());
		client.platesteNota(210);
		client.setModPlata(card);
		client.platesteNota(950);
	}

}
