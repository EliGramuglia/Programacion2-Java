package Streaming;

public class FiltroDirector extends Filtro {
	private String director;
	

	public FiltroDirector(String director) {
		this.director = director;
	}

	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getDirector().equals(this.director);
	}

}
