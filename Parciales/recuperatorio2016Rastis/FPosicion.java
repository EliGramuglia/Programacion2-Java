package recuperatorio2016Rastis;

import java.util.Vector;

public class FPosicion implements FormaCalculo{
	private int posicion;
	public FPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public Object calcular(String key, Vector<Ladrillo> combos) {
		for (int i = 0 ; i<combos.size() && i<posicion; i++) {
			if (i == posicion) {
				if (combos.elementAt(i).getAtributo(key) != null)
					return combos.elementAt(i).getAtributo(key);
			}
		}
		return null;
	}

}
