package Vivero;

import java.util.ArrayList;

public class Vivero {
	private ArrayList<Planta> plantas;
	
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta planta) {
		this.plantas.add(planta);
	}
	
	public ArrayList<Planta> listarPlantas(Buscador buscador){
		ArrayList<Planta> aux = new ArrayList<>();
		
		for(int i = 0; i < this.plantas.size(); i++) {
			if(buscador.cumple(this.plantas.get(i))) {
				aux.add(this.plantas.get(i));
			}
		}
		return aux;
	}
}
