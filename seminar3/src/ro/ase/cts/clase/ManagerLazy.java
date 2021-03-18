package ro.ase.cts.clase;

public class ManagerLazy {
	private int marca;
	private String nume;
	private int varsta;
	private static ManagerLazy instance = null;
	
	//si pentru ThreadSafe punem syncronized la functie
	public static synchronized ManagerLazy getInstance(int marca, String nume, int varsta) {
		if(instance == null) {
			instance = new ManagerLazy(marca, nume, varsta);
		}
		return instance;
	}

	private ManagerLazy(int marca, String nume, int varsta) {
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

	
}
