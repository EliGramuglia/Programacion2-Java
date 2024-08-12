package SitioWeb;

public class FiltroAutor extends Filtro {
	private String autor;
	

	public FiltroAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public boolean cumple(Noticia noticia) {
		return noticia.getAutor().equals(this.autor);
	}

}
