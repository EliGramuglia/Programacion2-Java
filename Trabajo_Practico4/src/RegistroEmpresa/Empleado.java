package RegistroEmpresa;

public class Empleado extends Persona {
	private int legajo;
	private double sueldo;

	public Empleado(String nombre, String apellido, int edad,
			int legajo, double sueldo) {
		super(nombre, apellido, edad);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}
	
	@Override
	public String obtenerDatos() {
		return "CARGO: empleado "+super.obtenerDatos()+"\nLEGAJO: "+legajo+
				"\nSUELDO: "+sueldo+"\n";
		
	}
	
}
