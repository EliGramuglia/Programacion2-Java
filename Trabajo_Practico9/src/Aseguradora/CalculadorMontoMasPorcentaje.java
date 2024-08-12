package Aseguradora;

public class CalculadorMontoMasPorcentaje extends CalculadorMonto {
	private double porcentaje;
	private double monto;
	
	
	public CalculadorMontoMasPorcentaje(double monto, double porcentaje) {
		this.monto = monto;
		this.porcentaje = porcentaje;
	}



	@Override
	public double obtenerMonto() {
		return this.monto + this.monto * porcentaje;
	}

}
