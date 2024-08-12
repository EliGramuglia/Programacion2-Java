package AlarmaLuminosa;

public class Main {

	public static void main(String[] args) {
		AlarmaLuminosa a1 = new AlarmaLuminosa();
		
		
		a1.setMovimientoAdentro(true);
		
		a1.activarAlarmaLuminosa();
		
		System.out.println(a1.getLuz().isLuz());
		System.out.println(a1.getTimbre().isSonido());
		
		//System.out.println(a1.toString());
		
	}

}
