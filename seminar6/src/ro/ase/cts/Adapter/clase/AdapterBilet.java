package ro.ase.cts.Adapter.clase;

public class AdapterBilet extends Bilet implements BiletOnline {

	public AdapterBilet(float pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}

}
