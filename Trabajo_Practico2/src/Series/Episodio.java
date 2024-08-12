package Series;

public class Episodio {

	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;
	//(con valores de 1 a 5). Si no se vio un
	//episodio particular, la calificación dada será un valor negativo.
	
	
	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.flag = false;
		this.calificacion = -1;
	}
	
	public void calificar(int calificacion) {
		if(calificacion>=1 && calificacion<=5) {
			this.calificacion = calificacion;
			System.out.println("El episodio "+ this.titulo + " tiene "+this.calificacion+" puntos de calificacion.");
		} else {
			System.out.println("El valor ingresado es incorrecto.");
		}
	}
	


	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getTitulo() {
		return titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public int getCalificacion() {
		return calificacion;
	}

	
}
