package Vivero;

public class FiltroNombreVulgar extends Buscador {

	@Override
	public boolean cumple(Planta planta) {
		return planta.siSeApodaLengua();
	}

}
