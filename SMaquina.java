package practica_1rtrimestre;

public class SMaquina extends Sala{
	private int numMaquines;
	
	public SMaquina(int codiPlanta, String nom, int NumMaquines ){
		super(codiPlanta, nom);
		this.numMaquines = NumMaquines;
	}

	public int getNumMaquines() {
		return numMaquines;
	}

	public void setNumMaquines(int numMaquines) {
		this.numMaquines = numMaquines;
	}
	
}
