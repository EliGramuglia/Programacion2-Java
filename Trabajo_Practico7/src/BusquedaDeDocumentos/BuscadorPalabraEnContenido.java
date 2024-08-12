package BusquedaDeDocumentos;

public class BuscadorPalabraEnContenido extends Buscador {
	private String palabra;
	
	
	public BuscadorPalabraEnContenido(String palabra) {
		this.palabra = palabra;
	}


	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenido().contains(this.palabra);
	}

}
