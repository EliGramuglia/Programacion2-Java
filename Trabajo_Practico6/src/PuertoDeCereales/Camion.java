package PuertoDeCereales;

import java.time.LocalDate;

public class Camion extends ItemOrdenable {
	private LocalDate fechaCarga;
	private String nombre;
	
	public Camion(LocalDate fechaCarga, String nombre) {
		this.fechaCarga = fechaCarga;
		this.nombre = nombre;
	}

	public void setFechaCarga(LocalDate fechaCarga) {
		this.fechaCarga = fechaCarga;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCarga() {
		return fechaCarga;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public boolean esMayor(ItemOrdenable item) {
		try {
			Camion otro = (Camion) item;
			return this.getFechaCarga().isBefore(otro.getFechaCarga());
		}
		catch (Exception e){
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Camión: " + this.getNombre();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Camion otro = (Camion) o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
