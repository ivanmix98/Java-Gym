package practica_1rtrimestre;

public class Planta{
	
	private NumPlanta codiNum;
	private int codiPlanta;
	
	
	public Planta(int CodiPlanta){
		this.codiPlanta = CodiPlanta;
	}


	public NumPlanta getCodiNum() {
		return codiNum;
	}
	public void setCodiNum(NumPlanta codiNum) {
		
		
		if (codiNum == NumPlanta.P1){
			this.codiNum = codiNum;
			System.out.println("La recepció és a la "+ this.codiNum);
		}
		if (codiNum == NumPlanta.P2){
			this.codiNum = codiNum;
			System.out.println("El vestuari és a la "+ this.codiNum);
		}
		if (codiNum == NumPlanta.P3){
			this.codiNum = codiNum;
			System.out.println("La sala de màquines és a la "+ this.codiNum);
		}
		if (codiNum == NumPlanta.P4){
			this.codiNum = codiNum;
			System.out.println("La sala d'aerobic és a la "+ this.codiNum);
		}
		if (codiNum == NumPlanta.P5){
			this.codiNum = codiNum;
			System.out.println("La piscina és a la "+ this.codiNum);
		}
	}
	
	
}
