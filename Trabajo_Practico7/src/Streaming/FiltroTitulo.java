package Streaming;

public class FiltroTitulo extends Filtro {
	private String titulo;
	
	
	public FiltroTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getTitulo().contains(this.titulo);
	}

}
