package AlquiloAhora;

public class FiltroValorMayor extends Filtro {
	private double valor;
		

	public FiltroValorMayor(double valor) {
		super();
		this.valor = valor;
	}


	@Override
	public boolean cumple(ElementoSimple e) {
		return e.getValor() > this.valor;
	}

}
