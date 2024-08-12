package EstablecimientoDeportivo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Turno {
	private ArrayList<Usuario>usuarios;
	private Cancha cancha;
	private LocalDate fecha;
	private int duracion;
	
	
	public Turno(ArrayList<Usuario> usuarios, Cancha cancha, LocalDate fecha, int duracion) {
		this.usuarios = usuarios;
		this.cancha = cancha;
		this.fecha = fecha;
		this.duracion = duracion;
	}


	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public Cancha getCancha() {
		return cancha;
	}


	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}	
}
