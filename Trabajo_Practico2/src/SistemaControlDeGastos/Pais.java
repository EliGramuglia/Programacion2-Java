package SistemaControlDeGastos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Provincia>provincias;
	
	
	public Pais(String nombre, ArrayList<Provincia> provincias) {
		this.nombre = nombre;
		this.provincias = provincias;
	}


	public void obtenerCiudadesConDeficit() {
		for(int i = 0; i < this.provincias.size(); i++) {
			provincias.get(i).mostrarCiudadesDeficit();
		}
	}
	
	private String[] PciasConDeficit() {
		String[]arrPcias = new String[this.provincias.size()];
		for(int i = 0; i < this.provincias.size(); i++) {
			if(provincias.get(i).mitadConDeficit()==true) {
				arrPcias[i] = provincias.get(i).getNombre(); 
			} else {
				arrPcias[i]=" ";
			}
		}
		return arrPcias;
	}
	
	public void obtenerPciasConDeficit() {
		String[] aux = PciasConDeficit();
		
		for(int i=0; i < aux.length;i++) {
			System.out.println(aux[i]+ " ");
		}
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}


	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}	
}
