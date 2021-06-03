package dubluri;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent{

	String valoareGetNume;
	float valoareGetMedie;
	int valoareGetNota;
	boolean valoareGetRestante;
	
	@Override
	public String getNume() {
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		return valoareGetRestante;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareGetRestante(boolean valoareGetRestante) {
		this.valoareGetRestante = valoareGetRestante;
	}

}
