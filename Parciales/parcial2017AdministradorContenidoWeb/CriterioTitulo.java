package parcial2017AdministradorContenidoWeb;

public class CriterioTitulo implements Criterio {
	private String titulo;
	public CriterioTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean cumple(Pagina p) {
		return p.getTitulo().equals(titulo);
	}
}
