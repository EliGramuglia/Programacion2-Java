package PortalDeNoticias;

import java.util.ArrayList;

public class Suscriptor {
	private String nombre;
	private String apellido;
	private String email;
	private ArrayList<Noticia> noticiasRecibidas;
	private Filtro filtro;
	
	public Suscriptor(String nombre, String apellido, String email, Filtro filtro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.filtro = filtro;
		this.noticiasRecibidas = new ArrayList<>();
	}
	
	public void addNoticia(Noticia nueva) {
		if(this.filtro.cumple(nueva)) {
			this.noticiasRecibidas.add(nueva);
		}
	}
	
	public void setFiltro(Filtro nuevo) {
		this.filtro = nuevo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Filtro getFiltro() {
		return filtro;
	}

	
}
