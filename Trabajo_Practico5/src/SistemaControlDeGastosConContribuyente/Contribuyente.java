package SistemaControlDeGastosConContribuyente;

public class Contribuyente {
	private String nombre;
	private int identificador;
	private double montoFijo;
	
	
	public Contribuyente(String nombre, int identificador, double monto) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.montoFijo = monto;
	}
	
	public double montoAbonar() {
		return this.montoFijo;
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}
	
	
	
}
