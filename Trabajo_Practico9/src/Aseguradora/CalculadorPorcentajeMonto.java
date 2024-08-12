package Aseguradora;

public class CalculadorPorcentajeMonto extends CalculadorMonto {
	private double porcentaje;
	private double monto;
	
	
	public CalculadorPorcentajeMonto(double monto, double porcentaje) {
		this.porcentaje = porcentaje;
		this.monto = monto;
	}



	@Override
	public double obtenerMonto() {
		return this.monto * porcentaje;
	}

}
