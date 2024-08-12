package SistemaControlDeGastosConContribuyente;

public class ContribuyenteProgramador extends Contribuyente {
	private double facturacion;

	public ContribuyenteProgramador(String nombre, int identificador, double monto,
			double facturacion) {
		super(nombre, identificador, monto);
		this.facturacion = facturacion;
	}
	
	@Override
	public double montoAbonar() {
		double abonaXfacturar = facturacion * 0.02;
		
		return super.montoAbonar()* 0.2 + abonaXfacturar;
	}
}
