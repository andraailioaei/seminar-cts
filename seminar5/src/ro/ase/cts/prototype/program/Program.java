package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Client;
import ro.ase.cts.prototype.clase.ClientPrototype;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Gigi", 34, "romana", 111);
		ClientPrototype client2 = client1.copiaza();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
	}

}
