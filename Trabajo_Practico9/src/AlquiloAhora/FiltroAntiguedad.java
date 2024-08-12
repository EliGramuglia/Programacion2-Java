package AlquiloAhora;

public class FiltroAntiguedad extends Filtro {
	private int meses;
	
	
	public FiltroAntiguedad(int meses) {
		super();
		this.meses = meses;
	}


	@Override
	public boolean cumple(ElementoSimple e) {
		return e.getAntiguedad() > this.meses;
	}

}
