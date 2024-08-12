package Avicola;
import java.time.LocalDate;

public class CongeladoRefrigerado extends Producto {
	private int codSupervision;
	private double temperatura; //temperatura de mantenimiento recomendada
	

	public CongeladoRefrigerado(LocalDate vencimiento, int nroLote, LocalDate envasado, String granja,
			 int codSupervision,double temperatura) {
		super(vencimiento, nroLote, envasado, granja);
		this.codSupervision = codSupervision;
		this.temperatura = temperatura;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+"Código de supervisión: "+codSupervision+
				"\n"+"Temperatura de mantenimiento recomendada: "+temperatura;
	}

}
