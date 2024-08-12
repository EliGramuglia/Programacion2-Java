package SistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoElectoral {
	private Localidad padre = null;
	private ArrayList<Candidato> candidatos;
		
	public ElementoElectoral() {
		this.candidatos = new ArrayList<>();
	}
	
	
	public void addCandidato(Candidato candidato) {
		if(!this.candidatos.contains(candidato)) {
			this.candidatos.add(candidato);
		}
	}

	public Localidad getPadre() {
		return padre;
	}

	public void setPadre(Localidad padre) {
		this.padre = padre;
	}


	public abstract int getCantidadVotos();
	
	public abstract double cantVotos(Filtro filtro);
	
	
	
	public double porcentajeVotos(Filtro filtro) {
		return (this.cantVotos(filtro) / this.getCantidadVotos()) * 100;
	}
	

	public ArrayList<Candidato> listarCandidatos(Comparator<Candidato> comparador){
		ArrayList<Candidato> aux = this.candidatos;
		Collections.sort(aux, comparador);
		return aux;
	}
	

	
}
