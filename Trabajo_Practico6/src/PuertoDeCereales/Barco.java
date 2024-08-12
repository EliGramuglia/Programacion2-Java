package PuertoDeCereales;

public class Barco extends ItemOrdenable {
	private int capacidad;
	private String nombre;
	
	
	public Barco(int capacidad, String nombre) {
		this.capacidad = capacidad;
		this.nombre = nombre;
	}


	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean esMayor(ItemOrdenable item) {
		try {
			Barco otro = (Barco) item;
			return this.getCapacidad() > otro.getCapacidad();
		}
		catch (Exception e){
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Barco: " + this.getNombre();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Barco otro = (Barco) o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
}
