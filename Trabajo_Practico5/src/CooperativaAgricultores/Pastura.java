package CooperativaAgricultores;

public class Pastura extends Cereal {
	private int hectareasRequeridas;

	public Pastura(String nombre) {
		super(nombre);
		this.hectareasRequeridas = 50;
	}

	@Override
	public boolean sePuedeSembrar(Lote lote) {
		if(super.sePuedeSembrar(lote) && lote.getCantHectareas()>this.hectareasRequeridas) {
			return true;
		}
		return false;
	}
}
