package recuperatorio2016Rastis;

public class FiltroMenor implements Filtro{
	private String key;
	private Object value;
	
	public FiltroMenor(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public boolean cumple(Ladrillo l) {
		return ((Double) this.value).compareTo((Double) l.getAtributo(key)) < 0;
	}

}
