package PuntoGeometrico;

public class PuntoGeometrico {

	private int x;
	private int y;
	
	
	public PuntoGeometrico() {
		this.x = 0;
		this.y = 0;
	}
	
	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplazarXY(int cantidadX, int cantidadY) {
		this.x += cantidadX;
		this.y += cantidadY;
	}
	
	
	public double distanciaEuclidea(PuntoGeometrico p2) {
		double distancia = Math.pow((this.x - p2.x),2) + Math.pow((this.y- p2.y),2);
		
		return Math.pow(distancia, 2);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
