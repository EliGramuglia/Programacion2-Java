package SeleccionDeFutbol;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Entrenador pepe = new Entrenador("Pepe", "Perez", 5054, LocalDate.of(1951, 8, 10), 0001);
		
		System.out.println(pepe.toString());
		
		Futbolista messi = new Futbolista("Lionel", "Messi", 5956, LocalDate.of(1990, 1, 1), 8, "capitan");
		System.out.println("\n" + messi.toString());
		
		messi.cambiarEstado("en concentracion");
		
		Masajista claudia = new Masajista("Claudia","NN",6456, LocalDate.of(1970, 1,1), "Masajista", 7);
		
		claudia.cambiarEstado("Viajando");
		
		System.out.println("\n"+claudia.toString());
		
		System.out.println("\n" + "Está disponible para evento? "+ messi.disponible());
		System.out.println("\n" + "Está disponible para evento? "+ pepe.disponible());
		System.out.println("\n" + "Está disponible para evento? "+ claudia.disponible());

	}

}
