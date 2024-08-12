package AgendaPersonal;
import java.util.ArrayList;

public class Reunion {
	//Atributos
	private ArrayList<Participante>participantes;
	private String lugar;
	private String tema;
	private double duracion;
	
	//Constructor
	public Reunion(ArrayList<Participante>participantes, String lugar, String tema, double duracion) {
		this.participantes = participantes;
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
	}
	
}
