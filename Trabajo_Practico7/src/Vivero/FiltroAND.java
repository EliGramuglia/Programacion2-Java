package Vivero;

public class FiltroAND extends Buscador {
	private Buscador b1;
	private Buscador b2;
	
	public FiltroAND(Buscador b1, Buscador b2) {
		this.b1 = b1;
		this.b2 = b2;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return b1.cumple(planta) && b2.cumple(planta);
	}

}
