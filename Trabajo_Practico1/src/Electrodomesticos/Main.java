package Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		Electrodomestico e1 = new Electrodomestico();
		
		System.out.println(e1.esBajoConsumo());
		
		System.out.println(e1.calcularBalance());
		
		System.out.println(e1.esAltaGama());

	}

}
