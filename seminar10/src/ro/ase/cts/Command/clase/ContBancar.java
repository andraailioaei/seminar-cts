package ro.ase.cts.Command.clase;

public class ContBancar {
	
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.sold = 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContBancar [detinator=");
		builder.append(detinator);
		builder.append(", sold=");
		builder.append(sold);
		builder.append("]");
		return builder.toString();
	}
	
	public void constituire(float sold) {
		this.sold= sold;
		System.out.println("A fost constituit soldul de "+sold);
	}
	public void retragere(float sold) {
		if(this.sold>= sold) {
		this.sold-= sold;
		System.out.println("A fost retras SUMA de "+sold);
		}
		else {
			System.out.println("Nu s-a putut retrage suma :( Fonduri insuficiente");
		}
	}

	public void depunere(float sold) {
		this.sold+= sold;
		System.out.println("A fost depusa SUMA de "+sold);
	}
	
}
