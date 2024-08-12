package recuperatorio2016Rastis;

public class FiltroEquals implements Filtro {
	private String clave;
	private Object value;
	
	public FiltroEquals(String clave, Object value) {
		this.clave = clave;
		this.value = value;
	}
	
	public boolean cumple(Ladrillo l) {
		return this.value.equals(l.getAtributo(clave));
	}
	
}
