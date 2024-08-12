package Streaming;

import java.time.LocalDate;

public class FiltroEstrenoYDuracion extends Filtro {
	 
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getAnioEstreno().isBefore(LocalDate.of(2015,1,1)) && peli.getDuracion()<95;
	}

}
