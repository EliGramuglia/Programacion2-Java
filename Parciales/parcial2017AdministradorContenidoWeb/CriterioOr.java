package parcial2017AdministradorContenidoWeb;

public class CriterioOr implements Criterio {
	private Criterio c1, c2;

	public CriterioOr(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(Pagina p) {
		return c1.cumple(p) || c2.cumple(p);
	}
}
