package parcial2014FifaRanking;

import java.util.Vector;

public abstract class Equipo {

	private String nombre;
	protected Equipo(String n) {
		this.nombre = n;
	}
	public String getNombre() {
		return nombre;
	}
	public abstract double getPuntos();
	public abstract int getCantJugadores();
	public abstract int getCantTitulos();
	public abstract Vector<EquipoSimple> getEquipos(Filtro f);
	
}
