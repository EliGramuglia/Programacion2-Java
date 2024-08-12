package Streaming;

public class FiltroPeliculasRentables1 extends Filtro {
	private String genero;
	private int duracion;
	
	public FiltroPeliculasRentables1(String genero, int duracion) {
		super();
		this.genero = genero;
		this.duracion = duracion;
	}

	@Override
	public boolean cumple(Pelicula peli) {
		return !peli.contieneGenero(genero) && peli.getDuracion() < this.duracion;
	}

}
