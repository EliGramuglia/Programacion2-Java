package PortalDeNoticias;

import java.util.ArrayList;

public class SeccionPolicialesDeportes extends Seccion {
	private ArrayList<String> admisibles;

	public SeccionPolicialesDeportes(String categoria) {
		super(categoria);
		this.admisibles = new ArrayList<>();
	}
	
	public void addAdmisible(String categoria) {
		if(!this.admisibles.contains(categoria)) {
			this.admisibles.add(categoria);
		}
	}
	
	@Override
	public void addElem(Elemento nuevo) {
		if(this.admisibles.contains(nuevo.getCategoria())) {
			super.addElem(nuevo);
		}
	}
	
	@Override
	public Elemento getCopia(Filtro f) {
		ArrayList<Elemento> copiaElementosHijos = new ArrayList<>();
		for(Elemento elem: elementos) {
			Elemento elemHijo = elem.getCopia(f);
			if(elemHijo != null) {
				copiaElementosHijos.add(elemHijo);
			}
		}
		if(copiaElementosHijos.isEmpty()) {
			return null;
		} else {
			SeccionPolicialesDeportes copia = obtenerCopia();
			for(Elemento e: copiaElementosHijos) {
				copia.addElem(e);
			}
			return copia;
		}
		
	}
	
	public SeccionPolicialesDeportes obtenerCopia() {
		SeccionPolicialesDeportes copia = new SeccionPolicialesDeportes(this.getCategoria());
		for(String categoriaNueva: admisibles){
			copia.addAdmisible(categoriaNueva);
		}
		return copia;
	}
	
	
	

}
