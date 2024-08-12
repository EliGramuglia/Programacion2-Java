package RegistroEmpresa;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String obtenerDatos() {
		return "\nNOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nEDAD: "+edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
