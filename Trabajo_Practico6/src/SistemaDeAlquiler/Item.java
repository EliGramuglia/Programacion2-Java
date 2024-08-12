package SistemaDeAlquiler;

import java.time.LocalDate;

public abstract class Item {
	protected LocalDate fechaAlquiler;
	protected LocalDate fechaDevolucion;
	
	public Item() {
		this.fechaAlquiler = null;
		this.fechaDevolucion = null;
	}

	public abstract boolean disponible();
	
	public abstract void alquilar(LocalDate fechaDevolucion);
	
	public abstract void devolver();

}
