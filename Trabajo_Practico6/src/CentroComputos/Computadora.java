package CentroComputos;

public class Computadora implements ItemOrdenable{

    private boolean disponible;
    private String nombre;
    private double velocidad;


    public Computadora(double velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.disponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
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
