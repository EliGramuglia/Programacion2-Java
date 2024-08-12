package Aseguradora;

import java.util.ArrayList;
import java.util.Collections;

public class SeguroIntegrado extends Seguro{
	private ArrayList<Seguro> seguros;
	
	public SeguroIntegrado(int dni) {
		super(dni);
		this.seguros = new ArrayList<>();
	}
	
	public void addSeguro(Seguro seguro) {
		if(seguro.getPadre()!=null) {
			seguro.getPadre().eliminarPadre(seguro);
		}
		this.seguros.add(seguro);
		seguro.setPadre(this);
	}
	
	public void eliminarPadre(Seguro seguro) {
		this.seguros.remove(seguro);
	}
	

	@Override
	public double getMonto() {
		double aux = 0;
		for(int i= 0; i < this.seguros.size(); i++) {
			aux += this.seguros.get(i).getMonto();
		}
		return aux;
	}

	@Override
	public int getPoliza() {
		ComparadorPoliza c1 = new ComparadorPoliza();
		ArrayList<Seguro> aux = this.seguros;
		Collections.sort(aux, c1.reversed());
		return aux.get(0).getPoliza();
	}

	@Override
	public ArrayList<SeguroSimple> segurosQueCumplen(Filtro f) {
		ArrayList<SeguroSimple> aux = new ArrayList<>();
		for (int i = 0; i < this.seguros.size(); i++) {
				aux.addAll(this.seguros.get(i).segurosQueCumplen(f));
		}
		return aux;
	}






}
