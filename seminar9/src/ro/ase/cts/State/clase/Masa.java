package ro.ase.cts.State.clase;

public class Masa {
	
	private String nrMasa;
	private Stare stare;
	
	public Masa(String nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new Libera();
	}

	public void setNrMasa(String nrMasa) {
		this.nrMasa = nrMasa;
	}

	//il lasam default ca sa nu putem sa il apelam din main
	void setStare(Stare stare) {
		this.stare = stare;
	}

	public String getNrMasa() {
		return nrMasa;
	}

	public Stare getStare() {
		return stare;
	}
	
	public void rezerva() {
		Rezervata rezervata= new Rezervata();
		rezervata.schimbaStare(this);
	}
	
	public void ocupa() {
		Ocupata ocupata= new Ocupata();
		ocupata.schimbaStare(this);
	}
	public void elibereaza() {
		Libera libera=new Libera();
		libera.schimbaStare(this);
	}
}
