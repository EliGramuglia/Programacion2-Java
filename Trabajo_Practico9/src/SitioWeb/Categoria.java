package SitioWeb;

import java.util.ArrayList;


public class Categoria extends Elemento {
	private String descripcion;
	private ArrayList<Elemento> elementos;
	private String nombre;

	public Categoria(String descripcion, String nombre) {
		this.descripcion = descripcion;
		this.elementos = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public void addElemento(Elemento nuevo) {
		if(nuevo.getPadre() != null) {
			nuevo.getPadre().eliminarPadre(nuevo);
		}
		this.elementos.add(nuevo);
		nuevo.setPadre(this);
	}

	private void eliminarPadre(Elemento nuevo) {
		this.elementos.remove(nuevo);
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getCantidadNoticias() {
		int acumulador = 0;
		for(int i = 0; i<this.elementos.size(); i++) {
			acumulador += this.elementos.get(i).getCantidadNoticias();
		}
		return acumulador;
	}

	
	@Override
	public ArrayList<Noticia> noticiasQueCumplen(Filtro f) {
		ArrayList<Noticia> aux = new ArrayList<>();
		for(int i=0; i<this.elementos.size(); i++) {
			aux.addAll(this.elementos.get(i).noticiasQueCumplen(f));
		}
		return aux;
	}

	@Override
	public String getPath() {
        String path = this.getNombre();
        for (int i=0; i< this.elementos.size(); i++){
            path += this.getNombre()+ "/" + this.elementos.get(i).getPath() + "\n";
        }
        return path;
	}

	@Override
	public Elemento getCopia(FiltroPalabraClave f) {
		ArrayList<Elemento> copiaHijos = new ArrayList<>();
		for(Elemento elem: elementos) {
			Elemento elemHijo = elem.getCopia(f);
			if(elemHijo != null) {
				copiaHijos.add(elemHijo);
			}
		}
		if(copiaHijos.isEmpty()) {
			return null;
		} else {
			Categoria copia = new Categoria(this.descripcion, this.nombre);
			for(Elemento e: copiaHijos) {
				copia.addElemento(e);
			}
			return copia;
		}
	}
	
	
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	public ArrayList<Elemento> listar(){
		return this.elementos;
	}
}
