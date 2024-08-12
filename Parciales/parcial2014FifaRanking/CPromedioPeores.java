package parcial2014FifaRanking;

import java.util.Collections;
import java.util.Vector;

public class CPromedioPeores {
	private double valor;

	public CPromedioPeores(double valor) {
		this.valor = valor;
	}

	public double calcula(Vector<EquipoSimple> ec) {
		Collections.sort(ec, new MayAMen());
		int suma = 0;
		for (int i = ec.size(); i>ec.size() - valor && i>=0; i--) {
			suma += ec.elementAt(i).getPuntos();
		}
		return suma / valor;
	}
}
