package Bazar;

import java.util.ArrayList;

public class Producto extends Elemento {
	private ArrayList<String> categorias;
	private double peso;
	private double precio;
	
	
	public Producto(double peso, double precio) {
		this.categorias = new ArrayList<>();
		this.peso = peso;
		this.precio = precio;
	}
	
	public void addCategoria(String categoria) {
		if(!this.categorias.contains(categoria)) {
			this.categorias.add(categoria);
		}
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public int getCantidad() {
		return 1;
	}

	@Override
	public ArrayList<String> getCategorias() {
		return new ArrayList<>(this.categorias);
	}
	
	
	@Override
	public Producto getProductoMenorPeso() {
		return this;
	}

	@Override
	public ArrayList<Elemento> elementosQueCumplen(Filtro f) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	public Elemento getCopia(Filtro f) {
		if(f.cumple(this)) {
			Producto copia = new Producto(this.peso, this.precio); 
			for (int i= 0; i<this.categorias.size(); i++) {
                copia.addCategoria(this.categorias.get(i));
	        }
	        return copia;
		}
		return null;
	}
	//si tengo que pasarle un atributo que hereda del padre, entonces cuando instancio un nuevo producto
	//llamo a la funcion del padre. Por ejemplo this.getNombre();
	
}
