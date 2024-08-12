package parcial2017AdministradorContenidoWeb;

public class CriterioAutor implements Criterio{
	private String nombre;
	public CriterioAutor (String nombre) {
		this.nombre = nombre;
	}
	public boolean cumple(Pagina p) {
		return p.getAutor().equals(nombre);
	}
}
