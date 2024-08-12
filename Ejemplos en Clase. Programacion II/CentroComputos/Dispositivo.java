package CentroComputos;

public class Dispositivo {

    private String nombre;
    private double velocidad;
    
	public Dispositivo(String nombre, double velocidad) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	
    
    
}
