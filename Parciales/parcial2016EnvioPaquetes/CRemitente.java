package parcial2016EnvioPaquetes;

public class CRemitente implements Criterio {
	private String remitente;

	public CRemitente(String remitente) {
		this.remitente = remitente;
	}

	public boolean cumple(EnvioSimple e) {
		return e.getRemitente().equals(remitente);
	}
}