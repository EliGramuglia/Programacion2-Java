package Avicola;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Fresco
		Producto huevo = new Producto(LocalDate.of(2023, 12, 13), 500, LocalDate.of(2023, 1, 23), "La Paulina");

		System.out.println(huevo.toString());
		
		//Refrigerado o congelado
		CongeladoRefrigerado pollo = new CongeladoRefrigerado(LocalDate.of(2023, 11, 23), 554,
				LocalDate.of(2023, 1, 15), "Los Pinos", 9000, 15);

		System.out.println("\n"+pollo.toString());
		
		//Congelado Aire
		CongeladoAire arvejas = new CongeladoAire(LocalDate.of(2023, 8, 22), 556,
				LocalDate.of(2023, 1, 10), "Granja Arveja", 9000, 15, 25, 25, 25, 25);
		
		System.out.println("\n\n"+arvejas.toString());
		
		//Congelado Nitrogeno
		CongeladoNitrogeno patitas = new CongeladoNitrogeno(LocalDate.of(2023, 8, 22), 556,
				LocalDate.of(2023, 1, 10), "Granja Arveja", 9000, 10, "No identificado", 88);
		
		System.out.println("\n\n"+patitas.toString());
		
		//Congelado Agua
				CongeladoAgua papasFritas = new CongeladoAgua (LocalDate.of(2023, 8, 22), 556,
						LocalDate.of(2023, 1, 10), "Granja Arveja", 9000,18, 20);
				
				System.out.println("\n\n"+papasFritas.toString());
	}

}
