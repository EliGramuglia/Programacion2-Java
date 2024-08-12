package recuperatorio2017CableCoaxil;

import java.util.Vector;

public class CableCompuesto implements Cable{
	private Vector<Cable> conglomerado = new Vector<Cable>();
	Estandar estandar;
	static final int MAXIMO = 4; 
	public CableCompuesto(Vector<Cable> conglomerado, Estandar e){
		this.conglomerado = conglomerado;
		estandar = e;
	}
	public void setEstandar(Estandar e){
		this.estandar = e;
	}
	public double getLongitud(){
		double longitud = 0;
		for (int i = 0 ; i<conglomerado.size();i++)
			longitud+= conglomerado.elementAt(i).getLongitud();
		return longitud;
	}
	public double getCosto(){
		double suma = 0;
		for (int i = 0; i<conglomerado.size(); i++)
			suma += conglomerado.elementAt(i).getCosto();
		return suma + (suma * estandar.getCostoAdicional());
	}
	public double getLongitudMax(){
		double longitud = 0;
		for (int i = 0 ; i<conglomerado.size();i++)
			longitud+= conglomerado.elementAt(i).getLongitudMax();
		return longitud;
	}
	public boolean cumpleCriterio(Criterio c){
		if (!c.cumple(this))
			return false;
		int suma = 0;
		for (int i=0 ; i<conglomerado.size() && suma < MAXIMO; i++){
			if (!conglomerado.elementAt(i).cumpleCriterio(c))
				suma++;
		}
		return suma < MAXIMO;
	}
	public double getVelocidad(){ // Bien
		return estandar.getVelocidad(new Vector<Cable>(conglomerado));
	}	
}