package SistemaElectoral;

public class FiltroCandidato extends Filtro {
	private Candidato candidato;
	
	
	public FiltroCandidato(Candidato candidato) {
		this.candidato = candidato;
	}


	@Override
	public boolean cumple(Voto voto) {
		return voto.getReferencia()!=null && voto.getReferencia().equals(candidato);
	}

}
