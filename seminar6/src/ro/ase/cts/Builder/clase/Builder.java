package ro.ase.cts.Builder.clase;

public class Builder implements BuilderAbstract {

	private Rezervare rezervare;
	
	
	public Builder() {
		rezervare = new Rezervare(0, false, false, false, false, "");
	}


	@Override
	public Rezervare build() {
		return this.rezervare;
	}

	public Builder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public Builder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public Builder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public Builder setAreScaunEconomic(boolean areScaunEconomic) {
		rezervare.setAreScaunEconomic(areScaunEconomic);
		return this;
	}
	public Builder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public Builder setGenMuzical(String genMuzical) {
		rezervare.setGenMuzical(genMuzical);
		return this;
	}
	
	
	
}
