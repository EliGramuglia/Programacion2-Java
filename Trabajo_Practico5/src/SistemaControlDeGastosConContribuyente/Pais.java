package SistemaControlDeGastosConContribuyente;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Provincia> provincias;
	private ArrayList<Ciudad> ciudades;
	
	
	public Pais(String nombre) {
		this.nombre = nombre;
		this.provincias = new ArrayList<>();
		this.ciudades = new ArrayList<>();
	}

	public void addPcia(Provincia pcia) {
		if(!this.provincias.contains(pcia)) {
			this.provincias.add(pcia);
		}
	}
	public void addCiudad(Ciudad ciudad) {
		if(!this.ciudades.contains(ciudad)) {
			this.ciudades.add(ciudad);
		}
	}
	
	//Cuales son las ciudades que tienen deficit
	public ArrayList<Ciudad> ciudadesConDeficit(){
		ArrayList<Ciudad> listado = new ArrayList<>();
		
		for(int i = 0; i < ciudades.size(); i++) {
			if(this.ciudades.get(i).getCantHabitantes()>100000) {
				if(this.ciudades.get(i).deficit() == true) {
					listado.add(ciudades.get(i));
				}
			}
		}
		return listado;
	}
	
	
	//Cuales son las pcias que tienen mas de la mitad de sus ciudades con deficit
	public ArrayList<Provincia> pciasConDeficit() {
		ArrayList<Provincia> listado = new ArrayList<>();
		for(int i = 0; i < this.provincias.size(); i++) {
			if(provincias.get(i).mitadConDeficit()==true) {
				listado.add(provincias.get(i)); 
			}
		}
		return listado;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
}
