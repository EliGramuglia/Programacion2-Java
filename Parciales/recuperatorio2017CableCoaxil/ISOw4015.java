package recuperatorio2017CableCoaxil;

import java.util.Vector;

public class ISOw4015 extends Estandar{
	public ISOw4015(double porcentaje){
		super(porcentaje);
	}
	public double getVelocidad(Vector<Cable> cs){
		double velocidad = 0;
		for(int i = 0 ; i<cs.size();i++){
			velocidad+= cs.elementAt(i).getVelocidad();
		}
		return velocidad/cs.size();
	}
}