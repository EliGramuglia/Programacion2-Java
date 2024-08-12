package PortalDeNoticias;

public class FiltroContenido extends Filtro {
	private String frase;
	
	
	public FiltroContenido(String frase) {
		this.frase = frase;
	}


	@Override
	public boolean cumple(Noticia n) {
		return n.getContenido().contains(this.frase);
	}

}
