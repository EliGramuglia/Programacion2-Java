package Agroquimicos;

public class CondicionEnfermedad extends Filtro {
	private Enfermedad enfermedad;
	
	public CondicionEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	@Override
	public boolean cumple(Agroquimico agro) {
		return enfermedad.sePuedeTratarCon(agro);
	}

}
