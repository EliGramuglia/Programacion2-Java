package recuperatorio2017CableCoaxil;

import java.util.Vector;

public abstract class Estandar{
	private double porcentaje;
	
	protected Estandar(double porcentaje){
		this.porcentaje = porcentaje;
	}
	
	public double getCostoAdicional(){
		return this.porcentaje;
	}
	
	public abstract double getVelocidad(Vector<Cable> ec);
}