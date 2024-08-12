package Agroquimicos;

import java.util.ArrayList;

public class Agroquimico {
	private String nombre;
	private ArrayList<Cultivo> cultivosProhibidos;
	private ArrayList<String> patologias; //conjunto de patologias que sí puede tratar
	
	public Agroquimico(String nombre) {
		this.nombre = nombre;
		this.cultivosProhibidos = new ArrayList<>();
		this.patologias = new ArrayList<>();
	}
	
	public void addCultivoProhibido(Cultivo cultivo) {
		if(!this.cultivosProhibidos.contains(cultivo)) {
			this.cultivosProhibidos.add(cultivo);
		}
	}
	public void addPatologia(String patologia) {
		if(!this.patologias.contains(patologia)) {
			this.patologias.add(patologia);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public boolean trataPatologia(String patologia) {
		return this.patologias.contains(patologia);
	}
	
	//dice si se puede tratar tal enfermedad
	public boolean puedeTratar(Enfermedad enfermedad) {
		return enfermedad.sePuedeTratarCon(this);
	}
	
	
	public boolean contieneProhibido(Cultivo cultivo) {
		return this.cultivosProhibidos.contains(cultivo);
	}
	
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
