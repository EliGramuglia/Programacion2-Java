package Sueldo;

public class EmpleadoComision extends Empleado {
	private int cantVentas;
	private double comision;

	public EmpleadoComision(String nombre, int ventas) {
		super(nombre);
		this.comision = 0.02;
		this.cantVentas = ventas;
	}
	
	public double sueldoEmpleadoComision() {
		double comision = this.comision * this.cantVentas;
		
		return comision + super.getSueldoFijo();
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public int getCantVentas() {
		return cantVentas;
	}

}
