package practica_1rtrimestre;

public class Piscina extends Sala {
private int numCarrils;
	
	public Piscina(int codiPlanta, String nom, int NumCarrils){
		super(codiPlanta, nom);
		this.numCarrils = NumCarrils;
	}

	public int getNumCarrils() {
		return numCarrils;
	}

	public void setNumCarrils(int numCarrils) {
		this.numCarrils = numCarrils;
	}
	
}
