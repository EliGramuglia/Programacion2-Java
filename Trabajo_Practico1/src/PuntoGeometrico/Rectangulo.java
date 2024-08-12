package PuntoGeometrico;

public class Rectangulo {

	private PuntoGeometrico p1;
	private PuntoGeometrico p2;
	private PuntoGeometrico p3;
	private PuntoGeometrico p4;

	public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2, PuntoGeometrico p3, PuntoGeometrico p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	
	public void desplazarRectangulo(int cantX, int cantY) {
		this.p1.desplazarXY(cantX, cantY);
		this.p2.desplazarXY(cantX, cantY);
		this.p3.desplazarXY(cantX, cantY);
		this.p4.desplazarXY(cantX, cantY);
	}
	
	
	/*public int getAltura() {
		if(this.p1.getX() == this.p2.getX()) {
			Math.abs(this.p1.getY() - this.p2.getY());
		}else if(this.p1.getX() == this.p3.getX()) {
			return Math.abs(this.p1.getY()- this.p3.getY());
		} else if(this.p1.getX() == this.p4.getX()) {
			return Math.abs(this.p1.getY()- this.p4.getY());
		} else{
				return -1;
			}
	}		
	
	

	public int getBase() {
		if (this.p1.getY() == this.p2.getY()) {
			return this.p2.getY();
		} else {
			if (this.p1.getY() == this.p3.getY()) {
				return this.p3.getY();
			} else {
				if (this.p1.getY() == this.p4.getY()) {
					return this.p4.getY();
				}

			}
		}
	}*/

	public PuntoGeometrico getP1() {
		return p1;
	}

	public void setP1(PuntoGeometrico p1) {
		this.p1 = p1;
	}

	public PuntoGeometrico getP2() {
		return p2;
	}

	public void setP2(PuntoGeometrico p2) {
		this.p2 = p2;
	}

	public PuntoGeometrico getP3() {
		return p3;
	}

	public void setP3(PuntoGeometrico p3) {
		this.p3 = p3;
	}

	public PuntoGeometrico getP4() {
		return p4;
	}

	public void setP4(PuntoGeometrico p4) {
		this.p4 = p4;
	}
	
	
}
