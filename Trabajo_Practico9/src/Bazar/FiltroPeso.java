package Bazar;

public class FiltroPeso extends Filtro {
	private double peso;
	
	
	public FiltroPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public boolean cumple(Elemento e) {
		return e.getPeso() > this.peso;
	}

}
