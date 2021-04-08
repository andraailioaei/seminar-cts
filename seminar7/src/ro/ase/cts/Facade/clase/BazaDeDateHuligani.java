package ro.ase.cts.Facade.clase;

public class BazaDeDateHuligani {
	public static boolean esteInListaDeHuligani(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCnp().charAt(12)) %2 == 0) 
			return true;
		else
			return false;
	}
}
