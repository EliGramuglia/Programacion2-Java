package SeleccionDeFutbol;

import java.time.LocalDate;

public class Integrante {
	private String nombre;
	private String apellido;
	private int pasaporte;
	private LocalDate fechaNacimiento;
	private String estado; //“Viajando”, “En concentración”, “En país de origen"
	
	//constructor padre
	public Integrante(String nombre, String apellido, int pasaporte, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = "en pais de origen";
	}
	
	public void cambiarEstado(String estadoNuevo) {
		this.estado = estadoNuevo;
	}
	
	public boolean disponible() {
		if(estado.equals("en pais de origen")) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
    public String toString() {
		return "Nombre: " + nombre + " " + apellido + "\n" +
	               "Número de Pasaporte: " + pasaporte + "\n" +
	               "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
	               "Estado: " + estado;
	}
	

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
}
