package Series;

import java.util.ArrayList;

public class Serie {
	//atributos
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList<Temporada>temporadas; 
	
	//constructor
	public Serie(String titulo, String descripcion,String creador,String genero, ArrayList<Temporada>temporadas){
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;	
	}


	//total de episodios vistos de una serie
	public int totalVistosDeSerie() {
		int contador = 0;
		for(int i = 0; i < temporadas.size(); i++) {
			contador += temporadas.get(i).totalEpisodiosVistos();
		}
		
	return contador;
	}
	
	
	
	//Obtener el promedio de las calificaciones dadas para una serie.
	public double promedioSerie() {
		double sumatoria = 0;
		int cantidad = temporadas.size();
	
		for(int i = 0; i < cantidad; i++) {
			sumatoria += this.temporadas.get(i).promedioTemporada();
		}
		return sumatoria / cantidad;		
	}
	
	
	//Determinar si se vio todos los capitulos de una serie
	public boolean serieVistaEntera() {
		for(int i = 0; i < temporadas.size(); i++) {
			if(temporadas.get(i).totalEpisodiosVistos() != temporadas.get(i).cantEpisodios()) {
				return false;
			}
		}
		return true;
	}
	
	//Setters and getters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public ArrayList<Temporada> getTemporadas() {
		return this.temporadas;
	}


	public void setTemp(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	
}
