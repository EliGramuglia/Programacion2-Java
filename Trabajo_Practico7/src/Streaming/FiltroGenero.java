package Streaming;

public class FiltroGenero extends Filtro {
	private String genero;
	
	public FiltroGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public boolean cumple(Pelicula peli) {
		return peli.contieneGenero(genero);
	}

}
