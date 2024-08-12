package CooperativaAgricultores;

public class Main {

	public static void main(String[] args) {
		Cereal trigo = new Cereal("trigo");
		Cereal pasto = new Pastura("pasto");
		
		trigo.addMineral("hierro");
		trigo.addMineral("potasio");
		trigo.addMineral("magnesio");
		pasto.addMineral("hierro");
		pasto.addMineral("potasio");
		pasto.addMineral("magnesio");

		
		Lote lote1 = new Lote(70,"lote1");
		
		lote1.addMineral("hierro");
		lote1.addMineral("potasio");
		lote1.addMineral("magnesio");
		
		//Cooperativa campo = new Cooperativa();
		
		
		
		System.out.println(trigo.sePuedeSembrar(lote1));
		System.out.println(lote1.sePuedeSembrar(trigo));
		System.out.println(pasto.sePuedeSembrar(lote1));
	}

}
