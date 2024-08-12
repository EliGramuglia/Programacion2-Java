package BusquedaDeDocumentos;

import java.util.ArrayList;

public class Documento {
	private String nombre;
	private String titulo;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClaves;
	
	public Documento(String nombre, String titulo, String contenido) {
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<>();
		this.palabrasClaves = new ArrayList<>();
	}
	
	public void addAutor(String autor) {
		if(!this.autores.contains(autor)) {
			this.autores.add(autor);
		}
	}
	public void addPalabra(String palabra) {
		if(!this.palabrasClaves.contains(palabra)) {
			this.palabrasClaves.add(palabra);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String toString() {
		return this.getNombre();
	}
	
	public boolean contienePalabra(String palabra) {
		return this.palabrasClaves.contains(palabra);
	}
	
	public boolean noTienePalabrasClaves() {
		return this.palabrasClaves.size() == 0;
	}
	
	public boolean loEscribioX(String autor) {
		return this.autores.contains(autor);
	}

	public int cantPalabrasClaves(){
		return this.palabrasClaves.size();
	}
	
}
