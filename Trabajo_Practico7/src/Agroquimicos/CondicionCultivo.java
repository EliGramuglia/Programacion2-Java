package Agroquimicos;

public class CondicionCultivo extends Filtro {
	private Cultivo cultivo;
	
	public CondicionCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	@Override
	public boolean cumple(Agroquimico agro) {
		return cultivo.sePuedeTratarCon(agro);
	}

}