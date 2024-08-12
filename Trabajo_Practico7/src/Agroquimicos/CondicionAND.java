package Agroquimicos;

public class CondicionAND extends Filtro {
	private Filtro c1;
	private Filtro c2;
	
	public CondicionAND(CondicionEnfermedad c1,CondicionCultivo c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Agroquimico agro) {
		return c1.cumple(agro) && c2.cumple(agro);
	}

}
