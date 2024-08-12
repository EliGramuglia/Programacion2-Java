package parcial2017AdministradorContenidoWeb;

public class CriterioEditor implements Criterio {
	private String editor;
	public CriterioEditor (String editor) {
		this.editor = editor;
	}
	public boolean cumple(Pagina p) {
		return p.getEditores().contains(editor);
	}
}
