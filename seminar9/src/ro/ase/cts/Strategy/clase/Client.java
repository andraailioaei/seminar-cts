package ro.ase.cts.Strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	
	public Client(String nume, ModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}
	public ModPlata getModPlata() {
		return modPlata;
	}
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(float suma) {
		System.out.println(nume+" are de platit: "+suma+" lei");
		this.modPlata.achita(suma);
	}
	

}
