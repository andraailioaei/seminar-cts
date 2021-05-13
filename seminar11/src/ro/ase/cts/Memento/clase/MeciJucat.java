package ro.ase.cts.Memento.clase;

public class MeciJucat {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrBileteVandute;
	private int nrSticleVandute;
	private int nrJandarmi;
	
	public MeciJucat(int nrSpectatori, String echipaGazda, String echipaOaspeti, int nrBileteVandute,
			int nrSticleVandute, int nrJandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleVandute = nrSticleVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento creareMemento() {
		Memento memento= new Memento(nrSpectatori, echipaGazda, echipaOaspeti);
		return memento;
	}
	
	public void revenire(Memento memento) {
		this.nrSpectatori= memento.getNrSpectatori();
		this.echipaGazda= memento.getEchipaGazda();
		this.echipaOaspeti=memento.getEchipaOaspeti();
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public String getEchipaGazda() {
		return echipaGazda;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public int getNrBileteVandute() {
		return nrBileteVandute;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public int getNrSticleVandute() {
		return nrSticleVandute;
	}

	public void setNrSticleVandute(int nrSticleVandute) {
		this.nrSticleVandute = nrSticleVandute;
	}

	public int getNrJandarmi() {
		return nrJandarmi;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspeti=");
		builder.append(echipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleVandute=");
		builder.append(nrSticleVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
}
