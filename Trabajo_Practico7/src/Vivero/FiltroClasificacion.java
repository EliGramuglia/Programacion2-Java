package Vivero;

public class FiltroClasificacion extends Buscador {
	private String clasificacion;

	public FiltroClasificacion(String c){
		this.clasificacion = c;
	}

	@Override
	public boolean cumple(Planta planta) {
		return planta.getClasificacion().equals(clasificacion);
	}

}
