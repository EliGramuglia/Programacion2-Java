package Vivero;

public class FiltroInteriorRiego extends Buscador {

	@Override
	public boolean cumple(Planta planta) {
		return planta.getUbicacion().equals("interior") && planta.getRiego()<3;
	}

}
