package PortalDeNoticias;

import java.util.ArrayList;

public class Portal {
	private ArrayList<Suscriptor> suscriptores;

	public Portal() {
		this.suscriptores = new ArrayList<>();
	}
	
	public void addSuscriptor(Suscriptor nuevo) {  //Me obliga a redefinir el equals en Suscriptor
		if(!this.suscriptores.contains(nuevo)) {
			this.suscriptores.add(nuevo);
		}
	}
	
	public void repartirNoticia(Noticia noticia) {
		for(Suscriptor s: suscriptores) {
			s.addNoticia(noticia);
		}
	}
	
	
}
