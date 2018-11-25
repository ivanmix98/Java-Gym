package practica_1rtrimestre;


public abstract class Sala extends Planta {
	private String nom;
	
	public Sala(int codiPlanta, String nom) {
		super(codiPlanta);
		this.nom = nom;	
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
