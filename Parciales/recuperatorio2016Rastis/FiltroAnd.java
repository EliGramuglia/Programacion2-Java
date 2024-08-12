package recuperatorio2016Rastis;

public class FiltroAnd implements Filtro{
	private Filtro f1,f2;
	public FiltroAnd (Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	public boolean cumple(Ladrillo l) {
		return f1.cumple(l) && f2.cumple(l);
	}
}
