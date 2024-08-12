package Streaming;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private LocalDate anioEstreno;
	private int duracion; //en minutos
	private int edadMin;
	
	public Pelicula(String titulo, String sinopsis, String director, LocalDate anioEstreno, int duracion, int edadMin) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public LocalDate getAnioEstreno() {
		return anioEstreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}
	
	public void addActor(String actor) {
		if(!this.actores.contains(actor)) {
			this.actores.add(actor);
		}
	}
	public void addGenero(String genero) {
		if(!this.generos.contains(genero)) {
			this.generos.add(genero);
		}
	}
	
	@Override 
	public String toString() {
		return this.getTitulo();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Pelicula otra = (Pelicula) o;
			return this.getTitulo().equals(otra.getTitulo());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean contieneGenero(String genero) {
		return this.generos.contains(genero);
	}
	
	public boolean contieneActor(String actor) {
		return this.actores.contains(actor);
	}
	
}
