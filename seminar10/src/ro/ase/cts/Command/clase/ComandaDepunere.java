package ro.ase.cts.Command.clase;

public class ComandaDepunere extends Command {

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.contBancar.depunere(super.suma);
	}

}
