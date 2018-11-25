package practica_1rtrimestre;

public class Recepcio extends Sala {
	
private int numOrdinadors;
	
	public Recepcio(int codiPlanta, String nom, int NumOrdinadors ){
		super(codiPlanta, nom);
		this.numOrdinadors = NumOrdinadors;
	}

	public int getNumOrdinadors() {
		return numOrdinadors;
	}
	public void setNumOrdinadors(int numOrdinadors) {
		this.numOrdinadors = numOrdinadors;
	}

	


}
