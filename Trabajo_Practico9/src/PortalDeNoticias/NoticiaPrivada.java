package PortalDeNoticias;

public class NoticiaPrivada extends Noticia {

	public NoticiaPrivada(String categoria, String titulo, String autor, String contenido) {
		super(categoria, titulo, autor, contenido);
	}
	
	
	@Override
	public Elemento getCopia(Filtro f) {
		return null;
	}

}
