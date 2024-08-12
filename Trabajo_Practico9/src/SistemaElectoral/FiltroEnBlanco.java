package SistemaElectoral;

public class FiltroEnBlanco extends Filtro {

	@Override
	public boolean cumple(Voto voto) {
		return voto.getReferencia()==null;
	}

}
