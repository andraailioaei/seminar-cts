package ro.ase.cts.Builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunEconomic;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunEconomic,
			boolean areMuzicaAmbientala, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaunEconomic = areScaunEconomic;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzical = genMuzical;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areBauturaInclusa=");
		builder.append(areBauturaInclusa);
		builder.append(", areScaunEconomic=");
		builder.append(areScaunEconomic);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}
	public void setAreScaunEconomic(boolean areScaunEconomic) {
		this.areScaunEconomic = areScaunEconomic;
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}
	
	

}
