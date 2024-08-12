package CooperativaAgricultores;
import java.util.ArrayList;

public class Lote {
	private int cantHectareas;
	private ArrayList<String>minerales;
	private String nombre;
	
	public Lote(int cantHectareas, String nombre) {
		this.cantHectareas = cantHectareas; 
		this.minerales = new ArrayList<>();
		this.nombre = nombre;		
	}
	
	public void addMineral(String mineral) {
		if(!this.minerales.contains(mineral)) {
			this.minerales.add(mineral);
		}
	}

	//chequear si se puede sembrar
	public boolean sePuedeSembrar(Cereal cereal){	
		return cereal.sePuedeSembrar(this);
	}
	
	public boolean tieneMineral(String mineral) {
		if(this.minerales.contains(mineral)) {
			return true;
		}
		return false;
	}
	

	public int getCantHectareas() {
		return cantHectareas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
