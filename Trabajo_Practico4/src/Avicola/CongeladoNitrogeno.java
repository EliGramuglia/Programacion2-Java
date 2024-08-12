package Avicola;
import java.time.LocalDate;

public class CongeladoNitrogeno extends CongeladoRefrigerado {
	private String metodo;
	private double segundos;
	

	public CongeladoNitrogeno(LocalDate vencimiento, int nroLote, LocalDate envasado, String granja, int codSupervision,
			double temperatura, String metodo, double segundos) {
		super(vencimiento, nroLote, envasado, granja, codSupervision, temperatura);
		this.metodo = metodo;
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"Métodos empleado para su elaboración:"+metodo+
				"\n"+"Segundos expuesto al nitrogeno: "+segundos;
	}
}
