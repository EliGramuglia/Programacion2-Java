package parcial2014FifaRanking;

import java.util.Comparator;

public class MayAMen implements Comparator<Equipo> {

	@Override
	public int compare(Equipo o1, Equipo o2) {
		return (int) (o1.getPuntos() - o2.getPuntos());
	}

	
}
