package ro.ase.cts.Template.program;

import ro.ase.cts.Template.clase.SpectatorCuHandicap;
import ro.ase.cts.Template.clase.SpectatorUzual;
import ro.ase.cts.Template.clase.TemplateIntrareStadion;

public class Program {

	public static void main(String[] args) {
		TemplateIntrareStadion spectatorUzual= new SpectatorUzual("Lidia");
		spectatorUzual.intrarePeStadion();
		
		TemplateIntrareStadion spectator= new SpectatorCuHandicap("Gigi");
		spectator.intrarePeStadion();
	}

}
