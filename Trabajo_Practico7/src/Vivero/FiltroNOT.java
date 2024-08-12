package Vivero;

public class FiltroNOT extends Buscador {
	private Buscador b1;
	
	public FiltroNOT(Buscador b1) {
		this.b1 = b1;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return !b1.cumple(planta);
	}

}
