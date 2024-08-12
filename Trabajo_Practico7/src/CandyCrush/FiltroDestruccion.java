package CandyCrush;

public class FiltroDestruccion extends Filtro {

	@Override
	public boolean cumple(Ficha ficha) {
		return ficha.getDestruccion() > 2;
	}

}
