package ro.ase.cts.Decorator.clase;

public class Decorator extends DecoratorAbstract {

	public Decorator(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezerva() {
		super.rezerva();
		System.out.println(" Sustinem echipa gazda "+ ((Bilet)super.getBiletAbstract()).getNumeEchipaGazda());
	}

	
}
