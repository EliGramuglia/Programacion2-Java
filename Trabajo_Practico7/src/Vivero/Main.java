package Vivero;

public class Main {

	public static void main(String[] args) {
		Vivero floreria = new Vivero();
		
		Planta chilca = new Planta("chilca aureum", "aaa", "family", "plantita", "exterior", 9, 2);
		chilca.addNombre("chilca de la sierras");
		chilca.addNombre("lengua de suegra");
		
		Planta potus = new Planta("Epipremnum aureum","Epipremnum", "Araceae", "Monocotyledoneae","interior",3,2);
		potus.addNombre("potus");
		potus.addNombre("potos");
		
		floreria.addPlanta(chilca);
		floreria.addPlanta(potus);
		
		System.out.println("Todas las plantas cuyo nombre científico incluya la palabra “auereum”");
		System.out.println(floreria.listarPlantas(new FiltroNombreCientifico()));
		
		System.out.println("\nTodas las plantas a las que se conozca vulgarmente como “lengua de suegra”");
		System.out.println(floreria.listarPlantas(new FiltroNombreVulgar()));
		
		System.out.println("\nTodas las plantas cuya clasificación sea “Crassula”");
		System.out.println(floreria.listarPlantas(new FiltroClasificacionCrassula()));
		
		System.out.println("\nTodas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3");
		System.out.println(floreria.listarPlantas(new FiltroSolYRiego()));
		
		System.out.println("\nTodas las plantas de interior que necesiten poco riego (inferior a 3)");
		System.out.println(floreria.listarPlantas(new FiltroInteriorRiego()));
	}

}
