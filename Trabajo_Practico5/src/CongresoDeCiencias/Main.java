package CongresoDeCiencias;
 
public class Main {

	public static void main(String[] args) {
		//evaluadores
		Evaluador e1 = new Evaluador("Pepe");
		e1.addTema("algoritmos");
		e1.addTema("visualización");
		e1.addTema("redes");	
		Evaluador e2 = new Evaluador("Toto");
		e2.addTema("algoritmos");
		e2.addTema("redes");
		
		//trabajos
		Trabajo art = new Trabajo("articulo");
		art.addTema("algoritmos");
		art.addTema("visualización");
		art.addTema("redes");
		Trabajo revista = new Trabajo("revista");
		revista.addTema("algoritmos");
		Trabajo poster = new Poster("poster");
		poster.addTema("redes");

		Congreso cs = new Congreso();
		cs.addEvaluador(e1);
		cs.addEvaluador(e2);
		cs.addTrabajo(art);
		cs.addTrabajo(revista);
		cs.addTrabajo(poster);
		cs.addTema("algoritmos");
		cs.addTema("visualización");
		
		System.out.println("Posibles evaluadores para articulo: "+ cs.asignarPosibleEvaluador(art));
		System.out.println("Posibles evaluadores para revista: "+ cs.asignarPosibleEvaluador(revista));
		System.out.println("Posibles evaluadores para poster: "+ cs.asignarPosibleEvaluador(poster));
		
		System.out.println("\n" + e1 + " podria realizar estos trabajos: "+ cs.asignarPosiblesTrabajos(e1));
		System.out.println(e2 + " podria realizar estos trabajos: "+ cs.asignarPosiblesTrabajos(e2));
		
		System.out.println("\n"+ e1 + " es experto? "+ cs.experto(e1));
		System.out.println(e2 + " es experto? "+ cs.experto(e2));
		
		e1.asignarTrabajo(art);
		e1.asignarTrabajo(revista);
		e2.asignarTrabajo(poster);
		
		System.out.println(e1.cantTrabajos());
		System.out.println(e2.cantTrabajos());
		
	}

}
