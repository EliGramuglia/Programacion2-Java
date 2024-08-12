package SistemaElectoral;

import java.util.ArrayList;

public class Localidad extends ElementoElectoral {
	private ArrayList<ElementoElectoral> elementos;
	
	public Localidad() {
		this.elementos = new ArrayList<>();
	}
	
	
	public void addElemento(ElementoElectoral e) {
		if(e.getPadre() != null) {
			e.getPadre().eliminarPadre(e);
		}
		this.elementos.add(e);
		e.setPadre(this);
	}

	private void eliminarPadre(ElementoElectoral e) {
		this.elementos.remove(e);
	}

	
	

	@Override
	public int getCantidadVotos() {
		int aux = 0;
		for(int i = 0; i< this.elementos.size(); i++) {
			aux += this.elementos.get(i).getCantidadVotos();
		}
		return aux;
	}


	@Override
	public double cantVotos(Filtro filtro) {
		double votos = 0;
		for(int i= 0; i<this.elementos.size(); i++) {
			votos += this.elementos.get(i).cantVotos(filtro);	
		}
		return votos;
	}


	
	
	

}
