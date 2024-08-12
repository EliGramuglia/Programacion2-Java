package SitioWeb;

import java.util.ArrayList;

public class Noticia extends Elemento {
	private String titulo;
	private ArrayList<String> palabrasClaves;
	private String introduccion;
	private String texto;
	private String autor;
	private String link;
	
	public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
		this.titulo = titulo;
		this.palabrasClaves = new ArrayList<>();
		this.introduccion = introduccion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
	}
	
	public void addPalabra(String palabra) {
		if(!this.palabrasClaves.contains(palabra)) {
			this.palabrasClaves.add(palabra);
		}
	}
	

	@Override
	public int getCantidadNoticias() {
		return 1;
	}

	@Override
	public ArrayList<Noticia> noticiasQueCumplen(Filtro f) {
		ArrayList<Noticia> aux = new ArrayList<>();
		if(f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	
	//setters and getters

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public String getAutor() {
		return autor;
	}
		
	public String getLink() {
		return link;
	}

	public boolean contienePalabra(String palabra) {
		return this.palabrasClaves.contains(palabra);
	}

	@Override
	public String getPath() {
		return this.getLink();
	}

	@Override
	public Elemento getCopia(FiltroPalabraClave f) {
		if(f.cumple(this)){
			Noticia copiaNoticia= new Noticia(this.getTitulo(), this.getAutor(), this.getLink(),
				this.getIntroduccion(), this.getTexto());
	        for (int i= 0; i<this.palabrasClaves.size(); i++) {
                 copiaNoticia.addPalabra(this.palabrasClaves.get(i));
	        }
	        return copiaNoticia;
	    }
	    return null;
	}
	
	
	@Override
	public String toString() {
		return this.getTitulo();
	}
	
}
