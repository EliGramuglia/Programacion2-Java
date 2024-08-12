package CentroComputos;

public class CentroComputos {
    private ColaEspera computadoras;
    private ColaEspera procesos;

    public CentroComputos() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void addProceso(Proceso proceso) {
        this.procesos.addItem(proceso);
    }

    public void addComputadora(Computadora computadora) {
        this.computadoras.addItem(computadora);
    }

    public ItemOrdenable ejecutarProceso() {
        return this.procesos.remove();
    }
}
