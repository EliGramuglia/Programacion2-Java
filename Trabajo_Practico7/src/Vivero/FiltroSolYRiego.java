package Vivero;

public class FiltroSolYRiego extends Buscador {
	private int sol;
	private int riego;
	
	public FiltroSolYRiego(int sol, int riego) {
		this.sol = sol;
		this.riego = riego;
	}
	
		@Override
	public boolean cumple(Planta planta) {
		return planta.getSol()>sol && planta.getRiego()<riego;
	}

}
