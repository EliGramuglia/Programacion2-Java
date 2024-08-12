package SitioWeb;

public class Main {

	public static void main(String[] args) {
		Categoria generales = new Categoria("a", "Generales");
		
		Categoria espectaculos = new Categoria("a", "Espectaculos");
		Categoria deportes = new Categoria("a", "Deportes");

		
		generales.addElemento(espectaculos);
		generales.addElemento(deportes);
		
		Noticia link1 = new Noticia("El chavo", "b", "b", "Pepe", "Link1");
		Noticia link2 = new Noticia("La manchi", "b", "b", "Pepe", "Link2");
		Noticia link3 = new Noticia("Hola", "b", "b", "Pepe", "Link3");
		
		link1.addPalabra("casa");
		link2.addPalabra("perro");
		link3.addPalabra("casa");
		
		espectaculos.addElemento(link1);
		espectaculos.addElemento(link2);
		deportes.addElemento(link3);
		
		System.out.println(generales.getPath()); //anda mal :C
		
		System.out.println(espectaculos.getCopia(new FiltroPalabraClave("casa")));
		System.out.println(espectaculos.listar());

	}

}
