package SistemaControlDeGastosConContribuyente;

import java.util.ArrayList;

public class Ciudad {

	private String nombre;
	private int cantHabitantes;
	private ArrayList<Contribuyente> contribuyentes;
	private double gastos;

	
	public Ciudad(String nombre, int cantHabitantes, double gastos) {
		this.nombre = nombre;
		this.cantHabitantes = cantHabitantes;
		this.gastos = gastos;
		this.contribuyentes = new ArrayList<>();
	}

	public void addContribuyente(Contribuyente contribuyente) {
		if(!this.contribuyentes.contains(contribuyente)) {
			this.contribuyentes.add(contribuyente);
		}
	}
	
	public boolean deficit() {
		double recaudacion = 0;
		for(int i = 0; i<contribuyentes.size();i++) {
			recaudacion += this.contribuyentes.get(i).montoAbonar();
		}
		if (recaudacion > this.gastos) {
			return false;
		} else {
			return true;
		}
	}


	@Override
	public String toString() {
		return this.getNombre();
	}
	

	public String getNombre() {
		return nombre;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

}
