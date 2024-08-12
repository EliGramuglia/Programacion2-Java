package Electrodomesticos;

public class Electrodomestico {

	 private String nombre;
	 private double precioBase;
	 private String color;
	 private int consumoEnergetico;
	 private double peso;
	 
	 
	 public Electrodomestico() {
		 this.color = "Gris Plata";
		 this.consumoEnergetico = 10;
		 this.precioBase = 100;
		 this.peso = 2;
	 }
	 
	 
	 public boolean esBajoConsumo() {
		 if(this.consumoEnergetico > 45) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 public double calcularBalance() {
		 return precioBase/peso;
	 }
	 
	 public boolean esAltaGama() {
		 if(this.calcularBalance() > 3) {
			 return true;
		 } else {
			  return false;
		 }
	 }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	 
	 
}
