package BusquedaDeDocumentos;

public class Main {

	public static void main(String[] args) {
		Coleccion coleccion1 = new Coleccion();
		
		//creamos docs
		Documento d1 = new Documento("documento1", "Don Quijote", "habia una vez");
		d1.addAutor("Marquez");
		d1.addAutor("Galeano");
		d1.addPalabra("globalizacion");
		d1.addPalabra("suspenso");
		
		Documento d2 = new Documento("documento2", "El Principito", "habia ");
		d2.addAutor("Marquez");
		d2.addPalabra("globalizacion");
		
		Documento d3 = new Documento("documento3", "Martin Fierro", "habia una vez");
		d3.addAutor("Hernandez");
		
		coleccion1.addDoc(d1);
		coleccion1.addDoc(d2);
		coleccion1.addDoc(d3);

		
		System.out.println(coleccion1.listarDoc(new BuscadorXTitulo("El Principito")));
		System.out.println(coleccion1.listarDoc(new BuscadorTituloContiene("o")));
		System.out.println(coleccion1.listarDoc(new BuscadorContienePalabraC("globalizacion")));
		System.out.println(coleccion1.listarDoc(new BuscadorNoTienePalabrasC()));
		System.out.println(coleccion1.listarDoc(new BuscadorXAutor("Hernandez")));
		System.out.println(coleccion1.listarDoc(new BuscadorPalabraEnContenido("una vez")));
		System.out.println("Todos los documentos cuyo contenido tenga al menos 20 palabras");
		System.out.println(coleccion1.listarDoc(new BuscadorAND(new BuscadorXTitulo("El Principito"), new BuscadorTituloContiene("i"))));
		System.out.println(coleccion1.listarDoc(new BuscadorOR(new BuscadorXTitulo("El Principito"), new BuscadorTituloContiene("i"))));
		System.out.println(coleccion1.listarDoc(new BuscadorNOT(new BuscadorContienePalabraC("suspenso"))));
		
		
		
		/*  a) Todos los documentos cuyo título sea exactamente igual a un título dado.
			b) Todos los documentos cuyo título contenga una palabra o frase dada.
			c) Todos los documentos que contengan una palabra clave dada.
			d) Todos los documentos que no contengan ninguna palabra clave.
			e) Todos los documentos de un autor determinado.
			f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
			g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
			h) Cualquier combinación lógica de las formas anteriores.   */
	}

}
