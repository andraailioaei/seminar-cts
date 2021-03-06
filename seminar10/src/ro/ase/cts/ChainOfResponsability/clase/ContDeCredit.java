package ro.ase.cts.ChainOfResponsability.clase;

public class ContDeCredit extends Cont {

	public ContDeCredit(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<= super.getSold()) {
			System.out.println("S-a realizat plata! :) din CONTUL DE CREDIT");
			super.setSold(super.getSold()-suma);
		}else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
