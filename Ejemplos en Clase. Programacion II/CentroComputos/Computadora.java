package CentroComputos;

public class Computadora extends Dispositivo implements ItemOrdenable{
	private boolean disponible;

    public Computadora(String nombre, double velocidad) {
		super(nombre, velocidad);
        this.disponible = true;
	}

    

    public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}





	public boolean esMayor(ItemOrdenable computadora) {
        try {
            Computadora comp = (Computadora) computadora;
            return this.getVelocidad() > comp.getVelocidad();
        }catch (Exception e) {
            return false;
        }
    }

    public boolean equals(Object o) {
        try {
            Computadora otra = (Computadora) o;
            return this.getNombre().equals(otra.getNombre());
        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Computadora: " + this.getNombre();
    }
}
