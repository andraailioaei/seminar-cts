package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends Reader{
	public ElevReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev e = new Elev();
			super.readAplicant(e, input);
			int clasa = input.nextInt();
			String tutore = input.next();
			e.setClasa(clasa);
			e.setTutore(tutore);
			elevi.add(e);
		}

		input.close();
		return elevi;
	}
}
