package ro.ase.cts.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<Memento> backups;

	public ManagerMemento() {
		super();
		this.backups = new ArrayList<Memento>();
	}
	
	public void adauga(Memento memento) {
		this.backups.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie< this.backups.size() && pozitie >=0)
		{ return this.backups.get(pozitie); }
		else {
			throw new IndexOutOfBoundsException();
		}
	}
	
}
