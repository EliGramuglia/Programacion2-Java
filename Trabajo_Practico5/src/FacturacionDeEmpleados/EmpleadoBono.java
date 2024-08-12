package FacturacionDeEmpleados;

public class EmpleadoBono extends Empleado {
	private int cantVentas;
	private double bono;
	private int objetivo;
	
	public EmpleadoBono(String nombre, String apellido, int dni, double sueldo,
			int cantVentas, double bono, int objetivo) {
		super(nombre, apellido, dni, sueldo);
		this.cantVentas = cantVentas;
		this.bono = bono;
		this.objetivo = objetivo;
	}
	
	public boolean alcanzoObjetivo() {
		return this.cantVentas >= objetivo;
	}
	
	@Override
	public double getSueldo() {
		if(this.alcanzoObjetivo()) {
			return super.getSueldo()+bono;
		}else {
			return super.getSueldo();
		}
	}

}
