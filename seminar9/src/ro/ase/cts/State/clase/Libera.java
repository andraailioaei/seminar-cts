package ro.ase.cts.State.clase;

public class Libera implements Stare{

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof Libera)) {
			System.out.println("Ati eliberat masa cu codul "+masa.getNrMasa());
			masa.setStare(this);
		} else {
			System.out.println("Masa "+ masa.getNrMasa()+" este deja libera :(");
			
		}
	}

}
