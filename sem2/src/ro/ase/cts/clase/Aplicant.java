package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatusInProiect(Proiect proiect){
		
		StringBuilder str = new StringBuilder("Aplicantul ");
		str.append(nume).append(" ").append(prenume).append(" a fost acceptat: ");
		
		str.append((proiect.getPragPunctaj() > 80) ? "da" : "nu");
		System.out.println(str.toString());	
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	public void setDenumiriProiecte(int nr_proiecte,String[] denumireProiect) {
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	@Override
	public String toString() {
		return "nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nr_proiecte=" + nrProiecte + ", denumireProiect=" + Arrays.toString(denumireProiect);
	}
	public abstract float getSumaFinantata();
	
}
