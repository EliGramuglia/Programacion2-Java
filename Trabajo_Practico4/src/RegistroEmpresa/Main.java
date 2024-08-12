package RegistroEmpresa;

public class Main {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan","Perez", 25, 448899, 200000);
		Usuario usuario1 = new Usuario("Emanuel","Rolando",28, "Semilla", "lalalala");
		Jerarquico jefe = new Jerarquico("Carlos", "Gardel",54,50000,700000);
		
		System.out.println(empleado1.obtenerDatos());
		System.out.println(usuario1.obtenerDatos());
		//System.out.println(jefe.obtenerDatos());

		Empleado subordinado1 = new Empleado("Rosa","Perez", 32, 4488987, 150000);
		Empleado subordinado2 = new Empleado("Tomas","Lopez", 26, 3488987, 168000);
		
		
		jefe.addEmpleado(subordinado1);
		jefe.addEmpleado(subordinado2);
		
		System.out.println(jefe.obtenerDatos());

	}

}
