package ro.ase.cts.Adapter.clase;

public class Bilet {

	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}
	
	public void rezerva() {
		System.out.println("A fost rezervat biletul cu pretul= "+pret);
	}
	
	public void vinde() {
		System.out.println("A fost vandul biletul cu pretul= "+pret);
	}
}
