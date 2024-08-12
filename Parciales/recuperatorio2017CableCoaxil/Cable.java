package recuperatorio2017CableCoaxil;

public interface Cable{
	public double getLongitud();
	public double getCosto();
	public double getLongitudMax();
	public double getVelocidad();
	public boolean cumpleCriterio(Criterio c);
}