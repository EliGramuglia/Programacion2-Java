package AlarmaSensorial;

public class Sensor {
	private String zonaControl;
	private boolean movimientoAdentro;
	private boolean vidrioRoto;
	private boolean aperturaPuerta;
	
	public Sensor(String zonaControl) {
		this.movimientoAdentro = false;
		this.vidrioRoto = false;
		this.aperturaPuerta = false;
		this.zonaControl = zonaControl;
	}
	
	public boolean detectarAnomalia(){
		if(this.movimientoAdentro == true || this.vidrioRoto == true || this.aperturaPuerta == true) {
			return true;
		} else {
			return false;
		}
	}

	public String getZonaControl() {
		return zonaControl;
	}

	public boolean isMovimientoAdentro() {
		return movimientoAdentro;
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

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public boolean isAperturaPuerta() {
		return aperturaPuerta;
	}
	
	
	
}

