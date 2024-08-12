package SistemaElectoral;

import java.util.ArrayList;

public class Mesa extends ElementoElectoral {
	private ArrayList<Persona> padron;
	private ArrayList<Voto> votos;
	
	public Mesa() {
		this.padron = new ArrayList<>();
		this.votos = new ArrayList<>();
	}
	
	public void addPersona(Persona p) {
		if(!this.padron.contains(p)) {
			this.padron.add(p);
		}
	}
	
	public void registrarVoto(Voto voto, Persona p) {
		if(this.padron.contains(p) && p.yaVoto() == false) {
			this.votos.add(voto);
			p.setYaVoto(true);
		}
	}
	
	
	@Override
	public int getCantidadVotos() {
		return this.votos.size();
	}
	
	@Override
	public double cantVotos(Filtro filtro) {
		double votos = 0;
		for(int i= 0; i<this.votos.size(); i++) {
			if(filtro.cumple(this.votos.get(i))) {
				votos += 1;
			}
		}
		return votos;
	}
	

	
	
	
}
