package recuperatorio2017CableCoaxil;

public class CableSimple implements Cable{
	private double costo, velocidad,longitud,longitudMax;
	public CableSimple(double costo, double velocidad, double longitud, double longitudMax){
		this.costo = costo;
		this.velocidad = velocidad;
		this.longitud = longitud;
		this.longitudMax = longitudMax;
	}
	public double getLongitud(){
		return longitud;
	}
	public double getCosto(){
		return costo;
	}
	public double getLongitudMax(){
		return longitudMax;
	}
	public boolean cumpleCriterio(Criterio c){
		return c.cumple(this);
	}
	public double getVelocidad(){
		return velocidad;
	}	
}