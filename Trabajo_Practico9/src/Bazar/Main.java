package Bazar;

public class Main {

	public static void main(String[] args) {
		Combo c1 = new Combo(5, 50.0, new FiltroCategoria("Bazar"));
		Producto taza = new Producto(7.5, 5.0);
		Producto jarron = new Producto(18.9, 10.0);
		Producto vaso = new Producto(2.5, 5.0);
		Combo c2 = new Combo(0.2, 20, new FiltroPeso(0.5));
		Producto picoDeco = new Producto(3.85, 1.0);
		Producto picoEstrella = new Producto(4.5, 1.0);
		
		taza.addCategoria("Bazar");
		taza.addCategoria("Regaleria");
		jarron.addCategoria("Decoracion");
		jarron.addCategoria("Bazar");
		vaso.addCategoria("Bazar");
		picoDeco.addCategoria("Decoracion");
		picoEstrella.addCategoria("Bazar");
		
		c1.addElem(taza);
		c1.addElem(jarron);
		c1.addElem(vaso);
		c2.addElem(picoDeco);
		c2.addElem(picoEstrella);
		c1.addElem(c2);
		
		System.out.println(c1.getPrecio());       //funciona
		System.out.println(c1.getPeso());         //funciona
		System.out.println(c1.getCategorias());   //funciona
		System.out.println(c2.getCantidad());     //funciona
		System.out.println(c1.getProductoMenorPeso());    //funciona 
		System.out.println(c1.elementosQueCumplen(new FiltroPeso(2.0)));
	}

}
