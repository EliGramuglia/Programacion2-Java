package AlquiloAhora;

public class CalculadorPorcentajeMonto extends Calculador {
	private int porcentaje;
	private double monto;
	
	
	public CalculadorPorcentajeMonto(int porcentaje, double monto) {
		this.porcentaje = porcentaje;
		this.monto = monto;
	}


	@Override
	public double calcularAlquiler(ElementoSimple e) {
		return e.getValor()*porcentaje/100 + monto;
	}

}
