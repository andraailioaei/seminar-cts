package ro.ase.cts.Command.clase;

public abstract class Command {
	protected ContBancar contBancar;
	protected float suma;
	
	public Command(ContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma = suma;
	}

	public abstract void executa();
}
