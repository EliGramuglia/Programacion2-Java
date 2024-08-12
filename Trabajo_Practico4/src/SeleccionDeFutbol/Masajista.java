package SeleccionDeFutbol;

import java.time.LocalDate;

public class Masajista extends Integrante {
	private String titulo;
	private int experiencia;

	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechaNacimiento,
			String titulo, int experiencia) {
		super(nombre, apellido, pasaporte, fechaNacimiento);
		this.titulo = titulo;
		this.experiencia = experiencia;
	}
	
	@Override
    public String toString() {
		return super.toString()+ "\n" + "Titulo: "+titulo+ "\n"+ "Años de experiencia: "+experiencia;
	}

}
