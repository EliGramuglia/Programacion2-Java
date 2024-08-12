package SitioWeb;

public class FiltroPalabraClave extends Filtro {
	private String palabra;
	
	
	public FiltroPalabraClave(String palabra) {
		this.palabra = palabra;
	}


	@Override
	public boolean cumple(Noticia n) {
		return n.contienePalabra(this.palabra);
	}

}
