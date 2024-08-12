package Vivero;

public class FiltroClasificacionCrassula extends Buscador {

	@Override
	public boolean cumple(Planta planta) {
		return planta.getClasificacion().equals("Crassula");
	}

}
