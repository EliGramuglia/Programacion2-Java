package AlquiloAhora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento {
	private int identificacion;

	public Elemento(int identificacion) {
		this.identificacion = identificacion;
	}
	
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	public abstract double getValor();
	public abstract int getAntiguedad();
	public abstract double getCostoAlquiler();
	public abstract ArrayList<ElementoSimple> elemQueCumplen(Filtro f);
	
	public ArrayList<ElementoSimple> elemQueCumplenOrdenados(Filtro f, Comparator c){
		ArrayList<ElementoSimple> aux = this.elemQueCumplen(f);
		Collections.sort(aux, c);
		return aux;
	} //Todos los resultados se devuelven ordenados por código de identificación, y en caso de
		//igualdad por antigüedad.   
	
	
	
	@Override
	public boolean equals(Object o) {
		try {
			Elemento e = (Elemento) o;
			return this.getIdentificacion()==(e.getIdentificacion()); //no me deja comparar con equal por el tipo de dato
		}
		catch(Exception e) {
			return false;
		}
	}
	
}
