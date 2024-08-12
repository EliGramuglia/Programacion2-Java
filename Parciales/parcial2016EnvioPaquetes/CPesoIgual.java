package parcial2016EnvioPaquetes;

public class CPesoIgual implements Criterio {
	private double monto;

	public CPesoIgual(double peso) {
		monto = peso;
	}

	public boolean cumple(EnvioSimple e) {
		return e.getPeso() == monto;
	}
}