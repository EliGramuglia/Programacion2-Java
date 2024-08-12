package cooperativa;

import java.util.ArrayList;

public class Cereal {

	private String nombre;
	private ArrayList<String> minerales;
	public Cereal(String nombre) {
		super();
		this.nombre = nombre;
		this.minerales = new ArrayList<String>();
	}
	
	public void addMineral(String mineral) { 
		this.minerales.add(mineral);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getMinerales() {
		return new ArrayList<>(this.minerales);
	}
	
	public boolean sePuedeSembrarEn(Lote lote) {
		for (int i = 0; i < this.minerales.size(); i++) {
			String minerali = this.minerales.get(i);
			if (!lote.tieneMineral(minerali))
				return false;
		}
		
		return true;
	}
	
	public boolean necesitaMineral(String mineral) {
		return this.minerales.contains(mineral);
	}
	
	
}
