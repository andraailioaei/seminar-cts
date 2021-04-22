package ro.ase.cts.Strategy.clase;

public class Card implements ModPlata{

	private float soldDisponibil;
	
	
	public Card(float soldDisponibil) {
		super();
		this.soldDisponibil = soldDisponibil;
	}


	@Override
	public void achita(float sumaPlata) {
		if(sumaPlata <= soldDisponibil)
			{
				soldDisponibil-=sumaPlata;
				System.out.println("S-a achitat cu CARDUL suma de "+sumaPlata+" lei. Soldul dispobinil ramas: "+soldDisponibil);
				
			}
		else {
			System.out.println("Nu s-a putut achita cu CARD !! Fonduri insuficiente!");
		}
	}

}
