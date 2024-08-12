package recuperatorio2016Rastis;

import java.util.Vector;

public class FSuma implements FormaCalculo {

	public FSuma() {};
	
	@Override
	public Object calcular(String key, Vector<Ladrillo> combos) {
		double suma = 0;
		double actual = 0;
		for (int i = 0 ; i<combos.size();i++) {
			if (combos.elementAt(i).getAtributo(key) != null)
				actual = (Double)combos.elementAt(i).getAtributo(key);
			suma += actual;
			actual = 0;
		}
		return suma;
	}
}
