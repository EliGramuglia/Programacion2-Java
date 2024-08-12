package Aseguradora;

public class FiltroNot extends Filtro {
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		super();
		this.f1 = f1;
	}


	@Override
	public boolean cumple(SeguroSimple seguro) {
		return !f1.cumple(seguro);
	}

}
