package recuperatorio2017CableCoaxil;

public class COr implements Criterio {
	Criterio c1, c2;

	public COr(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(Cable cs) {
		return c1.cumple(cs) || c2.cumple(cs);
	}
}