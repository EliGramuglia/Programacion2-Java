package RegistroEmpresa;
import java.util.ArrayList;

public class Jerarquico extends Empleado {
	private ArrayList<Empleado>empleados;
	
	public Jerarquico(String nombre, String apellido, int edad, int legajo, double sueldo) {
		super(nombre, apellido, edad, legajo, sueldo);
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	@Override
	public String obtenerDatos() {
		String empleadosACargo = " ";
		
		for(int i = 0; i < this.empleados.size(); i++) {
			empleadosACargo += this.empleados.get(i).obtenerDatos();
		}
		
		return "CARGO: jerárquico \n"+super.obtenerDatos()+"\n"+empleadosACargo;	
	}
}