package Avicola;
import java.time.LocalDate;

public class CongeladoAgua extends CongeladoRefrigerado {
	private double salinidad; //gramos de sal * litro de agua
	
	
	public CongeladoAgua(LocalDate vencimiento, int nroLote, LocalDate envasado, String granja, int codSupervision,
			double temperatura, double sal) {
		super(vencimiento, nroLote, envasado, granja, codSupervision, temperatura);
		this.salinidad = sal;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+"Cantidad de sal por litros de agua(salinidad): "+salinidad;
	}

}
