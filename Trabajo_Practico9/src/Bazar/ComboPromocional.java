package Bazar;

public class ComboPromocional extends Combo {

	public ComboPromocional(double descuento, double descuentoMax, Filtro f) {
		super(descuento, descuentoMax, f);
	}

	//podria haber hecho el ArrayList protected y luego volverlo a recorrer (pero repito codigo)
	
	@Override
	public double getPrecio() {
		double precioTotal = this.precioSinDescuento();
		double cantidadProductos = this.getCantidad();
		
		return precioTotal / cantidadProductos;
	}
	
	//falta el getCopia()
}
