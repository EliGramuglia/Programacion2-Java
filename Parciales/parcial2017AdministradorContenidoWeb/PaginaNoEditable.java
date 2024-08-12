package parcial2017AdministradorContenidoWeb;

import java.util.Date;
import java.util.Vector;

public class PaginaNoEditable extends Pagina{

	public PaginaNoEditable(String titulo, Date fecha, Vector<String> editores, String autor, String intro, String txt,
			Seccion padre) {
		super(titulo, fecha, editores, autor, intro, txt, padre);
	}
	
	public Vector<String> getEditores(){
		return new Vector<String>();
	}
	
	public Contenido getCopia(Criterio c) {
		if (c.cumple(this))
			return new PaginaNoEditable(this.getTitulo(),this.getFecha(),null,this.getAutor(),this.getDato(),this.getTexto(),this.getPadre());
		else
			return null;
	}

}
