package CandyCrush;

public class FichaEspecial extends Ficha {
	private int destruccion;
	
	public FichaEspecial(String nombre, int fortaleza, int casillerosOcupados) {
		super(nombre, fortaleza, casillerosOcupados);
		this.destruccion = fortaleza/casillerosOcupados;
	}

	public int getDestruccion() {
		return destruccion;
	}
}
