package ro.ase.cts.Command.clase;

public class ComandaConstituire extends Command {

	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
		
	}

	@Override
	public void executa() {
		super.contBancar.constituire(super.suma);
	}

}
