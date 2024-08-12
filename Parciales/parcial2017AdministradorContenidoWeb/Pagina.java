package parcial2017AdministradorContenidoWeb;

import java.util.Date;
import java.util.Vector;

public class Pagina extends Contenido {
	private String autor;
	private String texto;

	public Pagina(String titulo, Date fecha, Vector<String> editores, String autor, String intro, String txt,
			Seccion padre) {
		super(titulo, fecha, editores, padre, intro);
		texto = txt;
	}

	public String getTexto() {
		return texto;
	}

	public String getAutor() {
		return autor;
	}


	@Override
	public Contenido getCopia(Criterio c) {
		if (c.cumple(this))
			return new Pagina(this.titulo,this.fecha,this.editores,this.autor,this.texto,dato,this.padre);
		return null;
	}

	@Override
	public Vector<Pagina> obtenerListado(Criterio c) {
		Vector<Pagina> elms = new Vector<Pagina>();
		if (c.cumple(this))
			elms.add(this);
		return elms;
	}

}
