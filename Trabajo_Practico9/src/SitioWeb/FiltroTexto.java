package SitioWeb;

public class FiltroTexto extends Filtro {
	private int largo;
	
	
	public FiltroTexto(int largo) {
		this.largo = largo;
	}


	@Override
	public boolean cumple(Noticia n) {
		return n.getTexto().length() > 200;
	}

}
