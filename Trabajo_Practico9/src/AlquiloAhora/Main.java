package AlquiloAhora;

public class Main {

	public static void main(String[] args) {
	
		Combo empresa = new Combo(0000);
		ElementoSimple moladora = new ElementoSimple(3, 18000, 7, "moladora", new CalculadorPorcentaje(20));
		ElementoSimple escritorio = new ElementoSimple(5, 150000, 3, "escritorio", new CalculadorMontoFijo(8000));
		ElementoSimple silla = new ElementoSimple(4, 5000, 5, "sillao", new CalculadorPorcentaje(20));
		ElementoSimple estanteria = new ElementoSimple(5, 300000, 24, "estanteriao", new CalculadorPorcentajeMonto(30,20000));
		ElementoSimple depto = new ElementoSimple(3, 90000000, 18, "depto", new CalculadorMontoFijo(86000));
		ElementoSimple casa = new ElementoSimple(6, 180000000, 11, "casao", new CalculadorPorcentajeMonto(2, 180000));
		Combo c1 = new Combo(1);
		Combo c2 = new Combo(2);
		ElementoObsoleto moladora2 = new ElementoObsoleto(9, 1500, 8, c2);
		
		empresa.addElemento(c1);
		//empresa.addElemento(c2);
		empresa.addElemento(casa);
		empresa.addElemento(moladora);
		empresa.addElemento(moladora2);
		//c1.addElemento(c2);
		c1.addElemento(escritorio);
		c1.addElemento(depto);
		c2.addElemento(silla);
		c2.addElemento(estanteria);
		
		System.out.println(moladora2.getValor()); //funcionando
		System.out.println(c1.getAntiguedad()); //funcionando
		
		System.out.println(empresa.elemQueCumplenOrdenados(new FiltroDescripcion("o"),
				new ComparadorAND(new ComparadorIdentificacion(), new ComparadorAntiguedad()))); //funciona
		
		System.out.println(c2.getCostoAlquiler());   //funciona
		silla.setCalculador(new CalculadorPorcentaje(12));
		System.out.println(silla.getCostoAlquiler());
		System.out.println(c2.getCostoAlquiler());
		
		
	}

}
