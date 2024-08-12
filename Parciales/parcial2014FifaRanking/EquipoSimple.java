package parcial2014FifaRanking;

import java.util.Vector;

public class EquipoSimple extends Equipo{
	private int cantJugadores,titInternacional,titLocal;
	private String tecnico, localidad;
	private double ptosFifa;
	
	public EquipoSimple(String n, double ptosFifa, int cantJugadores, int titInternacional, int titLocal, String tecnico, String localidad) {
		super(n);
		this.ptosFifa = ptosFifa;
		this.cantJugadores = cantJugadores;
		this.titInternacional = titInternacional;
		this.titLocal = titLocal;
		this.tecnico = tecnico;
		this.localidad = localidad;
	}
	
	public String getTecnico() {
		return this.tecnico;
	}
	public int getTitulosLocales() {
		return this.titLocal;
	}
	@Override
	public double getPuntos() {
		return this.ptosFifa;
	}

	public void setPuntos(double ptos) { // Agrego el setPuntos ya que la Fifa es quien asigna el puntaje.
		this.ptosFifa = ptos;
	}

	@Override
	public int getCantJugadores() {
		return this.cantJugadores;
	}

	@Override
	public int getCantTitulos() {
		return this.titInternacional;
	}
	@Override
	public Vector<EquipoSimple> getEquipos(Filtro f) {
		Vector<EquipoSimple> elms = new Vector<EquipoSimple>();
		if (f.cumple(this))
			elms.add(this);
		return elms;
	}

	public String getLocalidad() {
		return this.localidad;
	}

}
