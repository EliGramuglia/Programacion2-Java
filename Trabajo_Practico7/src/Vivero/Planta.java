package Vivero;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico;
	private ArrayList<String> nombres;
	private String clasificacion;
	private String familia;
	private String clase;
	private String ubicacion;
	private int sol;
	private int riego;
	
	public Planta(String nombreCientifico, String clasificacion, String familia,
			String clase, String ubicacion, int sol, int riego) {
		this.nombreCientifico = nombreCientifico;
		this.nombres = new ArrayList<>();
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.ubicacion = ubicacion;
		this.sol = sol;
		this.riego = riego;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public String getFamilia() {
		return familia;
	}

	public String getClase() {
		return clase;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public int getSol() {
		return sol;
	}

	public int getRiego() {
		return riego;
	}
	
	public void addNombre(String nombre) {
		this.nombres.add(nombre);
	}
	
	public String toString() {
		return this.getNombreCientifico();
	}
	
	public boolean siSeApodaLengua() {
		return this.nombres.contains("lengua de suegra");
	}
	
	
}
