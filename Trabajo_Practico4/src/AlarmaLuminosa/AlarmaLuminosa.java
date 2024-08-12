package AlarmaLuminosa;


public class AlarmaLuminosa extends Alarma{
	private Luz luz;

	public AlarmaLuminosa() {
		super();
		this.luz = new Luz();
	}
	
	
	public void activarAlarmaLuminosa() {
		if(super.activarAlarma()== true) {
			this.luz.encenderLuz();
		}
	}


	public Luz getLuz() {
		return luz;
	}
	
	
}
