package CongresoDeCiencias;

import java.util.ArrayList;

public class Congreso {
	private ArrayList<Evaluador>evaluadores;
	private ArrayList<Trabajo>trabajos;
	private ArrayList<String> requicitosExperto;
	
	public Congreso() {
		this.evaluadores = new ArrayList<>();
		this.trabajos = new ArrayList<>();
		this.requicitosExperto = new ArrayList<>();
	}
	
	public void addEvaluador(Evaluador evaluador) {
		if(!this.evaluadores.contains(evaluador)) {
			this.evaluadores.add(evaluador);
		}
	}
	public void addTrabajo(Trabajo trabajo) {
		if(!this.trabajos.contains(trabajo)) {
			this.trabajos.add(trabajo);
		}
	}
	public void addTema(String tema) {
		if(!this.requicitosExperto.contains(tema)) {
			this.requicitosExperto.add(tema);
		}
	}
	
	//es experto?
	public boolean experto(Evaluador evaluador) {
		for(int i=0; i<this.requicitosExperto.size();i++) {
			if(!evaluador.sabeTema(requicitosExperto.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	//qué evaluador puede asignarse a un determinado trabajo
	public ArrayList<Evaluador> asignarPosibleEvaluador(Trabajo trabajo){
		ArrayList<Evaluador> aux = new  ArrayList<>();
		for(int i=0; i < this.evaluadores.size(); i++) {
			if(this.evaluadores.get(i).esApto(trabajo)) {
				aux.add(this.evaluadores.get(i));
			}
		}
		return aux;
	}
	
	//qué trabajos pueden asignarse un evaluador particular
		public ArrayList<Trabajo> asignarPosiblesTrabajos(Evaluador evaluador){
			ArrayList<Trabajo>aux = new ArrayList<>();
			for(int i=0; i < this.trabajos.size(); i++) {
				if(this.trabajos.get(i).esApto(evaluador)) {
					aux.add(this.trabajos.get(i));
				}
			}
			return aux;
		}
	
	
	
	
}
