package Persona;
import java.time.LocalDate;

public class Persona {

	// atributos
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;

	// Metodos constructores
	public Persona(int dni) {
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		this.sexo = "Femenino";
		this.nombre = "N";
		this.apellido = "N";
		this.peso = 1.0;
		this.altura = 1.0;
	}

	public Persona(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2022, 8, 18);
		sexo = "Femenino";
		this.nombre = "N";
		this.apellido = "N";
		peso = 1.0;
		altura = 1.0;
	}

	public Persona(int dni, String nombre, String apellido, int fechaNacimiento) {
		this.dni = dni;
		this.fechaNacimiento = LocalDate.of(2000, 1, 1);
		sexo = "Femenino";
		this.nombre = "N";
		this.apellido = "N";
		peso = 1.0;
		altura = 1.0;
	}

	// Cálculo del índice de masa Corporal
	public double obtenerMasaCorporal() {
		double elevado = Math.pow(altura, 2);
		double calculo = peso / elevado;

		return calculo;
	}

	// Saber si está en forma
	public boolean estaEnForma() {
		double masaCorporal = this.obtenerMasaCorporal();
		if ((masaCorporal >= 18.5) && (masaCorporal <= 25.0)) {
			return true;
		} else {
			return false;
		}
	}

	// Saber si esta cumpliendo años
	public boolean cumpleAnios() {
		return this.fechaNacimiento.equals(LocalDate.now());
	}

	// Es mayor de edad
	private boolean esMayor(int edad) {
		LocalDate fechaActual = LocalDate.now();

		if ((fechaActual.getYear() - fechaNacimiento.getYear()) < edad) {
			return false;
		} else if ((fechaActual.getYear() - fechaNacimiento.getYear()) == edad) {
			if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()) {
				return false;
			} else if (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()) {
				if (fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth()) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean esMayorDeEdad() {
		return this.esMayor(18);
	}

	public boolean puedeVotar() {
		return this.esMayor(16);
	}

	
	public boolean esCoherente(int edad) {
		LocalDate fechaActual = LocalDate.now();

		if (fechaActual.getYear() - fechaNacimiento.getYear() == edad) {
			if (fechaActual.getMonthValue() > fechaNacimiento.getMonthValue()) {
				return false;
			} else if (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()) {
				if (fechaActual.getDayOfMonth() >= fechaNacimiento.getDayOfMonth()) {
					return true;
				} else {
					return false;
				}
			} else if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()) {
				return true;
			}
		}
		return false;
	}

	
	public String imprimirDatos() {
		return "Nombre: " + nombre +
        "\nApellido: " + apellido +
        "\nEdad: " + edad +
        "\nFecha de Nacimiento: " + fechaNacimiento +
        "\nDNI: " + dni +
        "\nSexo: " + sexo +
        "\nPeso: " + peso +
        "\nAltura: " + altura;
	}
	
	
	// Mostrar datos
	public void MostrarDatos() {
		System.out.println("Nombre completp: " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("DNI: " + dni);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println(cumpleAnios());
		System.out.println(LocalDate.now());
		System.out.println(esCoherente(1));
		System.out.println(imprimirDatos());
		System.out.println(obtenerMasaCorporal());
	}

	
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
