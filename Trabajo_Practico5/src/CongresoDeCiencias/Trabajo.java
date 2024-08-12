package CongresoDeCiencias;

import java.util.ArrayList;

public class Trabajo {
	private String nombre;
	protected ArrayList<String>temas;

	public Trabajo(String nombre) {
		this.nombre = nombre;
		this.temas = new ArrayList<>();
	}
	
	public void addTema(String tema) {
		if(!this.temas.contains(tema)) {
			this.temas.add(tema);
		}
	}
	
	//puede ser corregido por tal evaluador o no
	public boolean esApto(Evaluador evaluador) {
		for(int i=0; i < temas.size(); i++) {
			if(!evaluador.sabeTema(temas.get(i))){
				return false;
			}
		}
		return true;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Trabajo otro = (Trabajo) o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch (Exception e){
			return false;
		}
	}
	
}
