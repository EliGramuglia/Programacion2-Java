package SistemaDeAlquiler;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pelicula titanic = new Pelicula("Titanic", 3);
		Pelicula movidic = new Pelicula("Movidic", 1);
		Vehiculo fiat = new Vehiculo("Fiat", 1111, 546);
		
		Cliente lau = new Cliente("Lautaro");
		Cliente santi = new Cliente("Santiago");
		
		Sistema video = new Sistema();
		
		video.addCliente(lau);
		video.addCliente(santi);
		video.addItem(titanic);
		video.addItem(movidic);
		video.addItem(fiat);
		
		video.alquilarItem(titanic, lau, LocalDate.of(2023,10,01));
		video.alquilarItem(titanic, santi, LocalDate.of(2022,01,01));
		
		System.out.println(video.tieneAlquilado(lau));
		System.out.println(video.verDeudores());
		System.out.println(lau.esDeudor());
		
		lau.devolverItem(titanic);
		System.out.println(video.verDeudores());
		

	}

}
