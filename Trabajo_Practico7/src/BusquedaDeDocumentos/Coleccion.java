package BusquedaDeDocumentos;

import java.util.ArrayList;

public class Coleccion {
	private ArrayList<Documento> documentos;
	
	public Coleccion() {
		this.documentos = new ArrayList<>();
	}
	
	public void addDoc(Documento documento) {
		if(!this.documentos.contains(documento)) {
			this.documentos.add(documento);
		}
	}
	
	public ArrayList<Documento> listarDoc(Buscador filtro){
		ArrayList<Documento> aux = new ArrayList<>();
		
		for(int i=0; i < this.documentos.size(); i++) {
			if(filtro.cumple(this.documentos.get(i))) {
				aux.add(this.documentos.get(i));
			}
		}
		return aux;
	}
}
