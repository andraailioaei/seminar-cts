package ro.ase.cts.clase;

public class Manager {
	//eager initialization
	private int marca;
	private String nume;
	private int varsta;
	private static Manager instance = new Manager(1000, "Managerul", 34);
	
	private Manager(int marca, String nume, int varsta) {
		super();
		this.marca = marca;
		this.nume = nume;
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Manager [marca=" + marca + ", nume=" + nume + ", varsta=" + varsta + "]";
	}

	public static Manager getInstance() {
		return instance;
	}
	
	
}
