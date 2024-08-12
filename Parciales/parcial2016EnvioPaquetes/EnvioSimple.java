package parcial2016EnvioPaquetes;

import java.util.Vector;

public class EnvioSimple implements Envio {
	private String destinatario, remitente, dirOrigen, dirDestino;
	private boolean aDomicilio;
	private double peso, costo;
	private int idTracking;

	public EnvioSimple(int idTracking, String d, String r, String dO, String dD, double c, double p, boolean b) {
		destinatario = d;
		remitente = r;
		dO = dirOrigen;
		dD = dirDestino;
		costo = c;
		peso = p;
		aDomicilio = b;
		this.idTracking = idTracking;
	}

	public Vector<EnvioSimple> getEnvios(Criterio c) {
		Vector<EnvioSimple> out = new Vector<EnvioSimple>();
		if (c.cumple(this))
			out.add(this);
		return out;
	}

	public Vector<EnvioSimple> getEnvios() {
		Vector<EnvioSimple> out = new Vector<EnvioSimple>();
		out.add(this);
		return out;
	}

	public void setIdTracking(int id) {
		idTracking = id;
	}

	public double getCosto() {
		return this.costo;
	}

	public double getPeso() {
		return peso;
	}

	public int getIdTracking() {
		return idTracking;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getDestino() {
		return dirDestino;
	}

	public String getDirOrigen() {
		return dirOrigen;
	}

	public String getRemitente() {
		return remitente;
	}

	public boolean aDomicilio() {
		return aDomicilio;
	}

	public String getDirDestino() {
		return dirDestino;
	}
	
	public Envio getCopia(Criterio c) {
		if (c.cumple(this))
			return new EnvioSimple(idTracking, destinatario, remitente, dirOrigen, dirDestino, costo, peso, aDomicilio);
		return null;
	}
}
