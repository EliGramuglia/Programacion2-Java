package CandyCrush;

public class FiltroTamanio extends Filtro {

	@Override
	public boolean cumple(Ficha ficha) {
		return ficha.getCasillerosOcupados() > 4;
	}

}
