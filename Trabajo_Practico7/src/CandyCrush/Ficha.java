package CandyCrush;

public class Ficha {
	private String nombre;
	private int fortaleza;
	private int casillerosOcupados;
	private int destruccion;
	
	public Ficha(String nombre, int fortaleza, int casillerosOcupados, int destruccion) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.casillerosOcupados = casillerosOcupados;
		this.destruccion = destruccion;
	}
	
	public Ficha(String nombre, int fortaleza, int casillerosOcupados) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.casillerosOcupados = casillerosOcupados;
	}

	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}

	public void setCasillerosOcupados(int casillerosOcupados) {
		this.casillerosOcupados = casillerosOcupados;
	}

	public void setDestruccion(int destruccion) {
		this.destruccion = destruccion;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public int getCasillerosOcupados() {
		return casillerosOcupados;
	}

	public int getDestruccion() {
		return destruccion;
	}
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return this.getNombre();
	}
	
}
