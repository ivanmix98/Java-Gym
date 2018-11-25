package practica_1rtrimestre;

public class SAerobic extends Sala{
private int volagoma;
	
	public SAerobic(int codiPlanta, String nom, int VolaGoma ){
		super(codiPlanta, nom);
		this.volagoma = VolaGoma;
	}

	public int getVolagoma() {
		return volagoma;
	}

	public void setVolagoma(int volagoma) {
		this.volagoma = volagoma;
	}	
}
