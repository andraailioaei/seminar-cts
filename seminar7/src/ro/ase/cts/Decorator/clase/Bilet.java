package ro.ase.cts.Decorator.clase;

public class Bilet implements BiletAbstract{
	private String numeEchipaGazda;
	private String numeOaspeti;
	private String numeClient;
	@Override
	public void rezerva() {
		System.out.println(numeClient+" are bilet la "+numeEchipaGazda+" "+numeOaspeti);
	}
	public Bilet(String numeEchipaGazda, String numeOaspeti, String numeClient) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeOaspeti = numeOaspeti;
		this.numeClient = numeClient;
	}
	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	public String getNumeClient() {
		return numeClient;
	}
	
	
}
