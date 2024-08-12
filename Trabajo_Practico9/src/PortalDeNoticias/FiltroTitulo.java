package PortalDeNoticias;

public class FiltroTitulo extends Filtro {
	private String titulo;
	
	
	public FiltroTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public boolean cumple(Noticia n) {
		return n.getTitulo().contains(this.titulo);
	}

}
