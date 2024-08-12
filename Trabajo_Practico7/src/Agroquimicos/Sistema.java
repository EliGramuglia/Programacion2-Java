package Agroquimicos;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Agroquimico> agroquimicos;

	public Sistema() {
		this.agroquimicos = new ArrayList<>();
	}
	
	public void addAgroquimico(Agroquimico agro) {
		this.agroquimicos.add(agro);
	}
	
	public ArrayList<Agroquimico> agroquimicosQueTratanCon(Filtro filtro){
		ArrayList<Agroquimico> aux = new ArrayList<>();
		
		for(int i=0; i < agroquimicos.size(); i++) {
			if(filtro.cumple(this.agroquimicos.get(i))) {
				aux.add(this.agroquimicos.get(i));
			}
		}
		return aux;
	}
	

	//	ABSTRAER PARA NO REPETIR CODIGO
	/*public ArrayList<Agroquimico> AgroquimicosQueTratanCon(Enfermedad enfermedad){
		ArrayList<Agroquimico> aux = new ArrayList<>();
		
		for(int i=0; i < agroquimicos.size(); i++) {
			if(enfermedad.sePuedeTratarCon(this.agroquimicos.get(i))) {
				this.agroquimicos.add(this.agroquimicos.get(i));
			}
		}
		return aux;
	}
	
	public ArrayList<Agroquimico> AgroquimicosQueTratanCon(Enfermedad enfermedad, Cultivo cultivo){
		ArrayList<Agroquimico> aux = new ArrayList<>();
		
		for(int i=0; i < agroquimicos.size(); i++) {
			if(enfermedad.sePuedeTratarCon(this.agroquimicos.get(i))) {
				if(cultivo.sePuedeTratarCon(this.agroquimicos.get(i)))
				this.agroquimicos.add(this.agroquimicos.get(i));
			}
		}
		return aux;
	}*/
	
}
