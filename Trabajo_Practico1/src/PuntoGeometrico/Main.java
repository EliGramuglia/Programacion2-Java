package PuntoGeometrico;

public class Main {

	public static void main(String[] args) {
		PuntoGeometrico p1 = new PuntoGeometrico(2, 2);
		
		PuntoGeometrico p2 = new PuntoGeometrico(3, 3);
		
		PuntoGeometrico p3 = new PuntoGeometrico(2, 2);
		
		PuntoGeometrico p4 = new PuntoGeometrico(3, 3);
		
		Rectangulo rec  = new Rectangulo(p1, p2, p3, p4);
		
		
		
		rec.desplazarRectangulo(1,1);
	
		
		
		//System.out.println(p1.distanciaEuclidea(p2));
	}

}
