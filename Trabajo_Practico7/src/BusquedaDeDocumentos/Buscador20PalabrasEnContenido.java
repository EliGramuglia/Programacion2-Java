package BusquedaDeDocumentos;

public class Buscador20PalabrasEnContenido extends Buscador {
	private int cantPalabras;

	public Buscador20PalabrasEnContenido(int cant){
		this.cantPalabras = cant;
	}

	@Override
	public boolean cumple(Documento doc) {
		return doc.cantPalabrasClaves() > cantPalabras;
	}

}
