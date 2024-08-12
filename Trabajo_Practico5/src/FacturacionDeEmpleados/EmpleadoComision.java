package FacturacionDeEmpleados;

public class EmpleadoComision extends Empleado {
	private double ventas;
	private double porcentajeVentas;

	public EmpleadoComision(String nombre, String apellido, int dni, double sueldo,
			double ventas, double porcentajeVentas) {
		super(nombre, apellido, dni, sueldo);
		this.ventas = ventas;
		this.porcentajeVentas = porcentajeVentas;
	}
	
	@Override
	public double getSueldo() {
		double aux = this.ventas * this.porcentajeVentas;
		return super.getSueldo() + aux;
	}

	
	
	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getPorcentajeVentas() {
		return porcentajeVentas;
	}

	public void setPorcentajeVentas(double porcentajeVentas) {
		this.porcentajeVentas = porcentajeVentas;
	}
	
	

}
