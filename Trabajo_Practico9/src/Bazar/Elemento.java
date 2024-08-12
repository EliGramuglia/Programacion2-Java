package Bazar;

import java.util.ArrayList;

public abstract class Elemento {

	
	public abstract int getCantidad();
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String> getCategorias();
	public abstract Producto getProductoMenorPeso();
	public abstract ArrayList<Elemento> elementosQueCumplen(Filtro f);
	public abstract Elemento getCopia(Filtro f);

	public boolean contieneCategoria(String categoria) {
		return this.getCategorias().contains(categoria);
	}
}
	
