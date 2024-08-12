package Bazar;

import java.util.ArrayList;

public class Combo extends Elemento {
	private ArrayList<Elemento> elementos;
	private double descuento;
	private double descuentoMax;
	private Filtro filtro;
	

	public Combo(double descuento, double descuentoMax, Filtro f) {
		this.elementos = new ArrayList<>();
		this.descuento = descuento;
		this.descuentoMax = descuentoMax;
		this.filtro = f;
	}
	
	
	
	public void addElem(Elemento e) {
		if(this.filtro.cumple(e)) {
			this.elementos.add(e);
		}
	}
	
	public void setFiltro(Filtro nuevo) {
		this.filtro = nuevo;
		ArrayList<Elemento> original = this.elementos;
		this.elementos = new ArrayList<>();
		for(int i=0; i< original.size();i++) {
			this.addElem(original.get(i));
		}
	}

	@Override
	public int getCantidad() {
		int cantidad = 0;
		for(int i=0; i<this.elementos.size(); i++) {
			cantidad += this.elementos.get(i).getCantidad();
		}
		return cantidad;
	}

	
	protected double precioSinDescuento() {
		double precio = 0;
		for(int i=0; i<this.elementos.size(); i++) {
			precio += this.elementos.get(i).getPrecio();
		}
		return precio;
	}
	
	@Override
	public double getPrecio(){
		double precio = this.precioSinDescuento();
		
		double descuentoPorCantidad = this.getCantidad() * descuento;
		
		double precioDescuento = precio - (precio * descuentoPorCantidad/100);
		double precioDescuentoMax = precio - (precio* this.descuentoMax/100);
						
		if(precioDescuento < precioDescuentoMax) {
			return precioDescuentoMax;
		} else {
			return precioDescuento;
		}
	}

	@Override
	public double getPeso() {
		double acumulador = 0;
		for(int i=0; i<this.elementos.size();i++) {
			acumulador+= this.elementos.get(i).getPeso();
		}
		return acumulador;
	}
	
	@Override
	public ArrayList<String> getCategorias(){
		ArrayList<String> categorias = new ArrayList<>();
		for(Elemento e: elementos) {
			ArrayList<String> aux = e.getCategorias();
			for(String cat: aux) {
				if(!categorias.contains(cat)){
					categorias.add(cat);
				}
			}
		}
		return categorias;
	}
	

	@Override
	public Producto getProductoMenorPeso() {
		double pesoMenor = 99999;
		Producto menor = null;		
		for(int i=0; i<this.elementos.size();i++) {
			Producto ProducMenorPeso = this.elementos.get(i).getProductoMenorPeso();
			double peso = ProducMenorPeso.getPeso();
			 if(menor == null || peso < pesoMenor) {
				 pesoMenor = peso;
				 menor = ProducMenorPeso;
			 }
		}
		return menor;
	}
	

	@Override
	public ArrayList<Elemento> elementosQueCumplen(Filtro f) {  
		ArrayList<Elemento> aux = new ArrayList<>();
		if(f.cumple(this)) {   //si cumplo, me agrego (la busqueda incluia combos) -> se puede abstraer
			aux.add(this);
		} else {               //si no, me fijo si cumplen mis elementos
			for(int i=0; i<this.elementos.size();i++) {
				aux.addAll(this.elementos.get(i).elementosQueCumplen(f));
			}
		}
		return aux;
	}

	
	@Override
	public Elemento getCopia(Filtro f) {
		if(f.cumple(this)) {
			ArrayList<Elemento> hijosQueCumplen = new ArrayList<>();
			for(Elemento e: elementos) {
				Elemento copiaHijo = e.getCopia(f);
				if(copiaHijo != null) {
					hijosQueCumplen.add(copiaHijo);
				}
			}
			if(hijosQueCumplen.isEmpty()) {
				return null;
			} else {
				//hago la copia
				Combo copiaCombo = new Combo(this.descuento, this.descuentoMax, this.filtro);
				for(Elemento elem: hijosQueCumplen){
					copiaCombo.addElem(elem);
				}
				return copiaCombo;
			}
		}
		return null;
	}
	
		/*public Elemento getCopia(Filtro f) {
	    if (f.cumple(this)) {
	        Combo copiaCombo = new Combo(this.descuento, this.descuentoMax, this.filtro);
	
	        for (Elemento elemento : this.elementos) {
	            Elemento copiaHijo = elemento.getCopia(f);
	            if (copiaHijo != null) {
	                copiaCombo.addElem(copiaHijo);
	            }
	        }
	
	        if (!copia.tieneElementos()) { 
	            return copiaCombo;
	        }
	    }
	    return null;
	}*/
	

}
