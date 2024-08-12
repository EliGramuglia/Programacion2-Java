package Aseguradora;

public class FiltroDni extends Filtro {
	private int dni;
	
	
	public FiltroDni(int dni) {
		this.dni = dni;
	}


	@Override
	public boolean cumple(SeguroSimple seguro) {
		return seguro.getDni() == this.dni; //no me anda el equals
	}

}
