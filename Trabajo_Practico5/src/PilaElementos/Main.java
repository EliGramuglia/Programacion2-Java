package PilaElementos;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		/*Stack es una clase en Java que representa una estructura de datos de pila (stack),
		la cual sigue el principio de "último en entrar, primero en salir"*/
		
		Stack<Persona> pila = new Stack<>();
		
		Persona p1 = new Persona("Pepe", "Laalla");
		Persona p2 = new Persona("Lautaro", "Gramuglia");
		Persona p3 = new Persona("Santiago", "Gramuglia");
		
		
		pila.push(p1); //agrega uno al final
		pila.push(p2);
		pila.push(p3);
		
		
		System.out.println(pila.pop().getNombre()); //saca el ultimo elemento y me dice cual es
		
		System.out.println(pila.size()); //consultar el tamaño de la pila
		
		System.out.println(pila.peek().getNombre()); // consultar quien esta en la cima de la pila
		
		//System.out.println(pila.reverse().getNombre());
		
	}

}
