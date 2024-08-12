package AlquiloAhora;

public class CalculadorMontoFijo extends Calculador {
	private double monto;
	
	public CalculadorMontoFijo(double monto) {
		super();
		this.monto = monto;
	}


	@Override
	public double calcularAlquiler(ElementoSimple e) {
		return this.monto;
	}  //corrregir


	public void setMonto(double monto) {
		this.monto = monto;
	}
	

}
