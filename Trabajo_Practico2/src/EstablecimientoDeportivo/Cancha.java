package EstablecimientoDeportivo;

public class Cancha {
	private String tipo;
	private int costo;
	private int cantCanchas;
	
	public Cancha(String tipo) {
		this.tipo = tipo;
		this.costo = costo;
		this.cantCanchas = cantCanchas;
	}
	
	
	public int costoCancha() {
		if(this.tipo == "paddle") {
			this.costo = 100;
			return 100;
		} else{
			this.costo = 400;
			return 400;
		}
		//agregar que si el usuario es socio, es gratis
	}
	
	public int cantCanchas() {
		if(this.tipo == "paddle") {
			this.cantCanchas = 4;
			return 4;
		} else{
			this.cantCanchas = 2;
			return 2;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
