package SitioWeb;

import java.util.ArrayList;

public abstract class Elemento {
	private Categoria padre = null;

	
	
	public Categoria getPadre() {
		return padre;
	}

	public void setPadre(Categoria padre) {
		this.padre = padre;
	}

	
	
	public abstract int getCantidadNoticias();
	
	public abstract ArrayList<Noticia> noticiasQueCumplen(Filtro f);
	
	public abstract Elemento getCopia(FiltroPalabraClave palabraClave);
	
	public abstract String getPath();     
	
	
}
