package Vivero;

public class FiltroNombreCientifico extends Buscador {
	private String nombre;
	
	public FiltroNombreCientifico(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getNombreCientifico().contains(nombre);
	}

}
