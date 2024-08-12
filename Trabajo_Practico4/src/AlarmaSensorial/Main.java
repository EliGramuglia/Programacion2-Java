package AlarmaSensorial;


public class Main {

	public static void main(String[] args) {
		AlarmaLuminosa a1 = new AlarmaLuminosa();
		
		Sensor s1 = new Sensor("living");
		
		Sensor s2 = new Sensor("baño");
		
		a1.addSensor(s1);
		a1.addSensor(s2);

		s2.setVidrioRoto(true);
		//s1.setMovimientoAdentro(true);
		//System.out.println(s1.isMovimientoAdentro());
		
		System.out.println("El sensor detecto una anomalia? " + s1.detectarAnomalia()+"\n");
		
		System.out.println("Alarma Luminosa comprueba si hay algo raro: " + a1.comprobar()+"\n");
		
		a1.activarAlarmaLuminosa();
		
		
		System.out.println(a1.getLuz().isLuz());
		System.out.println(a1.getTimbre().isSonido());
		
		a1.apagarAlarma();

		System.out.println(a1.getLuz().isLuz());
		System.out.println(a1.getTimbre().isSonido());	
		
	}

}
