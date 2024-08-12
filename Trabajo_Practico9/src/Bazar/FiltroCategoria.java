package Bazar;

public class FiltroCategoria extends Filtro {
	private String categoria;
	
	
	public FiltroCategoria(String categoria) {
		super();
		this.categoria = categoria;
	}


	@Override
	public boolean cumple(Elemento e) {
		return e.contieneCategoria(this.categoria);
	}

}
