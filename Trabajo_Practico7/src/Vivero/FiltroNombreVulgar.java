package Vivero;

public class FiltroNombreVulgar extends Buscador {
	private String nombre;
	
	public FiltroNombreVulgar(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.siSeApoda(nombre);
	}

}
