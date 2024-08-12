package Streaming;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Plataforma netflix = new Plataforma(new FiltroNot(new FiltroTitulo("z")));
		
		Pelicula p1 = new Pelicula("La vida es bella", "aa", "Pepe", LocalDate.of(2020, 1, 1), 116, 12);
		p1.addActor("Roberto Benigni");
		p1.addGenero("Drama");
		p1.addGenero("Belico");
		
		Pelicula p2 = new Pelicula("Rocky", "aa", "Stallone", LocalDate.of(2020, 1, 1), 119, 12);
		p2.addActor("Stallone");
		p2.addGenero("Drama");
		p2.addGenero("Deporte");
		
		Pelicula p3 = new Pelicula("Titanic", "aa", "James Cameron", LocalDate.of(2020, 1, 1), 194, 10);
		p3.addActor("Leo DiCaprio");
		p3.addGenero("Romance");
		p3.addGenero("Drama");
		
		
		netflix.addPelicula(p1);
		netflix.addPelicula(p2);
		netflix.addPelicula(p3);
		System.out.println("Peliculas de mi plataforma: "+ netflix.getPelis());
		
		
		/*System.out.println(netflix.listarPelis(new FiltroTitulo("bella")));
		System.out.println(netflix.listarPelis(new FiltroGenero("Drama")));
		//Es lo mismo (probé las dos soluciones)
		//System.out.println(netflix.listarPelis(new FiltroActorYDirector("Stallone", "Pepe")));
		System.out.println(netflix.listarPelis(new FiltroAnd(new FiltroActor("Stallone"), new FiltroNot(new FiltroDirector("Pepe")))));
		//
		System.out.println(netflix.listarPelis(new FiltroEstrenoYDuracion()));*/
		
		
		//CAMBIO EN TIEMPO DE EJECUCION

		netflix.setFiltro(new FiltroAnd(new FiltroPeliculasRentables1("comedia", 120),
				new FiltroPeliculasRentables2(LocalDate.of(2017, 1, 1), "infantil", "documental")));
		
		
		System.out.println("Peliculas de mi plataforma: "+ netflix.getPelis());


	}

}
