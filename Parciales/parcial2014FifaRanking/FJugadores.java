package parcial2014FifaRanking;

public class FJugadores implements Filtro {
	private int cantidad;
	public FJugadores(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public boolean cumple(EquipoSimple e) {
		return e.getCantJugadores() >= cantidad;
	}
	
}
