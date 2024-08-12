package Streaming;

import java.util.ArrayList;

public class Plataforma {
	private ArrayList<Pelicula> peliculas;
	private Filtro filtroRentables;

	public Plataforma(Filtro rentables) {
		this.peliculas = new ArrayList<>();
		this.filtroRentables = rentables;
	}
	
	public ArrayList<Pelicula> listarPelis(Filtro filtro){
		ArrayList<Pelicula> aux = new ArrayList<>();
		
		for(int i = 0; i<this.peliculas.size(); i++) {
			if(filtro.cumple(this.peliculas.get(i))) {
				aux.add(this.peliculas.get(i));
			}
		}
		return aux;
	}

	
	public void addPelicula(Pelicula peli) {
		if(!this.peliculas.contains(peli)) {
			if(this.filtroRentables.cumple(peli)) {
				this.peliculas.add(peli);
			}
		}
	}
	
	public void setFiltro(Filtro nuevo) {
		this.filtroRentables = nuevo;
		
		ArrayList<Pelicula> original = this.peliculas;
		this.peliculas = new ArrayList<>();
		
		for (int i = 0; i < original.size(); i++) {
			this.addPelicula(original.get(i));
		}
	}

	
	public ArrayList<Pelicula> getPelis() {
		return new ArrayList<>(this.peliculas);
	}
	
	
}
