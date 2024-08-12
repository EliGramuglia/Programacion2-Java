package Aseguradora;

import java.util.ArrayList;
import java.util.Comparator;

public class SeguroSimple extends Seguro {
	private CalculadorMonto calculador;
	private double monto;
	private String descripcion;
	private int poliza;

	
	public SeguroSimple(int dni, String descripcion,CalculadorMonto calculador, int poliza) {
		super(dni);
		this.calculador = calculador;
		this.descripcion = descripcion;
		this.poliza = poliza;
	}


	public void setCalculador(CalculadorMonto nuevo) {
		this.calculador = nuevo;
		this.monto = getMonto();
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	@Override
	public int getPoliza() {
		return this.poliza;
	}
	
	@Override
	public double getMonto() {
		return this.calculador.obtenerMonto();
	}


	@Override
	public ArrayList<SeguroSimple> segurosQueCumplen(Filtro f) {
		ArrayList<SeguroSimple> aux = new ArrayList<>();
		if(f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}


	
	
	
	
	@Override
	public String toString() {
		return this.descripcion;
	}


}
