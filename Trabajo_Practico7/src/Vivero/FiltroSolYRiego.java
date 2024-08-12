package Vivero;

public class FiltroSolYRiego extends Buscador {
	
	
	@Override
	public boolean cumple(Planta planta) {
		return planta.getSol()>5 && planta.getRiego()<3;
	}

}
