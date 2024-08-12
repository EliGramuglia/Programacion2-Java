package Sueldo;

public class Empleado {
	private String nombre;
	private double sueldoFijo;
	
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldoFijo = 60000; //podria ser una constante (consultar si ponerle public static final)
	}


	public String getNombre() {
		return nombre;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	
}
