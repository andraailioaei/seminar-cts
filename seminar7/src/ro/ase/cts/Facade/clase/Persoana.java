package ro.ase.cts.Facade.clase;

public class Persoana {
	private String nume;
	private String cnp;
	
	
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persoana [nume=");
		builder.append(nume);
		builder.append(", cnp=");
		builder.append(cnp);
		builder.append("]");
		return builder.toString();
	}
	public String getNume() {
		return nume;
	}
	public String getCnp() {
		return cnp;
	}
	
	
}
