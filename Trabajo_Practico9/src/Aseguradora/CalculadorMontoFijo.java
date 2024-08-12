package Aseguradora;

public class CalculadorMontoFijo extends CalculadorMonto {
	private double monto;
	
	
	public CalculadorMontoFijo(double monto) {
		this.monto = monto;
	}



	@Override
	public double obtenerMonto() {
		return this.monto;
	}

}
