package ro.ase.cts.Facade.clase;

public class Politie {
	public static boolean esteUrmarita(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCnp().charAt(12)) %2 == 0) 
			return true;
		else
			return false;
	}
}
