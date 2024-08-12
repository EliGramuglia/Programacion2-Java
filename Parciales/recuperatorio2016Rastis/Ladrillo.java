package recuperatorio2016Rastis;

import java.util.*;

public abstract class Ladrillo {
	protected HashMap<String,Object> atributos;
	
	protected Ladrillo() {
		atributos = new HashMap<String,Object>();
	}
	
	public void addAtributo(String key, Object value) {
		atributos.put(key, value);
	}
	
	public abstract Object getAtributo(String key);
	public abstract Vector<Ladrillo> getListado(Filtro f);
	public abstract Ladrillo getCopia(Filtro f);
	
}
