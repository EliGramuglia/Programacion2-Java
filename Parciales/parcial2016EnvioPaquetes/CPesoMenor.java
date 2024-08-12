package parcial2016EnvioPaquetes;

public class CPesoMenor implements Criterio {
	private double monto;

	public CPesoMenor(double peso) {
		monto = peso;
	}

	public boolean cumple(EnvioSimple e) {
		return e.getPeso() < monto;
	}
}
