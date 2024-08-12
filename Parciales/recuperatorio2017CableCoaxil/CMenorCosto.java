package recuperatorio2017CableCoaxil;

public class CMenorCosto implements Criterio{
	private double monto;
	public CMenorCosto(double monto){
		this.monto = monto;
	}
	
	public boolean cumple(Cable cs){
		return cs.getCosto()<monto;
	}
}