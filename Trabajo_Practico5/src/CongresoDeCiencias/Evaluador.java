package CongresoDeCiencias;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private ArrayList<String> temas;
	private ArrayList<Trabajo> trabajosAsignados;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.temas = new ArrayList<>();
		this.trabajosAsignados = new ArrayList<>();
	}
	
	
	public void addTema(String tema) {
		if(!this.temas.contains(tema)) {
			this.temas.add(tema);
		}
	}
	
	public boolean sabeTema(String tema) {
		if(this.temas.contains(tema)) {
			return true;
		}
		return false;
	}
	
	//es apto para corregir tal trabajo o no
	public boolean esApto(Trabajo trabajo) {
		if(trabajo.esApto(this)) {
			return true;
		}
		return false;
	}
	
	
	//Asiganar trabajo
	public void asignarTrabajo(Trabajo trabajo) {
		if(this.esApto(trabajo)) {
			if(!this.trabajosAsignados.contains(trabajo)) {
				trabajosAsignados.add(trabajo);
			}
		}
		
	}
	
	//cuántos trabajos tiene tal evaluador
	public int cantTrabajos() {
		return this.trabajosAsignados.size();
	}
	
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Evaluador otro = (Evaluador) o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e){
			return false;
		}
	}


	public String getNombre() {
		return nombre;
	}
	
}
