package SistemaDeAlquiler;

import java.time.LocalDate;

public class Vehiculo extends Item {
	private String marca;
	private double km;
	private int patente;
	private boolean disponible;
	
	public Vehiculo(String marca, double km, int patente) {
		super();
		this.marca = marca;
		this.km = km;
		this.patente = patente;
		this.disponible = true;
	}

	@Override
	public boolean disponible() {
		return this.disponible;
	}

	@Override
	public void alquilar(LocalDate fechaDevolucion) {
		this.disponible = false;
		this.fechaDevolucion = fechaDevolucion;
		this.fechaAlquiler = LocalDate.now();
	}

	@Override
	public void devolver() {
		this.disponible = true;
	}

	
	public String getMarca() {
		return marca;
	}

	public double getKm() {
		return km;
	}

	public int getPatente() {
		return patente;
	}

	
}
