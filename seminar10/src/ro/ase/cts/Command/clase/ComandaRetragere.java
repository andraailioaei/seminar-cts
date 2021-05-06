package ro.ase.cts.Command.clase;

public class ComandaRetragere extends Command{

	public ComandaRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.contBancar.retragere(super.suma);
	}

}
