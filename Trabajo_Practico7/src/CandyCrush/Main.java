package CandyCrush;

public class Main {

	public static void main(String[] args) {
		Tablero tablero1 = new Tablero(50);
		
		Ficha chocolate = new Ficha("chocolate", 1, 1, 0);
		Ficha piedra = new Ficha("piedra", 6, 1, 0);
		Ficha caramelo = new Ficha("caramelo", 1, 1, 10);
		Ficha torta = new Ficha("torta", 4, 8, 4);
		Ficha chupetin = new FichaEspecial("chupetin", 8, 2);
		
		tablero1.addFicha(chocolate);
		tablero1.addFicha(piedra);
		tablero1.addFicha(caramelo);
		tablero1.addFicha(torta);
		tablero1.addFicha(chupetin);
		
		System.out.println(tablero1.listarFichas(new FiltroDestruccion()));
		System.out.println(tablero1.listarFichas(new FiltroTamanio()));
		System.out.println(tablero1.listarFichas(new FiltroFortaleza()));
		
		
		System.out.println(tablero1.listarFichas(new FiltroAnd(new FiltroDestruccion(), new FiltroTamanio())));
		System.out.println(tablero1.listarFichas(new FiltroOr(new FiltroDestruccion(), new FiltroFortaleza())));
		System.out.println(tablero1.listarFichas(new FiltroNot(new FiltroTamanio())));

	}

}
