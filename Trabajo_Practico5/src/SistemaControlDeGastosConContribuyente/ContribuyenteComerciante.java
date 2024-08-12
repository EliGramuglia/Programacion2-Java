package SistemaControlDeGastosConContribuyente;

public class ContribuyenteComerciante extends Contribuyente {
	private double ventas;
	
	public ContribuyenteComerciante(String nombre, int identificador, double monto,
			double ventas) {
		super(nombre, identificador, monto);
		this.ventas = ventas;
	}
	
	@Override
	public double montoAbonar() {
		double abonaXventas = ventas * 0.035;
		
		return super.montoAbonar()* 0.5 + abonaXventas;
	}
}
