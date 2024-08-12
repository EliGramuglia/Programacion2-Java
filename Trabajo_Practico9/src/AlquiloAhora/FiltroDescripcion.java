package AlquiloAhora;

public class FiltroDescripcion extends Filtro {
	private String palabra;
	
	
	public FiltroDescripcion(String palabra) {
		super();
		this.palabra = palabra;
	}
	

	@Override
	public boolean cumple(ElementoSimple e) {
		return e.getDescripcion().contains(this.palabra);
	}

}
