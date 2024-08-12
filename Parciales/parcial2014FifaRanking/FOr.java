package parcial2014FifaRanking;

public class FOr implements Filtro {
	private Filtro f1,f2;
	public FOr (Filtro f1, Filtro f2) {
		this.f1  = f1;
		this.f2 = f2;
	}
	public boolean cumple(EquipoSimple e) {
		return f1.cumple(e) || f2.cumple(e);
	}
}
