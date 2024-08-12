package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Seguro{
	private int dni;
	private SeguroIntegrado padre = null;
	
	public Seguro(int dni) {
		this.dni = dni;
	}


	public int getDni() {
		return dni;
	}
	
	public SeguroIntegrado getPadre() {
		return padre;
	}
	
	public void setPadre(SeguroIntegrado padre) {
		this.padre = padre;
	}
		
	public abstract int getPoliza();
	
	public abstract double getMonto();
	
	
	public abstract ArrayList<SeguroSimple> segurosQueCumplen(Filtro f);
	
	
	public ArrayList<SeguroSimple> segurosQueCumplenOrdenados(Filtro f, Comparator c){
		ArrayList<SeguroSimple> aux = this.segurosQueCumplen(f);
		Collections.sort(aux, c);
		return aux;
	}

	
	
	
}
