package recuperatorio2016Rastis;

import java.util.Vector;

public class Pieza extends Ladrillo {

	public Pieza() {
		super();
	};
	
	@Override
	public Object getAtributo(String key) {
		if (atributos.containsKey(key))
			return atributos.get(key);
		else
			return null;
	}

	@Override
	public Vector<Ladrillo> getListado(Filtro f) {
		Vector<Ladrillo> salida = new Vector<Ladrillo>();
		if (f.cumple(this))
			salida.add(this);
		return salida;
	}

	@Override
	public Ladrillo getCopia(Filtro f) {
		if (f.cumple(this)) {
			Pieza out = new Pieza();
			atributos.forEach((k,v) -> out.addAtributo(k, v));
			return out;
		}
		return null;
	}

}
