package recuperatorio2017CableCoaxil;

public class CMayorVelocidad implements Criterio{
	private double velocidad;
	public CMayorVelocidad (double velocidad){
		this.velocidad = velocidad;
	}
	public boolean cumple(Cable cs){
		return cs.getVelocidad() > velocidad;
	}	
}
