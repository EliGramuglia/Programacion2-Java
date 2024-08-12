package PortalDeNoticias;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion extends Elemento {
	protected ArrayList<Elemento> elementos;

	public Seccion(String categoria) {
		super(categoria);
		this.elementos = new ArrayList<>();
	}
	
	
	public void addElem(Elemento nuevo) {
		 this.elementos.add(nuevo);
		 Collections.sort(this.elementos);
	}
	

	@Override
	public Elemento getCopia(Filtro f) {
		ArrayList<Elemento> copiaElementos = new ArrayList<>();
		for(Elemento e: elementos) {
			Elemento elemHijo = e.getCopia(f);
			if(elemHijo != null) {
				copiaElementos.add(elemHijo);
			}
		}
		if(copiaElementos.isEmpty()) {
			return null;
		}else { //hago la copia
			Seccion copiaSeccion = new Seccion(this.getCategoria());
			for(Elemento elem: copiaElementos) {
				copiaSeccion.addElem(elem);
			}
			return copiaSeccion;
		}	
	}



	@Override
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> palabrasClaves = new ArrayList<>();
		for(Elemento e: elementos) {
			ArrayList<String> aux = e.getPalabrasClaves();
			for(String palabraElem: aux) {
				if(!palabrasClaves.contains(palabraElem)) {
					palabrasClaves.add(palabraElem);
				}
			}
		}
		return palabrasClaves;
	}

}
