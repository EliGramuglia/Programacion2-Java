package AlarmaSensorial;

public class Timbre {
	private boolean sonido;

	public Timbre() {
		this.sonido = false;
	}
	
	public void sonarTimbre() {
		this.sonido = true;
	}
	
	public void apagarTimbre() {
		this.sonido = false;
	}

	public boolean isSonido() {
		return sonido;
	}
}
