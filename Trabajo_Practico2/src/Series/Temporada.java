package Series;

import java.util.ArrayList;

public class Temporada {
	//atributos
	private ArrayList<Episodio>episodios;
	
	
	//constructor
	public Temporada(ArrayList<Episodio>episodios) {
		this.episodios = episodios;
	}

	//total de episodios vistos de una temporada particular
	public int totalEpisodiosVistos() {
		int contador = 0;
		for(int i = 0; i < this.episodios.size(); i++) {
			if(this.episodios.get(i).getFlag()== true) {
	            contador++;
			}
		}
		return contador;
	}
	
	//Obtener el promedio de las calificaciones dadas para una temporada particular.
	public double promedioTemporada() {
		double sumatoria = 0;
		int cantidad = episodios.size();
		double promedio = 0;
		
		for(int i = 0; i < cantidad; i++) {
			if(this.episodios.get(i).getFlag() == true) {
				sumatoria += this.episodios.get(i).getCalificacion();
			}
		}
		promedio = (double)sumatoria / cantidad;
		return promedio;
	}
	
	//cuantos episodios tiene 
	public int cantEpisodios() {
		return episodios.size();
	}
	
	

	//Getter (muestra el valor)
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}


	//Setter (establece el valor)
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
	
}
