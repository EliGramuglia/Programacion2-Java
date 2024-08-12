package recuperatorio2017CableCoaxil;

public class CableSimpleInstalacion extends CableSimple{
	private double instalacion;
	public CableSimpleInstalacion(double costo, double velocidad, double longitud, double longitudMax, double monto){
	 super(costo,velocidad,longitud,longitudMax);
	 instalacion = monto;
	}
	public double getCosto(){
		return this.getCosto() + instalacion;
	}
}