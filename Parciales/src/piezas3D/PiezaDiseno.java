package piezas3D;

public class PiezaDiseno extends PiezaCompuesta {
	private Condicion cc;
	
	public PiezaDiseno(Condicion c1,String nom, String des, int extraPla, int extraTiempo) {
		super(nom, des, extraPla, extraTiempo);
	   cc=c1;	
	}
	
	
	public void addElemento(Pieza3D pp) {
		if (cc.cumple(pp)) {
			super.addElemento(pp);
		}
	}


	
	
	
}
