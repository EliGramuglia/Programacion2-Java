package parcial2014FifaRanking;

public class FTitulos implements Filtro{
	private int cantidad;
	public FTitulos(int valor) {
		cantidad = valor;
	}
	public boolean cumple(EquipoSimple e) {
		return e.getCantTitulos() >= cantidad;
	}
}
