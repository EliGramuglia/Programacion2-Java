package PuertoDeCereales;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Barco b1 = new Barco(50, "Titanic");
		Barco b2 = new Barco(60, "Barquito");
		Barco b3 = new Barco(25, "Barcucho");
		
		Camion c1 = new Camion(LocalDate.of(2023, 8, 23), "Camion1");
		Camion c2 = new Camion(LocalDate.of(2023, 9, 23), "Camion2");
		
		
		Puerto puerto1 = new Puerto();
		
		puerto1.addBarco(b1);
		puerto1.addBarco(b2);
		puerto1.addBarco(b3);
		
		System.out.println(puerto1.getBarcos().getItems());
		
		puerto1.addCamion(c1);
		puerto1.addCamion(c2);

		System.out.println(puerto1.getCamiones().getItems());

	}

}
