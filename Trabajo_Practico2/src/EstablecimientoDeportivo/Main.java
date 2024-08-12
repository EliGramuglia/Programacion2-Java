package EstablecimientoDeportivo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> futbol3 = new ArrayList<>();
		
		Usuario ema = new Usuario("Emanuel");
		Usuario lau = new Usuario("Laucha Cabj");
		Usuario santi = new Usuario("Santi");
		
		Cancha futbol = new Cancha("Futbol");

		Turno t1 = new Turno(futbol3,futbol, LocalDate.of(23,8,2023),1);
	}

}
