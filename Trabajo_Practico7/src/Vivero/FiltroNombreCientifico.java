package Vivero;

public class FiltroNombreCientifico extends Buscador {

	
	public boolean cumple(Planta planta) {
		return planta.getNombreCientifico().contains("aureum");
	}

}
