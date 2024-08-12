package Agroquimicos;

import java.util.ArrayList;

public class Cultivo extends Item {
	private String nombre;
	private ArrayList<Enfermedad> enfermedades; //enfermedades frecuentes que lo pueden	afectar
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedades = new ArrayList<>();
	}
	
	public void addEnfermedad(Enfermedad enfermedad) {
		if(!this.enfermedades.contains(enfermedad)) {
			this.enfermedades.add(enfermedad);
		}
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean sePuedeTratarCon(Agroquimico agro) {
		if(!agro.contieneProhibido(this)) {
			int i=0;
			while(i < this.enfermedades.size()) {
				if(!agro.puedeTratar(this.enfermedades.get(i))) {
					return false;
				}else {
					i++;
				}
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
