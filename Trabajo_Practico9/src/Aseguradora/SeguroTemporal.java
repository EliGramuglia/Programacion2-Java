package Aseguradora;

import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro {
	private LocalDate inicio;
	private LocalDate fin;
	private Seguro referencia;
	
	
	public SeguroTemporal(int dni, LocalDate inicio, LocalDate fin, Seguro referencia) {
		super(dni);
		this.inicio = inicio;
		this.fin = fin;
		this.referencia = referencia;
	}
	

	@Override
	public int getPoliza() {
		return referencia.getPoliza();
	}

	@Override
	public double getMonto() {
		LocalDate hoy = LocalDate.now();
		if(this.fin.isAfter(hoy) && this.inicio.isBefore(hoy)) {
			return referencia.getMonto();
		} else {
			return 0;
		}
	}

	@Override
	public ArrayList<SeguroSimple> segurosQueCumplen(Filtro f) {
		ArrayList<SeguroSimple> aux = new ArrayList<>();
		LocalDate hoy = LocalDate.now();
		if(this.fin.isAfter(hoy) && this.inicio.isBefore(hoy)) {
			 aux.addAll(this.referencia.segurosQueCumplen(f));
		}
		return aux;
	}
	


}
