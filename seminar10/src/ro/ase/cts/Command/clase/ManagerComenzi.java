package ro.ase.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

import javax.script.Invocable;


public class ManagerComenzi {

	private List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<Command>();
	}
	
	public void invoca(Command comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executa() {
		if(comenzi.size()>0) {
			this.comenzi.get(0).executa();
			this.comenzi.remove(0);
		}
	}
	
}
