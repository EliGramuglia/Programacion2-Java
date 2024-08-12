package AlquiloAhora;

import java.util.ArrayList;
import java.util.Collections;

public class Combo extends Elemento {
	ArrayList<Elemento> elementos;

	public Combo(int identificacion) {
		super(identificacion);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento elem) {
		if(!this.elementos.contains(elem)) {
			this.elementos.add(elem);
		}
	}

	@Override
	public double getValor() {
		double acumulador = 0;
		for(int i= 0; i < this.elementos.size(); i++) {
			acumulador += this.elementos.get(i).getValor();
		}
		return acumulador;
	}

	@Override
	public int getAntiguedad() {
		int mayor = 0;
		for(Elemento elemento: this.elementos) {
			int antiguedadElem = elemento.getAntiguedad();
			if(antiguedadElem > mayor) {
				mayor = antiguedadElem;
			}
		}
		return mayor;
	}
	

	@Override
	public ArrayList<ElementoSimple> elemQueCumplen(Filtro f) {
		ArrayList<ElementoSimple> aux = new ArrayList<>();
		for(int i = 0; i<this.elementos.size();i++) {
				aux.addAll(this.elementos.get(i).elemQueCumplen(f));
		}
		return aux;
	}

	public ArrayList<Elemento> listar(){
		return this.elementos;
	}

	@Override
	public double getCostoAlquiler() {
		double acumulador = 0;
		for(Elemento e: elementos) {
			acumulador += e.getCostoAlquiler();
		}
		return acumulador;
	}
}
