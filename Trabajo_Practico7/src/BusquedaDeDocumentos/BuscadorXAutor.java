package BusquedaDeDocumentos;

public class BuscadorXAutor extends Buscador {
	private String autor;
	
	public BuscadorXAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public boolean cumple(Documento doc) {
		return doc.loEscribioX(autor);
	}

}
