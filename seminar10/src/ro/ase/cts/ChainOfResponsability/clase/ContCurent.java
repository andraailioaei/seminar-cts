package ro.ase.cts.ChainOfResponsability.clase;

public class ContCurent extends Cont{

	public ContCurent(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<= super.getSold()) {
			System.out.println("S-a realizat plata! :) din CONTUL CURENT");
			super.setSold(super.getSold()-suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
