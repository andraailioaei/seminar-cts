package ro.ase.cts.ChainOfResponsability.clase;

public abstract class Cont {

	private String detinator;
	private float sold;
	private Cont succesor;
	
	
	public Cont(String detinator, float sold) {
		super();
		this.detinator = detinator;
		this.sold = sold;
		this.succesor = null;
	}

	public void setSuccesor(Cont cont) {
		this.succesor = cont;
	}
	
	protected String getDetinator() {
		return detinator;
	}

	protected float getSold() {
		return sold;
	}

	protected Cont getSuccesor() {
		return succesor;
	}

	protected void setSold(float sold) {
		this.sold = sold;
	}

	public abstract void realizeazaPlata(float suma);
}
