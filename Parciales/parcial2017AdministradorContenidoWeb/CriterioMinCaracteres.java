package parcial2017AdministradorContenidoWeb;

public class CriterioMinCaracteres implements Criterio {
	int cantCaracter;
	public CriterioMinCaracteres(int cantidad) {
		cantCaracter = cantidad;
	};

	@Override
	public boolean cumple(Pagina p) {
		return p.getTexto().length() > cantCaracter;
	}
}
