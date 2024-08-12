package PuertoDeCereales;

public class Puerto {
	private ColaDeEspera barcos;
	private ColaDeEspera camiones;
	
	public Puerto() {
		this.barcos = new ColaDeEspera();
		this.camiones = new ColaDeEspera();
	}
	
	public void addBarco(Barco barco) {
		this.barcos.addItem(barco);
	}
	
	public void addCamion(Camion camion) {
		this.camiones.addItem(camion);
	}

	public ColaDeEspera getBarcos() {
		return barcos;
	}

	public ColaDeEspera getCamiones() {
		return camiones;
	}
}
