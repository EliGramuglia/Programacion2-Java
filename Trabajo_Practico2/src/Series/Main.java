package Series;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Episodio> episodios = new ArrayList<>();
		
		ArrayList<Temporada> temporadas = new ArrayList<>();
		
		Episodio ep1 = new Episodio("Secretos","Jonas, el hijo adolescente de Michael...");
		Episodio ep2 = new Episodio("Mentiras", "Mientras busca en las cuevas, encuentra");
		Episodio ep3 = new Episodio("Pasado y presente", " la desaparición de Mads Nielsen");
		
		
		episodios.add(ep1);
		episodios.add(ep2);
		episodios.add(ep3);
		
		
		Temporada temporada1 = new Temporada(episodios);
		
		temporadas.add(temporada1);
		
		
		//Episodio ep4 = new Episodio("Lalala","nnnnn");
		//Episodio ep5 = new Episodio("turururur","aaaaaa");
		
		
		
		
		
		Serie serieDark = new Serie("Dark", "Excelente", "NN","suspenso/ficcion",temporadas);
		
		
		ep1.calificar(5);
		System.out.println("El episodio 2 ha sido visto? " + ep2.getFlag());
		ep1.setFlag(true);
		ep2.setFlag(true);
		System.out.println("Total de episodios visto de la t1 " +temporada1.totalEpisodiosVistos());
		System.out.println(ep3.getCalificacion());
		ep2.calificar(4);
		ep3.setFlag(true);
		ep3.calificar(4);
		System.out.println("Promedio de las calificaciones para la temporada1 es "+ temporada1.promedioTemporada());
		
		System.out.println("promedio de la serie: "+serieDark.promedioSerie());
		System.out.println("Total de epidosdios vistos de la serie Dark: "+serieDark.totalVistosDeSerie());
		System.out.println("Vieron la serie completa?"+serieDark.serieVistaEntera());
	}

}
