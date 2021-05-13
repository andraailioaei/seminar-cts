package ro.ase.cts.Observer.clase;

public class Manager extends Subiect{

	public void anuntaMeciFotbal() {
		super.notificaClienti("Va avea loc un nou meci de fotbal!!! ");
	}
	public void anuntaMeciHandbal() {
		super.notificaClienti("Va avea loc un nou meci de handbal!!! ");
	}
	public void anuntaMeciVolei() {
		super.notificaClienti("Va avea loc un nou meci de volei!!! ");
	}
}
