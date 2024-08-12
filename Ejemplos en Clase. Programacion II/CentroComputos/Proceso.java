package CentroComputos;

public class Proceso implements ItemOrdenable{
    private double reqMemoria;
    private String nombre;

    public Proceso(double reqMemoria, String nombre) {
        this.reqMemoria = reqMemoria;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getReqMemoria() {
        return reqMemoria;
    }

    public void setReqMemoria(double reqMemoria) {
        this.reqMemoria = reqMemoria;
    }

    public boolean equals(Object o) {
        try {
            Proceso otro = (Proceso) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            System.out.println("error");
            return false;
        }
    }

    @Override
    public boolean esMayor(ItemOrdenable proceso) {
        try {
            Proceso proc = (Proceso) proceso;
            return this.getReqMemoria() > proc.getReqMemoria();
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Proceso: " + this.getNombre() ;
    }
}
