package AlquiloAhora;

import java.util.Comparator;

public class ComparadorAntiguedad implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getAntiguedad() - o2.getAntiguedad();
	}
	
	

}
