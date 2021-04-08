package ro.ase.cts.Decorator.clase;

public abstract class DecoratorAbstract implements BiletAbstract{
	private BiletAbstract biletAbstract;

	public DecoratorAbstract(BiletAbstract biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}

	@Override
	public void rezerva() {
		biletAbstract.rezerva();
	}

	public BiletAbstract getBiletAbstract() {
		return biletAbstract;
	}
	
	
}
