package ro.ase.cts.Facade.clase;

public class Facade {
	
	public static boolean verifica(Persoana p1, Bilet b1) {
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarita(p1))
			{
				if(BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					return true;
				}
			}
		}
		return false;
	}
}
