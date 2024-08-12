package CongresoDeCiencias;

public class Poster extends Trabajo {

	public Poster(String nombre) {
		super(nombre);
	}

	@Override
	public boolean esApto(Evaluador evaluador) {
		for(int i=0; i < temas.size(); i++) {
			if(evaluador.sabeTema(temas.get(i))){
				return true;
			}
		}
		return false;
	}
}
