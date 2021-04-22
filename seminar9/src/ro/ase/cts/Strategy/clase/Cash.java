package ro.ase.cts.Strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void achita(float sumaPlata) {
		System.out.println("S-a achitat CASH suma de "+sumaPlata+" lei.");
	}

}
