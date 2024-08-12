package FacturacionDeEmpleados;

public class Main {

	public static void main(String[] args) {
		Empresa prune = new Empresa();
		
		Empleado e1 = new Empleado("Carlitos", "Tevez", 11111,50000);
		Empleado e2 = new EmpleadoComision("Emanuel", "Glavan", 15551,50000,100000,0.02);
		EmpleadoBono e3 = new EmpleadoBono("Marta", "Lalala", 11155, 50000, 20, 3000, 50);
	
		prune.addEmpleado(e1);
		prune.addEmpleado(e2);
		prune.addEmpleado(e3);
		
		System.out.println(prune.gastoEnSueldos());
		System.out.println(e3.alcanzoObjetivo());

	}

}
