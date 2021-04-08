package ro.ase.cts.Adapter.clase;

public class AdapterBiletObiecte implements BiletOnline{

	private Bilet bilet;
	
	public AdapterBiletObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		bilet.rezerva();
	}

}
