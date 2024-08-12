package AlquiloAhora;

public class CalculadorPorcentaje extends Calculador {
	private int porcentaje;
	

	public CalculadorPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}



	@Override
	public double calcularAlquiler(ElementoSimple e) {
		return e.getValor() * this.porcentaje / 100;
	}

}
