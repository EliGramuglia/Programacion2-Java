package parcial2016EnvioPaquetes;

import java.util.Vector;

public interface Envio {

	public int getIdTracking();

	public String getDestinatario();

	public String getRemitente();

	public String getDirOrigen();

	public String getDirDestino();

	public double getCosto();

	public Vector<EnvioSimple> getEnvios(Criterio c);

	//public Vector<EnvioSimple> getEnvios();

	public double getPeso();
	
	public Envio getCopia(Criterio c);
}
