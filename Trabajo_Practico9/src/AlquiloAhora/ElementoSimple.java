package AlquiloAhora;

import java.util.ArrayList;

public class ElementoSimple extends Elemento {
	private double valor;
	private int meses;
	private String descripcion;
	private Calculador calculador;

	public ElementoSimple(int identificacion, double valor, int meses, String descripcion, Calculador c) {
		super(identificacion);
		this.valor = valor;
		this.meses = meses;
		this.descripcion = descripcion;
		this.calculador = c;
	}
	


	public void setAntiguedad(int meses) {
		this.meses = meses;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public int getAntiguedad() {
		return this.meses;
	}
	


	@Override
	public ArrayList<ElementoSimple> elemQueCumplen(Filtro f) {
		ArrayList<ElementoSimple> aux = new ArrayList<>();
		if(f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	@Override
	public String toString() {
		return this.descripcion;
	}



	@Override
	public double getCostoAlquiler() {
		return this.calculador.calcularAlquiler(this);
	}

	public void setCalculador(Calculador nuevo) {
		this.calculador = nuevo;
		this.getCostoAlquiler();
	}


}
