package ro.ase.cts.clase;
import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata = 20;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAnStudii(int an_studii) {
		this.anStudii = an_studii;
	}

	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder("Studentul: ");
		str.append(super.toString()).append(" Facultate= ").append(facultate).append(", An studii= ").append(anStudii);
		return str.toString();
	}
	
	@Override
	public float getSumaFinantata() {
		return sumaFinantata;
	}
	
	public static float getFinantare() {
		return sumaFinantata;
	}
	public static void setSumaFinantata(int sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}
	
	
}
