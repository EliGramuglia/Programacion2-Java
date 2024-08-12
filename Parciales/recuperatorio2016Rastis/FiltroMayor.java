package recuperatorio2016Rastis;

public class FiltroMayor implements Filtro{
	private String key;
	private Object value;
	
	public FiltroMayor(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public boolean cumple(Ladrillo l) {
		return ((Double) this.value).compareTo((Double) l.getAtributo(key)) > 0;
	}
}
