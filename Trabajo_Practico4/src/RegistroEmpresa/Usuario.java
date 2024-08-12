package RegistroEmpresa;

public class Usuario extends Persona {
	private String usuario;
	private String password;
	
	
	public Usuario(String nombre, String apellido, int edad, String usuario, String password) {
		super(nombre, apellido, edad);
		this.usuario = usuario;
		this.password = password;
	}
	
	@Override
	public String obtenerDatos() {
		return "CARGO: usuario final"+super.obtenerDatos()+"\nUSUARIO: "+usuario+"\nCONTRASEÑA: "+password+"\n";
	}
}
