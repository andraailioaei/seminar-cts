package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

	private List<Observer> clienti;

	public Subiect() {
		super();
		this.clienti= new ArrayList<Observer>();
	}
	
	public void adaugaObserver(Observer observer) {
		this.clienti.add(observer);
		
	}
	public void stergeObserver(Observer observer) {
		this.clienti.remove(observer);
	}
	
	public void notificaClienti(String mesaj) {
		for(Observer observer: this.clienti) {
			observer.primesteMesaj(mesaj);
		}
	}
}
