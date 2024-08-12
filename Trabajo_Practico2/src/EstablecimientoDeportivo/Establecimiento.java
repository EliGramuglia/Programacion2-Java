package EstablecimientoDeportivo;

public class Establecimiento {
	private int asistencia;
	private String[]socios;
	private String[]sociosGratis;
	
	public Establecimiento(int asistencia, String[] socios, String[] sociosGratis) {
		this.asistencia = asistencia;
		this.socios = socios;
		this.sociosGratis = sociosGratis;
	}

	
	//chequear
	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}

	public String[] getSocios() {
		return socios;
	}

	public void setSocios(String[] socios) {
		this.socios = socios;
	}

	public String[] getSociosGratis() {
		return sociosGratis;
	}

	public void setSociosGratis(String[] sociosGratis) {
		this.sociosGratis = sociosGratis;
	}
	
	
	
	
}
