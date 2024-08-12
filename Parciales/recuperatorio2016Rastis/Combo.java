package recuperatorio2016Rastis;

import java.util.HashMap;
import java.util.Vector;

public class Combo extends Ladrillo {
	private Vector<Ladrillo> combos;
	private HashMap<String, FormaCalculo> calcular;

	public Combo() {
		super();
		combos = new Vector<Ladrillo>();
	}

	public void addCombo(Ladrillo l) {
		combos.add(l);
	}

	@Override
	public Object getAtributo(String key) {  // Bien
		if (calcular.containsKey(key)) {
			return calcular.get(key).calcular(key, combos);
		} else {
			if (atributos.containsKey(key))
				return atributos.get(key);
			else
				return null;
		}
	}

	@Override
	public Vector<Ladrillo> getListado(Filtro f) {
		Vector<Ladrillo> out = new Vector<Ladrillo>();
		if (f.cumple(this))
			out.add(this);
		else {
			for (int i = 0; i < combos.size(); i++) {
				out.addAll(combos.elementAt(i).getListado(f));
			}
		}
		return out;
	}

	@Override
	public Ladrillo getCopia(Filtro f) {
		Vector<Ladrillo> out = new Vector<Ladrillo>();
		for (int i = 0; i < combos.size(); i++) {
			Ladrillo lad = combos.elementAt(i).getCopia(f);
			if (lad != null)
				out.add(lad);
		}
		if (out.size() == 0)
			return null;
		else {
			Combo c = new Combo();
			atributos.forEach((k, v) -> c.addAtributo(k, v));
			for (int i = 0; i < out.size(); i++)
				c.addCombo(out.elementAt(i));
			return c;
		}
	}

}
