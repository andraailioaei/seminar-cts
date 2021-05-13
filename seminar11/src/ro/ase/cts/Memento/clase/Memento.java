package ro.ase.cts.Memento.clase;

public class Memento {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspeti;
	public Memento(int nrSpectatori, String echipaGazda, String echipaOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
	}
	protected int getNrSpectatori() {
		return nrSpectatori;
	}
	protected void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	protected String getEchipaGazda() {
		return echipaGazda;
	}
	protected void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}
	protected String getEchipaOaspeti() {
		return echipaOaspeti;
	}
	protected void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}
	
	
	
}
