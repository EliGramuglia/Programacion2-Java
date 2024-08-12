package BusquedaDeDocumentos;

public class BuscadorTituloContiene extends Buscador {
	private String palabra;
	
	public BuscadorTituloContiene (String palabra) {
		this.palabra = palabra;
	}

	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(this.palabra);
	}
	
}
