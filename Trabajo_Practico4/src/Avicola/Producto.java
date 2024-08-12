package Avicola;
import java.time.LocalDate;

public class Producto {
	private LocalDate vencimiento;
	private int nroLote;
	private LocalDate envasado;
	private String granja;
	
	
	public Producto(LocalDate vencimiento, int nroLote, LocalDate envasado, String granja) {
		this.vencimiento = vencimiento;
		this.nroLote = nroLote;
		this.envasado = envasado;
		this.granja = granja;
	}
		
	
	
	//Obtener la etiqueta de un producto
	@Override
	public String toString() {
		return "Fecha de vencimiento: "+vencimiento+"\n"+"Fecha de envasado: "+envasado+
				"\n"+"Nro de lote: "+nroLote+"\nGranja donde se elaboro: "+granja;
	}
	

	
}
