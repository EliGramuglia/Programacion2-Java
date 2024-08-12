package AlquiloAhora;

import java.util.ArrayList;

public class ElementoObsoleto extends Elemento {
	private int descuento;
	private int antiguedad;
	private Elemento referencia;

	public ElementoObsoleto(int identificacion, int descuento, int antiguedad, Elemento ref) {
		super(identificacion);
		this.descuento = descuento;
		this.antiguedad = antiguedad;
		this.referencia = ref;
	}

	@Override
	public double getValor() {
		double antiguedadRef = this.referencia.getAntiguedad();
		if(antiguedadRef < this.antiguedad) {
			return this.referencia.getValor();
		} else {
			return this.referencia.getValor() - this.descuento;
		}
	}

	@Override
	public int getAntiguedad() {
		return referencia.getAntiguedad();
	}

	@Override
	public ArrayList<ElementoSimple> elemQueCumplen(Filtro f) {
		ArrayList<ElementoSimple> aux = new ArrayList<>();
		if(this.referencia.getAntiguedad() < this.antiguedad) {
			aux.addAll(this.referencia.elemQueCumplen(f));
		} else {
			return aux;
		}
		return aux;
	}

	@Override
	public double getCostoAlquiler() {
		if(this.referencia.getAntiguedad() < this.antiguedad) {
			return this.referencia.getCostoAlquiler();
		} else {
			return this.referencia.getCostoAlquiler() / 2;
		}
	}

}
