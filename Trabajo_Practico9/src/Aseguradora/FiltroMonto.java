package Aseguradora;

public class FiltroMonto extends Filtro {
	private double monto;
	
	
	public FiltroMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public boolean cumple(SeguroSimple seguro) {
		return seguro.getMonto() > this.monto;
	}

}
