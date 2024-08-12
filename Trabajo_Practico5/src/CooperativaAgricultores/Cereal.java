package CooperativaAgricultores;
import java.util.ArrayList;

public class Cereal {
	private String nombre;
	private ArrayList<String>minerales;
	
	public Cereal(String nombre) {
		this.minerales = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public void addMineral(String mineral) {
		if(!this.minerales.contains(mineral)) {
			this.minerales.add(mineral);
		}
	}
	
	//dice si se puede sembrar en tal lote
	public boolean sePuedeSembrar(Lote lote){	
		for(int i = 0; i< minerales.size(); i ++) {
			String minerali = this.minerales.get(i);
			if(!lote.tieneMineral(minerali)) {
				return false;
			}
		}
		return true;
	}
	

	public ArrayList<String> getMinerales() {
		return new ArrayList<>(this.minerales);
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean necesitaMineral(String mineral) {
		return this.minerales.contains(mineral);
	}

}
