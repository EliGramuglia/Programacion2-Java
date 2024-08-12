package PortalDeNoticias;

import java.util.ArrayList;

public abstract class Elemento implements Comparable<Elemento> {
	private String categoria;

	
	public Elemento(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}


	public abstract Elemento getCopia(Filtro f);
	public abstract ArrayList<String> getPalabrasClaves();
	
	@Override 
	public int compareTo(Elemento otro) {
		return this.getCategoria().compareTo(otro.getCategoria());
	}
}
