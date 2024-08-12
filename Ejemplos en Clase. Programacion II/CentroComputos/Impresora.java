package CentroComputos;

public class Impresora extends Dispositivo{
	private String papel;
	
    public Impresora(String nombre, double velocidad, String papel) {
		super(nombre, velocidad);
		this.papel = papel;

	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
 
}
