package Sueldo;

public class EmpleadoHsExtras extends Empleado {
	private int cantHsExtras;
	private double montoXHora;
	
	
	public EmpleadoHsExtras(String nombre, int cantHsExtras) {
		super(nombre);
		this.cantHsExtras = cantHsExtras;
		this.montoXHora = 2000; //podria ser una constante
	}


	public double calcularMontoHsExtras() {
		return this.cantHsExtras * this.montoXHora;
	}
	
	public double sueldoEmpleadoHsExtras(){
		double calculo = this.calcularMontoHsExtras() + super.getSueldoFijo();
		
		return calculo;
	}
	
	
	public int getCantHsExtras() {
		return cantHsExtras;
	}
	
	public void setCantHsExtras(int cantHsExtras) {
		this.cantHsExtras = cantHsExtras;
	}

	public double getMontoXHora() {
		return montoXHora;
	}	
}
