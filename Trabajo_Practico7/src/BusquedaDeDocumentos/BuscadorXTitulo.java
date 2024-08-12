package BusquedaDeDocumentos;

public class BuscadorXTitulo extends Buscador {
	private String titulo;
	
	public BuscadorXTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().equals(this.titulo);
	}
	
	
}
