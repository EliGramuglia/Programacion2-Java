package SistemaControlDeGastos;
import java.util.ArrayList;

public class Provincia {

	private String nombre;
	private ArrayList<Ciudad>ciudades;
	
	public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
		this.nombre = nombre;
		this.ciudades = ciudades;
	}
	
	
	private String[] informarGastos() {
		String[]arrCiudadesDeficit = new String[this.ciudades.size()];
		
		for(int i = 0; i < ciudades.size(); i++) {
			if(this.ciudades.get(i).getCantHabitantes()>100000) {
				if(this.ciudades.get(i).deficit()==true) {
					arrCiudadesDeficit[i] = ciudades.get(i).getNombre();
				} else {
					arrCiudadesDeficit[i]= " ";
				}
			}
			else {
				arrCiudadesDeficit[i]= " ";
			}
		}
	return arrCiudadesDeficit;
	}
	
	public void mostrarCiudadesDeficit() {
		String[]aux = informarGastos();
		
		for(int i=0; i < aux.length;i++) {
			System.out.println(aux[i]+ " ");
		}
	}
	
	
	
	public boolean mitadConDeficit() {
		int contador = 0;
		for(int i = 0; i < ciudades.size(); i++) {
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
