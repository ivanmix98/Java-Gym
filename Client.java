package practica_1rtrimestre;

public class Client implements IPersona{
	private int telefon;
	private String nom;
	private String cognom;
	private int DNI;
	
	public Client ( int Telefon, String Nom, String Cognom, int Dni){
		this.telefon = Telefon;
		this.nom = Nom;
		this.cognom = Cognom;
		this.DNI = Dni;
	}
	
	  public void saludar()
      {
            System.out.println("Hola!");
      }
	  public void despedirse()
      {
            System.out.println("Adeu! Que vagi bé!");
      }

	  
	  
	public int getTelefon() {return telefon; }
	public void setTelefon(int telefon) { this.telefon = telefon; }
	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }
	public String getCognom() { return cognom; }
	public void setCognom(String cognom) { this.cognom = cognom; }
	public int getDNI() { return DNI; }
	public void setDNI(int dNI) { DNI = dNI; }
	
	
}
