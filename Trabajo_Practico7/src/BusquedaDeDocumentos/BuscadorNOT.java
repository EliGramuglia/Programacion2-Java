package BusquedaDeDocumentos;

public class BuscadorNOT extends Buscador {
	private Buscador b1;
	
	
	public BuscadorNOT(Buscador b1) {
		this.b1 = b1;
	}


	@Override
	public boolean cumple(Documento doc) {
		return !b1.cumple(doc);
	}

}
