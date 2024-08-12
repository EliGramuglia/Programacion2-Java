package SistemaControlDeGastos;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Ciudad>buenosAires = new ArrayList<>();
		ArrayList<Ciudad>lapampa = new ArrayList<>();
		
		ArrayList<Provincia>arg = new ArrayList<>();
		
		Ciudad tandil = new Ciudad("Tandil",130000,10,20,30,40,50,1000);
		
		Ciudad azul = new Ciudad("Azul", 80000,10,10,10,10,10,40);
		
		Ciudad mdq = new Ciudad("Mar del Plata",200000, 50,50,40,50,40,300);
		
		Ciudad olavarria = new Ciudad("Olavarria",140000,60,40,50,60,40,700);
		
		Ciudad santaRosa = new Ciudad("Santa Rosa",500000,60,60,50,50,50,1000);
		
		buenosAires.add(tandil);
		buenosAires.add(azul);
		buenosAires.add(mdq);
		buenosAires.add(olavarria);
		
		Provincia bsAs = new Provincia("Buenos Aires",buenosAires);
		
		Provincia laPampa = new Provincia("La Pampa",lapampa);
		lapampa.add(santaRosa);
		
		Pais argentina = new Pais("Argentina", arg);
		
		arg.add(bsAs);
		arg.add(laPampa);
		
		
		//lapampa.mostrarCiudadesDeficit();
		bsAs.mostrarCiudadesDeficit();
		System.out.println("Provincia con mas de la mitad de sus ciudades en condicion de deficit? "+bsAs.mitadConDeficit());
		
		argentina.obtenerCiudadesConDeficit();
		System.out.println("En Argentina, las pcias con deficit son: ");
		argentina.obtenerPciasConDeficit();
		}

}
