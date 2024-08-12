package BusquedaDeDocumentos;

public class Buscador20PalabrasEnContenido extends Buscador {

	@Override
	public boolean cumple(Documento doc) {
		return false;
		//doc.getContenido() >= 20;  COMO SE CUENTAN LAS PALABRAS
	}

}
