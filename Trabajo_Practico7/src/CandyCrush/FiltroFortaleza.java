package CandyCrush;

public class FiltroFortaleza extends Filtro {

	@Override
	public boolean cumple(Ficha ficha) {
		return ficha.getFortaleza() > 5;
	}

}
