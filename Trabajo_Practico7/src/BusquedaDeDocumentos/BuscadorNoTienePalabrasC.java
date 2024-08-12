package BusquedaDeDocumentos;

public class BuscadorNoTienePalabrasC extends Buscador {

	@Override
	public boolean cumple(Documento doc) {
		return doc.noTienePalabrasClaves();
	}

}
