package CandyCrush;

public class FiltroNot extends Filtro {
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumple(Ficha ficha) {
		return !f1.cumple(ficha);
	}

}
