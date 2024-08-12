package recuperatorio2017CableCoaxil;

import java.util.Vector;

public class ISO314 extends Estandar{
	public ISO314(double porcentaje){
		super(porcentaje);
	}
	public double getVelocidad(Vector<Cable> cs){
		double velocidad = Double.MAX_VALUE;
		for(int i = 0 ; i<cs.size() ; i++){
			double velActual = cs.elementAt(i).getVelocidad();
			if (velActual < velocidad)
				velocidad = velActual;
		}
		return velocidad;
	}
}
