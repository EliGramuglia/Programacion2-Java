package SeleccionDeFutbol;

import java.time.LocalDate;

public class Entrenador extends Integrante {
	private int identificador;

	public Entrenador(String nombre, String apellido, int pasaporte, LocalDate fechaNacimiento, int identificador) {
		super(nombre, apellido, pasaporte, fechaNacimiento);
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	@Override
    public String toString() {
		return super.toString()+ "\n" +"Identificador: "+this.identificador;
	}
}
