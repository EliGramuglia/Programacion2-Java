package FacturacionDeEmpleados;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado>empleados;

	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public void addEmpleado(Empleado empleado) {
		if(!this.empleados.contains(empleado)) {
			this.empleados.add(empleado);
		}
	}
	
	public double gastoEnSueldos() {
		double contador = 0;
		for(int i = 0; i<empleados.size(); i++) {
			contador += empleados.get(i).getSueldo();
		}
		return contador;
	}
}
