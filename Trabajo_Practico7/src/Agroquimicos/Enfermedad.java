package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad extends Item {
	private String nombre;
	private ArrayList<String> patologias;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.patologias = new ArrayList<>();
	}
	
	public void addPatologia(String patologia) {
		if(!this.patologias.contains(patologia)) {
			this.patologias.add(patologia);
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean sePuedeTratarCon(Agroquimico agro) {
		int i=0;
		while(i < this.patologias.size()) {
			if(!agro.trataPatologia(this.patologias.get(i))) {
				return false;
			}else {
				i++;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
