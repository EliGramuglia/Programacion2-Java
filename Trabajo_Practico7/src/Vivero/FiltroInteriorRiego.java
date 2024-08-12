package Vivero;

public class FiltroInteriorRiego extends Buscador {
	private int riego;
	
	public FiltroInteriorRiego(int riego) {
		this.riego = riego;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getUbicacion().equals("interior") && planta.getRiego()<riego;
	}

}
