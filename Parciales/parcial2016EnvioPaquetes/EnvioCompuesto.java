package parcial2016EnvioPaquetes;

import java.util.Vector;

public class EnvioCompuesto implements Envio {
	Vector<Envio> combo = new Vector<Envio>();
	Criterio criterio;
	int descuento;

	public EnvioCompuesto(Criterio c, int descuento) {
		this.criterio = c;
		this.descuento = descuento;
	}

	public void addEnvio(Envio e) {
		Vector<EnvioSimple> cumplen = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		cumplen = e.getEnvios(verdadero);
		boolean cumple = true;
		for (int i = 0; i < cumplen.size() && cumple; i++) {
			if (!criterio.cumple(cumplen.elementAt(i)))
				cumple = false;
		}
		if (cumple) {
			int id = combo.elementAt(0).getIdTracking();
			for (int i = 0; i < cumplen.size(); i++) {
				cumplen.elementAt(i).setIdTracking(id);
			}
			combo.add(e);
		}
	}

	public Vector<EnvioSimple> getEnvios(Criterio c) {
		Vector<EnvioSimple> out = new Vector<EnvioSimple>();
		for (int i = 0; i < combo.size(); i++)
			out.addAll(combo.elementAt(i).getEnvios(c));
		return out;
	}

/*	public Vector<EnvioSimple> getEnvios() {
		Vector<EnvioSimple> out = new Vector<EnvioSimple>();
		for (int i = 0; i < combo.size(); i++)
			out.addAll(combo.elementAt(i).getEnvios());
		return out;
	}*/

	public double getCosto() {
		double suma = 0;
		for (int i = 0; i < combo.size(); i++) {
			suma += combo.elementAt(i).getCosto();
		}
		return suma - suma * descuento;
	}
			/*-----------------------------------------------------------*/
	/* G E T S / P E D I A		D E V O L V E R		E L		P R I M E R O/ G E T S */ 
	
	public int getIdTracking() {	
		Vector<EnvioSimple> elms = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		elms = combo.elementAt(0).getEnvios(verdadero);
		return elms.elementAt(0).getIdTracking();
	}
	
	public String getDestinatario() {
		Vector<EnvioSimple> elms = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		elms = combo.elementAt(0).getEnvios(verdadero);
		return elms.elementAt(0).getDestinatario();
	}

	public String getRemitente() {
		Vector<EnvioSimple> elms = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		elms = combo.elementAt(0).getEnvios(verdadero);
		return elms.elementAt(0).getRemitente();
	}

	public String getDirDestino() {
		Vector<EnvioSimple> elms = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		elms = combo.elementAt(0).getEnvios(verdadero);
		return elms.elementAt(0).getDirDestino();
	}

	public String getDirOrigen() {
		Vector<EnvioSimple> elms = new Vector<EnvioSimple>();
		Criterio verdadero = new CTrue();
		elms = combo.elementAt(0).getEnvios(verdadero);
		return elms.elementAt(0).getDirOrigen();
	}
		
			/*-----------------------------------------------------------*/
	/* G E T S / P E D I A		D E V O L V E R		E L		P R I M E R O/ G E T S */ 	

	public double getPeso() {
		double suma = 0;
		for (int i = 0; i < combo.size(); i++) {
			suma += combo.elementAt(i).getPeso();
		}
		return suma;
	}

	public Envio getCopia(Criterio c) {
		Vector<Envio> out = new Vector<Envio>();
		for (int i = 0 ; i<combo.size();i++) {
			Envio envc = combo.elementAt(i).getCopia(c);
			if (envc != null)
				out.add(envc);
		}
		if (out.size() == 0 )
			return null;
		else {
			EnvioCompuesto ec = new EnvioCompuesto(this.criterio,this.descuento);
			for (int i = 0 ; i<out.size();i++) {
				ec.addEnvio(out.elementAt(i));
			}
		return ec;
 		}
	}

	
}