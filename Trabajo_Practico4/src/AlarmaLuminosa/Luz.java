package AlarmaLuminosa;

public class Luz {
	private boolean estado;
	
	
	public Luz() {
		this.estado = false;
	}
	
	public void encenderLuz() {
		this.estado = true;
	}
	
	public void apagarLuz() {
		this.estado = false;
	}

	public boolean isLuz() {
		return estado;
	}
	
}
