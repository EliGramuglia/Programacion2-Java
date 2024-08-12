package parcial2016EnvioPaquetes;

public class CAnd implements Criterio {
	Criterio c1, c2;

	public CAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(EnvioSimple e) {
		return c1.cumple(e) && c2.cumple(e);
	}

}