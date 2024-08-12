package Avicola;
import java.time.LocalDate;

public class CongeladoAire extends CongeladoRefrigerado {
	private double nitrogeno;
	private double oxigeno;
	private double co2;
	private double agua; //vapor de agua
	
	
	
	public CongeladoAire(LocalDate vencimiento, int nroLote, LocalDate envasado, String granja,
			int codSupervision,double temperatura, double nitrogeno,double oxigeno, double co2,
			double agua) {
		super(vencimiento, nroLote, envasado, granja, codSupervision, temperatura);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.co2 = co2;
		this.agua = agua;
	}

	@Override 
	public String toString() {
		return super.toString()+"\n"+"Información de la composicion del producto: "+"\n"+
				"Porcentaje de nitrogeno: "+nitrogeno+"\n"+"Procentaje de oxigeno: "+oxigeno+
				"\n"+"Porcentaje de CO2: "+co2+"\n"+"Porcentaje de vapor de agua: "+agua;
	}
}
