package ro.ase.cts.simplefactory.clase;

public class JucatorFactory {
	
	public static Jucator createJucator(TipJucator tip, String nume) throws Exception {
		switch(tip) { 
			case Portar: 
				return new Portar(nume);
			case Fundas:
				return new Fundas(nume);
			case Atacant: 
				return new Atacant(nume);
			default:
				throw new Exception("Tip inexistent");
		} 
	}
}
