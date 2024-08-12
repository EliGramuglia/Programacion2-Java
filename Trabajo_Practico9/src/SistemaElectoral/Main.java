package SistemaElectoral;

public class Main {

	public static void main(String[] args) {
		Localidad tandil = new Localidad();
		
		Localidad escuela1 = new Localidad();
		Localidad escuela2 = new Localidad();
		
		Mesa mesa10 = new Mesa();
		Mesa mesa11 = new Mesa();
		Mesa mesa12 = new Mesa();
		Mesa mesa13 = new Mesa();
		
		tandil.addElemento(escuela1);
		escuela1.addElemento(mesa10);
		escuela1.addElemento(mesa13);
		tandil.addElemento(escuela2);
		escuela2.addElemento(mesa11);
		tandil.addElemento(mesa12);
		
		Persona p1 = new Persona(111, "Pepe");
		Persona p2 = new Persona(222, "Manchi");
		Persona p3 = new Persona(333, "Kima");
		Persona p4 = new Persona(444, "Ema");
		Persona p5 = new Persona(555, "Lau");
		Persona p6 = new Persona(666, "Santi");
		
		System.out.println(p4+ " ya voto? "+p4.yaVoto());

		mesa10.addPersona(p1);
		mesa10.addPersona(p2);
		mesa13.addPersona(p3);
		mesa13.addPersona(p4);
		mesa11.addPersona(p5);
		mesa12.addPersona(p6);
		
		Candidato massa = new Candidato("Massa", "Union por la Patria", "a");
		Candidato milei = new Candidato("Milei", "Libertad Avanza", "b");
		Candidato pato = new Candidato("Bulrrich", "Cambiemos", "c");
		Candidato juan = new Candidato("Schiaretti", "Justicialista", "d");
		Candidato bregman = new Candidato("Bregman", "Frente Izquierda", "e");
		
		tandil.addCandidato(massa);
		tandil.addCandidato(pato);
		tandil.addCandidato(juan);
		tandil.addCandidato(milei);
		tandil.addCandidato(bregman);

		Voto voto1 = new Voto(massa);
		Voto voto2 = new Voto(milei);
		//Voto voto3 = new Voto(pato);
		Voto voto4 = new Voto(juan);
		Voto voto5 = new Voto(bregman);
		Voto enBlanco = new Voto();

		mesa10.registrarVoto(voto1, p1);
		mesa10.registrarVoto(enBlanco, p2);
		mesa13.registrarVoto(voto2, p3);
		mesa13.registrarVoto(voto4, p4);
		mesa11.registrarVoto(voto1, p5);
		mesa12.registrarVoto(voto5, p6);
		
		System.out.println(p4+ " ya voto? "+p4.yaVoto());

		
		System.out.println("Cantidad de votos emitidos: "+ tandil.getCantidadVotos()); //anda
		
		System.out.println("Porcentaje del candidato: "+ tandil.porcentajeVotos(new FiltroCandidato(massa)));
		
		System.out.println("Porcentaje de votos en blanco: " + tandil.porcentajeVotos(new FiltroEnBlanco()));

		System.out.println(tandil.listarCandidatos(new ComparadorCandidato()));

	}

}
