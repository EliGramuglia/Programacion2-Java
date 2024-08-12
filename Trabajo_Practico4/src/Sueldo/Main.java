package Sueldo;

public class Main {

	public static void main(String[] args) {
		EmpleadoHsExtras ema = new EmpleadoHsExtras("Emanuel", 7);
		
		Empleado lau = new Empleado("Lautaro");
		
		EmpleadoComision santi = new EmpleadoComision("Santiago", 520000);
		
		ema.setSueldoFijo(40000);
		
		System.out.println("SALARIOS SEMANALES:");
		
		System.out.println("El sueldo de "+ema.getNombre()+" es: "+ema.sueldoEmpleadoHsExtras());
		
		System.out.println("El sueldo de "+lau.getNombre()+ " es: "+lau.getSueldoFijo());
		
		System.out.println("El sueldo de "+santi.getNombre()+" es: "+santi.sueldoEmpleadoComision());

	}

}
