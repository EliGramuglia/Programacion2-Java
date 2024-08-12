package AlquiloAhora;

import java.util.Comparator;

public class ComparadorIdentificacion implements Comparator<Elemento>{

	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getIdentificacion() - o2.getIdentificacion();
	}

}
