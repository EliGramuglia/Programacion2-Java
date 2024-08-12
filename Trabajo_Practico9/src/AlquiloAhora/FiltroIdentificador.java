package AlquiloAhora;

public class FiltroIdentificador extends Filtro {
	private int iden;
	
	
	public FiltroIdentificador(int iden) {
		super();
		this.iden = iden;
	}


	@Override
	public boolean cumple(ElementoSimple e) {
		return e.getIdentificacion()==this.iden;
	}

}
