package BusquedaDeDocumentos;

public class BuscadorAND extends Buscador {
	private Buscador b1;
	private Buscador b2;
	
	
	public BuscadorAND(Buscador b1, Buscador b2) {
		this.b1 = b1;
		this.b2 = b2;
	}


	@Override
	public boolean cumple(Documento doc) {
		return b1.cumple(doc) && b2.cumple(doc);
	}

}
