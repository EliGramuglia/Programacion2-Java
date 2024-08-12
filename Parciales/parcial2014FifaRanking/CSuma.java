package parcial2014FifaRanking;

import java.util.Vector;

public class CSuma implements Criterio {
	public CSuma() {};
	public double calcula(Vector<Equipo> ec) {
		double suma = 0;
		for (int i = 0; i<ec.size();i++) {
			suma += ec.elementAt(i).getPuntos();
		}
		return suma;
	}
}
