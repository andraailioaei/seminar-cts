package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	public void adaugareNod(ComponentaMeniu componenta) throws Exception;
	public void stergereNod(ComponentaMeniu componenta) throws Exception;
	public void afiseazaDescriere();
	ComponentaMeniu getComponenta(int index) throws Exception;
}
