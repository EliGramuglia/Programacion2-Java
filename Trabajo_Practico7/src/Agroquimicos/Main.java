package Agroquimicos;

public class Main {

	public static void main(String[] args) {
		//Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
		Sistema bayer = new Sistema();
		
		Agroquimico a1 = new Agroquimico("Herbicida");
		Agroquimico a2 = new Agroquimico("Insecticida");
		Cultivo c1 = new Cultivo("Soja");
		Cultivo c2 = new Cultivo("Trigo");
		Cultivo c3 = new Cultivo("Algodon");
		Enfermedad e1 = new Enfermedad("enfermedad1");
		Enfermedad e2 = new Enfermedad("enfermedad2");
		
		//patologias de las enfermedades
		e1.addPatologia("Hojas secas");
		e2.addPatologia("Caida de frutos");
		
		//enfermedades que afectan frecuentemente a los cultivos
		c1.addEnfermedad(e1);
		c1.addEnfermedad(e2);
		c2.addEnfermedad(e1);
		c3.addEnfermedad(e2);
		
		//patologias que trata el agroquimico
		a1.addPatologia("Hojas secas");
		a1.addPatologia("Caida de frutos");
		a2.addPatologia("Hojas secas");
		//cultivos en los que no se puede usar
		a1.addCultivoProhibido(c3);
		
		bayer.addAgroquimico(a1);
		bayer.addAgroquimico(a2);

		Filtro f1 = new CondicionEnfermedad(e1);
		Filtro f2 = new CondicionEnfermedad(e2);
		System.out.println("Agroquímicos que puedan tratar una enfermedad:");
		
		
		
		System.out.println("Enfermedad 1: "+bayer.agroquimicosQueTratanCon(f1));
		System.out.println("Enfermedad 2: "+bayer.agroquimicosQueTratanCon(f2));
		
		//System.out.println(e1.sePuedeTratarCon(a1));    ANDA
		
		//System.out.println(a1.trataPatologia("Hojas secas"));     ANDA
		
		//System.out.println(a1.contieneProhibido(c3));    ANDA
		
		
		//Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los pueden tratar.
		Filtro f3 = new CondicionAND(new CondicionEnfermedad(e1), new CondicionCultivo(c1));
		
		System.out.println(e1 + " y " + c1 + ": " + bayer.agroquimicosQueTratanCon(f3));
		
	}

}
