package ro.ase.cts.Observer.clase;

public class Client implements Observer{

	private String nume;
	
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println("Clientul "+this.nume+" a primit mesajul: \n "+mesaj);
	}

}
