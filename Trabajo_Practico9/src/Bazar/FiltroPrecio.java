package Bazar;

public class FiltroPrecio extends Filtro {
	private double precio;
	

	public FiltroPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public boolean cumple(Elemento e) {
		return e.getPrecio() < this.precio;
	}

}
