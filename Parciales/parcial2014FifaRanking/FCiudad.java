package parcial2014FifaRanking;

public class FCiudad implements Filtro{
	private String nombre;
	public FCiudad(String n) {
		this.nombre = n;
	}
	public boolean cumple(EquipoSimple e) {
		return e.getLocalidad().equals(nombre);
	}

}
