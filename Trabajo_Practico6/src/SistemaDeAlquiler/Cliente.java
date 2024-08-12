package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Item> alquileres;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void alquilarItem(Item item) {
		this.alquileres.add(item);
	}
	
	public void devolverItem(Item item) {
		this.alquileres.remove(item);
	}
	
	public boolean esDeudor() {
		LocalDate fechaActual = LocalDate.now();
		for(int i = 0; i < this.alquileres.size(); i ++) {
			Item alquileri = this.alquileres.get(i);
			if(fechaActual.isAfter(alquileri.fechaDevolucion)){
				return true;
			}
		}
		return false;
	}

	
	public ArrayList<Item> getAlquileres() {
		return new ArrayList<Item>(alquileres);
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
	
}
