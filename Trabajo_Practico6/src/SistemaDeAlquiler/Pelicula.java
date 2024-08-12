package SistemaDeAlquiler;

import java.time.LocalDate;

public class Pelicula extends Item {
	private String infoFilm;
	private int cant;
	
	public Pelicula(String infoFilm, int cant) {
		super();
		this.infoFilm = infoFilm;
		this.cant = cant;
	}

	@Override
	public boolean disponible() {
		if(this.cant -1 > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public void alquilar(LocalDate fechaDevolucion) {
		this.cant -= 1;
		this.fechaDevolucion = fechaDevolucion;
		this.fechaAlquiler = LocalDate.now();
	}
	
	@Override
	public void devolver() {
		this.cant += 1;
	}

	
	@Override
	public String toString() {
		return this.getInfoFilm();
	}
	

	public String getInfoFilm() {
		return infoFilm;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

}
