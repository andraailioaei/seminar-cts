package ro.ase.cts.Decorator.clase;

public class Decorator2 extends DecoratorAbstract{

	public Decorator2(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void rezerva() {
		super.rezerva();
		System.out.println(" LA MULTI ANI !!!");
	}
}
