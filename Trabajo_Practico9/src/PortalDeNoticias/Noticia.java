package PortalDeNoticias;

import java.util.ArrayList;

public class Noticia extends Elemento {
	private String contenido;
	private String titulo;
	private String autor;
	private ArrayList<String> palabrasClaves;
	
	
	public Noticia(String categoria, String titulo, String autor, String contenido) {
		super(categoria);
		this.contenido = contenido;
		this.titulo = titulo;
		this.autor = autor;
		this.palabrasClaves = new ArrayList<>();
	}
	
	public void addPalabra(String palabra) {
		if(!this.palabrasClaves.contains(palabra)) {
			this.palabrasClaves.add(palabra);
		}
	}
	
	

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}




	@Override
	public Elemento getCopia(Filtro f) {
		if(f.cumple(this)) {
			Noticia copia = new Noticia(this.getCategoria(),this.contenido,
					this.titulo, this.autor);
			for(int i=0; i<this.palabrasClaves.size(); i++) {
				copia.addPalabra(this.palabrasClaves.get(i));
			}
			return copia;
		}
		return null;
	}


	@Override
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<String>(this.palabrasClaves);
	}
	
	public boolean contienePalabra(String palabra) {
		return this.palabrasClaves.contains(palabra);
	}

}
