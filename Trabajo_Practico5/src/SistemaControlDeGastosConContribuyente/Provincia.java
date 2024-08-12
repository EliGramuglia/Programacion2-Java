package SistemaControlDeGastosConContribuyente;
import java.util.ArrayList;

public class Provincia {

	private String nombre;
	private ArrayList<Ciudad>ciudades;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<>();
	}
	
	public void addCiudad(Ciudad ciudad) {      //REESCRIBIR EL EQUALS
		if(!this.ciudades.contains(ciudad)) {
			this.ciudades.add(ciudad);
		}
	}
	
	
	//La pcia tiene la mitad de sus ciudades con deficit o no
	public boolean mitadConDeficit() {
		int contador = 0;
		for(int i = 0; i < this.ciudades.size(); i++) {
			if(this.ciudades.get(i).deficit()==true) {
				contador ++;
			}
		}
		if(contador > this.ciudades.size()/2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}


	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	
}
