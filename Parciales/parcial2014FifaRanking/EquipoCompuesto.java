package parcial2014FifaRanking;

import java.util.Vector;

public class EquipoCompuesto extends Equipo {
	private Vector<Equipo> equipos;
	private Criterio criterio;

	public EquipoCompuesto(String n, Criterio criterio) {
		super(n);
		this.criterio = criterio;
		equipos = new Vector<Equipo>();
	}

	public void addEquipo(Equipo e) {
		equipos.add(e);
	}

	@Override
	public double getPuntos() {
		if (equipos != null)
			return criterio.calcula(new Vector<Equipo>(equipos)); // Corregido. BIEn
		else
			return 0;
	}

	@Override
	public int getCantJugadores() {
		int cantidad = 0;
		for (int i = 0; i < equipos.size(); i++) {
			cantidad += equipos.elementAt(i).getCantJugadores();
		}
		return cantidad;
	}

	@Override
	public int getCantTitulos() {
		int cantidad = 0;
		for (int i = 0; i < equipos.size(); i++) {
			cantidad += equipos.elementAt(i).getCantTitulos();
		}
		return cantidad;
	}

	@Override
	public Vector<EquipoSimple> getEquipos(Filtro f) {
		Vector<EquipoSimple> elms = new Vector<EquipoSimple>();
		for (int i = 0; i < equipos.size(); i++) {
			elms.addAll(equipos.elementAt(i).getEquipos(f));
		}
		return elms;
	}

	public void setCriterio(Criterio c) {
		this.criterio = c;
	}
}
