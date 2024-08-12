package BusquedaDeDocumentos;

public class BuscadorContienePalabraC extends Buscador {
	private String palabraClave;
	
	
	public BuscadorContienePalabraC(String palabraClave) {
		this.palabraClave = palabraClave;
	}



	@Override
	public boolean cumple(Documento doc) {
		return  doc.contienePalabra(this.palabraClave);
	}

}
