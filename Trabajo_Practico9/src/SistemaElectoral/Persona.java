package SistemaElectoral;

public class Persona {
	private String nombre;
	private int dni;
	private boolean yaVoto;

	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.yaVoto = false;
	}

	public int getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean yaVoto() {
		return yaVoto;
	}

	public void setYaVoto(boolean yaVoto) {
		this.yaVoto = yaVoto;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Persona otra = (Persona) o;
			return this.getNombre().equals(otra.getNombre());
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
	
	
}
