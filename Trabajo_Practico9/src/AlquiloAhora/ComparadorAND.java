package AlquiloAhora;

import java.util.Comparator;

public class ComparadorAND implements Comparator<Elemento> {
	private Comparator c1;
	private Comparator c2;
	
	public ComparadorAND(Comparator c1, Comparator c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		int resultado = c1.compare(o1,o2);
		if(resultado == 0) {
			c2.compare(o1,o2);
		}
		return resultado;
	}

}
