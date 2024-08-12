package SistemaElectoral;

public class Candidato {
	private String nombre;
	private String partido; 
	private String agrupacion;
	
	public Candidato(String nombre, String partido, String agrupacion) {
		this.nombre = nombre;
		this.partido = partido;
		this.agrupacion = agrupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(String agrupacion) {
		this.agrupacion = agrupacion;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Candidato otra = (Candidato) o;
			return this.getNombre().equals(otra.getNombre());
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
}
