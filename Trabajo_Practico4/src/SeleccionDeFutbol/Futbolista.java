package SeleccionDeFutbol;
import java.time.LocalDate;

public class Futbolista extends Integrante {
	private String posicion;
	private int cantGoles;
	private boolean zurdo;	
	
	public Futbolista(String nombre, String apellido, int pasaporte, LocalDate fechaNacimiento,
			int cantGoles, String posicion) {
		super(nombre, apellido, pasaporte, fechaNacimiento);
		this.cantGoles = cantGoles;
		this.zurdo = true;
		this.posicion = posicion;
	}

	public boolean noEsZurdo() {
		return this.zurdo=false;
	}
	
	
	public String getPosicion() {
		return posicion;
	}

	public void setCantGoles(int goles) {
		this.cantGoles = goles;
	}

	public boolean isZurdo() {
		return zurdo;
	}
	
	@Override
    public String toString() {
		return super.toString()+ "\n" + "Juega de: " + posicion+
				"\n" + "Cantidad de goles: "+ cantGoles + "\n" +
				"Es zurdo? "+zurdo;
	}
}
