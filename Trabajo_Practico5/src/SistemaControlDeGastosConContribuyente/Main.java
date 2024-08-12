package SistemaControlDeGastosConContribuyente;

public class Main {

	public static void main(String[] args) {
		Contribuyente c0 = new Contribuyente("Mario", 123, 20000);		
		Contribuyente c1 = new ContribuyenteComerciante("Kiosco Matias", 124, 20000, 1000000);
		Contribuyente c2 = new ContribuyenteProgramador("Lataro G", 125, 20000, 2000000);
		Contribuyente c3 = new Contribuyente("Pepe", 127, 15000);		
		Contribuyente c4 = new ContribuyenteComerciante("Panaderia", 126, 20000, 2000000);
		Contribuyente c5 = new ContribuyenteProgramador("Ariel", 128, 20000, 8000000);
		
		Ciudad tandil = new Ciudad("Tandil", 140000, 6000);
		Ciudad necochea = new Ciudad("Necochea", 135000, 5000);
		Ciudad azul = new Ciudad("Azul", 120000, 300000);
	
		tandil.addContribuyente(c0);
		tandil.addContribuyente(c2);
		necochea.addContribuyente(c3);
		necochea.addContribuyente(c1);
		azul.addContribuyente(c4);
		azul.addContribuyente(c5);
		
		Provincia bsAs = new Provincia("Buenos Aires");
		
		bsAs.addCiudad(tandil);
		bsAs.addCiudad(azul);
		bsAs.addCiudad(necochea);
		
		Pais argentina = new Pais("Argentina");

		argentina.addCiudad(tandil);
		argentina.addCiudad(azul);
		argentina.addCiudad(necochea);
		
		argentina.addPcia(bsAs);
		
		System.out.println("Lista de ciudades con deficit: "+argentina.ciudadesConDeficit());
		System.out.println("Provincias con deficit: "+argentina.pciasConDeficit());
		System.out.println(tandil + " tiene deficit? "+tandil.deficit());
		System.out.println(azul + " tiene deficit? "+azul.deficit());
		}

}
