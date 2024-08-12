package recuperatorio2017CableCoaxil;

public class CMenorLong implements Criterio {
	private double longitud;

	public CMenorLong(double longitud) {
		this.longitud = longitud;
	}

	public boolean cumple(Cable cs) {
		return cs.getLongitud() < longitud;
	}
}