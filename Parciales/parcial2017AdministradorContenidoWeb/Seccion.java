package parcial2017AdministradorContenidoWeb;

import java.util.Date;
import java.util.Vector;

public class Seccion extends Contenido {
	private Vector<Contenido> secciones = new Vector<Contenido>();

	public Seccion(String titulo, Date fecha, Vector<String> editores, String descrip, Seccion padre) {
		super(titulo, fecha, editores, padre, descrip);
	}

	public void addSeccion(Contenido c) {
		secciones.add(c);
	}

	@Override
	public Contenido getCopia(Criterio c) {
		Vector<Contenido> elms = new Vector<Contenido>();
		for (int i = 0; i < secciones.size(); i++) {
			Contenido cont = secciones.elementAt(i).getCopia(c);
			if (cont != null)
				elms.add(cont);
		}
		if (elms.size() == 0)
			return null;
		else {
			Seccion sec = new Seccion(getTitulo(), getFecha(), getEditores(), dato, getPadre());
			for (int i = 0; i < elms.size(); i++)
				sec.addSeccion(elms.elementAt(i));
			return sec;
		}
	}

	@Override
	public Vector<Pagina> obtenerListado(Criterio c) {
		Vector<Pagina> elms = new Vector<Pagina>();
		for (int i = 0; i < secciones.size(); i++) {
			elms.addAll(secciones.elementAt(i).obtenerListado(c));
		}
		return elms;
	}

}
