package Aseguradora;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Seguro> {
	private Comparator comp1;
	private Comparator comp2;
	
	public ComparadorAnd(Comparator c1, Comparator c2) {
		this.comp1 = c1;
		this.comp2 = c2;
	}
	

	@Override
	public int compare(Seguro o1, Seguro o2) {
		int resultado = this.comp1.compare(o1, o2);
		
		if(resultado == 0) {
			resultado = this.comp2.compare(o1, o2);
		}
		return resultado;
	}

}
