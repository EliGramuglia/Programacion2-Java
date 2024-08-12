package SistemaElectoral;

import java.util.Comparator;

public class ComparadorCandidato implements Comparator<Candidato> {

	@Override
	public int compare(Candidato o1, Candidato o2) {
        int partido = o1.getPartido().compareTo(o2.getPartido());
        int agrupacion = o1.getAgrupacion().compareTo(o2.getAgrupacion()); 
        int nombre = o1.getNombre().compareTo(o2.getNombre());
        
        if(partido != 0) {
        	return partido;
        } else if(agrupacion != 0) {
        	return agrupacion;
        } else {
        	return nombre;
        }
    
	}

}
