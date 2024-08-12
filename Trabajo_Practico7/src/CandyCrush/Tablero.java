package CandyCrush;

import java.util.ArrayList;

public class Tablero {
	private int ptosMin;
	private int dificultad;
	private ArrayList<Ficha> fichas;
	
	public Tablero(int ptosMin) {
		this.ptosMin = ptosMin;
		this.fichas = new ArrayList<>();
		this.dificultad = 0;
	}
	
	public void addFicha(Ficha ficha) {
		if(!this.fichas.contains(ficha)) {
			this.fichas.add(ficha);
		}
	}
	
	public void calcularDificultad() {
		int sumatoriaFortaleza = 0;
		int sumatoriaDestruccion = 0;
		
		for(int i=0; i< this.fichas.size(); i++) {
			sumatoriaFortaleza += this.fichas.get(i).getFortaleza();
			sumatoriaDestruccion += this.fichas.get(i).getDestruccion();
		}
		this.dificultad = sumatoriaFortaleza / sumatoriaDestruccion;
	}

	public int getPtosMin() {
		return ptosMin;
	}

	public int getDificultad() {
		return dificultad;
	}
	
	public ArrayList<Ficha> listarFichas(Filtro filtro){
		ArrayList<Ficha> aux = new ArrayList<>();
		
		for(int i = 0; i < this.fichas.size(); i++) {
			if(filtro.cumple(this.fichas.get(i))) {
				aux.add(this.fichas.get(i));
			}
		}
		return aux;
	}
	
	
	
	
	
}
