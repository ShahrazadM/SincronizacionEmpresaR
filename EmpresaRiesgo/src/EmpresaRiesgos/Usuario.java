package EmpresaRiesgos;

import java.time.LocalDate;
import java.time.Period;
/**
 *  Principio de sustitución de Liskov: La clase Usuario es una clase base para Cliente y Profesional, 
 * y se utiliza polimorfismo para tratar a las instancias de estas clases de manera uniforme. 
 * Esto cumple con el principio de sustitución de Liskov, ya que las instancias de las subclases 
 * pueden ser utilizadas en lugar de instancias de la clase base sin alterar el comportamiento esperado.
 * 
 * La clase abstracta Usuario representa a un usuario genérico dentro del sistema.
 * Esta clase proporciona funcionalidades básicas para manipular información de un usuario,
 * como nombre, fecha de nacimiento y RUN (Rol Único Nacional).
 */
public abstract class Usuario implements Asesoria {

	// Atributos

	private String nombre;
	private String fechaNacimiento;
	private int run;

	/**
     * Constructor para inicializar un objeto Usuario con parámetros.
     * @param nombre Nombre del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario (formato YYYY-MM-DD).
     * @param run RUN (Rol Único Nacional) del usuario.
     */

	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	 /**
     * Constructor sin parámetros para crear un objeto Usuario vacío.
     */
	public Usuario() {
	}
	// Metodos accesadores get y set de Usuario

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getrun() {
		return run;
	}

	public void setrun(int run) {
		this.run = run;
	}
/**
    * Métodos para calcular y mostrar la edad del usuario a partir de su fecha de nacimiento.
    * Utiliza la fecha actual del sistema para calcular la edad en años.
    */
	public void mostrarEdad() {
		// Obtener la fecha actual
		LocalDate ahora = LocalDate.now();

		// Parsear la fecha de nacimiento a LocalDate
		LocalDate fechaNac = LocalDate.parse(fechaNacimiento);

		// Calcular la diferencia de años entre la fecha actual y la fecha de nacimiento
		Period periodo = Period.between(fechaNac, ahora);
		int edad = periodo.getYears();

		// Mostrar un mensaje con la edad del usuario
		System.out.println("El usuario tiene " + edad + " años.");
	}
	 /**
     * Método para analizar y mostrar información básica del usuario, como nombre y RUN.
     */
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre);
		System.out.println("RUN: " + run);
	}
	 /**
     * Método complementario para mostrar los datos completos del usuario,
     * incluyendo nombre, RUN y edad calculada.
     */
    public void mostrarDatosUsuario() {
        System.out.println("Datos del Usuario:");
        analizarUsuario(); // Llama al método analizarUsuario() para mostrar nombre y RUN
        mostrarEdad(); // Llama al método mostrarEdad() para mostrar la edad del usuario
    }
	
    /**
     * Sobrescribe el método toString para representar el objeto Usuario como una cadena.
     * @return Representación del Usuario como una cadena de texto.
     */
	@Override
	public String toString() {
		return "Usuario{" + "nombre='" + nombre + '\'' + ", fechaNacimiento='" + fechaNacimiento + '\'' + ", run=" + run
				+ '}';
	}

	public int getRun() {
		return run;
	}

}