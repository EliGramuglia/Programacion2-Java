package Streaming;

import java.time.LocalDate;

public class FiltroPeliculasRentables2 extends Filtro {
	private LocalDate posteriores;
	private String genero1;
	private String genero2;

	public FiltroPeliculasRentables2(LocalDate posteriores, String genero1, String genero2) {
		super();
		this.posteriores = posteriores;
		this.genero1 = genero1;
		this.genero2 = genero2;
	}


	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getAnioEstreno().isAfter(posteriores) || peli.contieneGenero(genero1)||
				peli.contieneGenero(genero2);
	}

}
