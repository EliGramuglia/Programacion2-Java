package parcial2016EnvioPaquetes;

public class CDestino implements Criterio {
	private String destino;

	public CDestino(String destino) {
		this.destino = destino;
	}

	public boolean cumple(EnvioSimple e) {
		return e.getDestino().equals(destino);
	}
}