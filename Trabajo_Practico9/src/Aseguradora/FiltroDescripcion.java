package Aseguradora;

public class FiltroDescripcion extends Filtro {
	private String palabra;
	

	public FiltroDescripcion(String palabra) {
		this.palabra = palabra;
	}



	@Override
	public boolean cumple(SeguroSimple seguro) {
		return seguro.getDescripcion().contains(this.palabra);
	}

}
