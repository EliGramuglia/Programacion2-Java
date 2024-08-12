package parcial2017AdministradorContenidoWeb;

import java.util.Date;
import java.util.Vector;

public abstract class Contenido {
	protected String titulo;
	protected Date fecha;
	protected Vector<String> editores = new Vector<String>();
	protected Seccion padre;
	protected String dato;

	protected Contenido(String titulo, Date fecha, Vector<String> editores, Seccion padre, String dato) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.editores = editores;
		this.padre = padre;
		this.dato = dato;
	}

	public void addEditor(String editor) {
		editores.add(editor);
	}
	
	public String getDato() {
		return dato;
	}

	public Date getFecha() {
		return fecha;
	}

	public Seccion getPadre() {
		return padre;
	}

	public String getTitulo() {
		return titulo;
	}

	public Vector<String> getEditores() {
		Vector<String> elms = new Vector<String>(editores);
		elms.addAll(padre.getEditores());
		return elms;
	}

	public abstract Contenido getCopia(Criterio c); // Criterio es un criterio de busqueda. Bien
	public abstract Vector<Pagina> obtenerListado(Criterio c);

}
