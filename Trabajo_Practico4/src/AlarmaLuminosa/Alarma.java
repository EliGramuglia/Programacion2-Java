package AlarmaLuminosa;

public class Alarma {
	private Timbre timbre;
	private boolean movimientoAdentro;
	private boolean vidrioRoto;
	private boolean aperturaPuerta;
	
	public Alarma() {
		this.timbre = new Timbre();
		this.movimientoAdentro = false;
		this.vidrioRoto = false;
		this.aperturaPuerta = false;
	}
	
	public boolean comprobar(){
		if(this.movimientoAdentro == true || this.vidrioRoto == true || this.aperturaPuerta == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean activarAlarma() {
		if(this.comprobar() == true) {
			this.timbre.sonarTimbre();
			return true;
		}
		return false;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setMovimientoAdentro(boolean movimientoAdentro) {
		this.movimientoAdentro = movimientoAdentro;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public void setAperturaPuerta(boolean aperturaPuerta) {
		this.aperturaPuerta = aperturaPuerta;
	}
	

	
	
}
