package FacturacionDeEmpleados;

public class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, int dni, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}
	
	
}
