package recuperatorio2016Rastis;

public class FiltroOr {
	private Filtro f1, f2;
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Ladrillo l) {
		return f1.cumple(l) || f2.cumple(l);
	}
}
