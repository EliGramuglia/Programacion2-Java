package parcial2014FifaRanking;

import java.util.Collections;
import java.util.Vector;

public class CPromedioMejores implements Criterio {
	private double valor;

	public CPromedioMejores(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcula(Vector<Equipo> ec) {
		Collections.sort(ec,new MayAMen());
		double suma = 0;
		for (int i = 0 ; i<ec.size() && i<valor ; i++) {
			suma += ec.elementAt(i).getPuntos();
		}
		return suma/ec.size();
	}
}
