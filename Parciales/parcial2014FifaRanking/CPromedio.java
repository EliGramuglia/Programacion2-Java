package parcial2014FifaRanking;

import java.util.Vector;

public class CPromedio implements Criterio {
	public CPromedio() {};
	@Override
	public double calcula(Vector<Equipo> ec) {
		double suma = 0;
		if (ec != null) {
			for (int i = 0; i < ec.size(); i++) {
				suma += ec.elementAt(i).getPuntos();
			}
			return suma / ec.size();
		} else {
			return 0;
		}
	}
}
