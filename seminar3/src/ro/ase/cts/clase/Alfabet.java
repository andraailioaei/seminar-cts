package ro.ase.cts.clase;

public class Alfabet {
	private String tip;
	private int numarCaractere;
	private boolean isActual;
	private static Alfabet instance = null;
	
	public static synchronized Alfabet getInstance(String tip, int numarCaractere, boolean isActual) {
		if(instance == null) {
			instance = new Alfabet(tip, numarCaractere, isActual);
		}
		return instance;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public void setNumarCaractere(int numarCaractere) {
		this.numarCaractere = numarCaractere;
	}
	public void setActual(boolean isActual) {
		this.isActual = isActual;
	}
	private Alfabet(String tip, int numarCaractere, boolean isActual) {
		super();
		this.tip = tip;
		this.numarCaractere = numarCaractere;
		this.isActual = isActual;
	}
	@Override
	public String toString() {
		return "Alfabet [tip=" + tip + ", numarCaractere=" + numarCaractere + ", isActual=" + isActual + "]";
	}
	
	
}
