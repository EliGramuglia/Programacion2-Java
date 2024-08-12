package Aseguradora;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		SeguroIntegrado cooperacion = new SeguroIntegrado(1111);
		
		SeguroIntegrado integrado1 = new SeguroIntegrado(2222);
		SeguroIntegrado integrado2 = new SeguroIntegrado(3333);
		SeguroSimple automotor = new SeguroSimple(4444, "Auto todo riesgo", new CalculadorMontoFijo(16000), 7);
		SeguroSimple moto = new SeguroSimple(5555, "Moto terceros riesgo", new CalculadorMontoFijo(2500), 18);
		SeguroSimple vida = new SeguroSimple(5555, "Vida seguro de vida riesgo", new CalculadorPorcentajeMonto(1000000, 0.02), 31);
		SeguroSimple hogar = new SeguroSimple(5555, "Hogar incendios riesgo", new CalculadorMontoMasPorcentaje(50000, 0.05), 12); 
		SeguroSimple vida2 = new SeguroSimple(6666, "todo riesgo", new CalculadorPorcentajeMonto(1000000, 0.02), 3);
		SeguroSimple hogar2 = new SeguroSimple(7777, "tormentas", new CalculadorMontoMasPorcentaje(50000, 0.05), 4); 
		SeguroTemporal depto = new SeguroTemporal(8888, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 11, 2),
				new SeguroSimple(4567, "temporal riesgo", new CalculadorMontoFijo(30000), 9));
		
		cooperacion.addSeguro(integrado1);
		cooperacion.addSeguro(integrado2);
		
		integrado1.addSeguro(automotor);
		integrado1.addSeguro(moto);
		integrado1.addSeguro(hogar);
		integrado1.addSeguro(vida);
		integrado1.addSeguro(depto);
		
		integrado2.addSeguro(vida2);
		integrado2.addSeguro(hogar2);
		
		
		System.out.println("El monto del seguro es: "+cooperacion.getMonto());
		//si el padre es cooperacion no anda
		System.out.println("Poliza del seguro: "+ integrado1.getPoliza());
		
		/*Listar todos los seguros cuya descripción contenga la palabra “Automotor”,
		ordenados por dni del asegurado, y luego por número de póliza si un asegurado posee
		más de un seguro que coincida con la búsqueda*/


		System.out.println("\n "+ cooperacion.segurosQueCumplenOrdenados(new FiltroDescripcion("riesgo"),
				new ComparadorAnd(new ComparadorDni(), new ComparadorPoliza())));   //anda
		
		
		System.out.println("\n"+"Settear la forma de calcular el monto de la poliza: ");
		System.out.println(automotor.getMonto());
		automotor.setCalculador(new CalculadorMontoMasPorcentaje(16000, 0.05));
		System.out.println(automotor.getMonto());
		
	}	
}
