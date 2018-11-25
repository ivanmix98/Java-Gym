package practica_1rtrimestre;

public class Vestuari extends Sala {
	private int numBagul;
	
	public Vestuari(int codiPlanta, String nom, int NumBagul){
		super(codiPlanta, nom);
		this.numBagul = NumBagul;
	}

	public int getNumBagul() {
		return numBagul;
	}

	public void setNumBagul(int numBagul) {
		this.numBagul = numBagul;
	}
	
	
}
