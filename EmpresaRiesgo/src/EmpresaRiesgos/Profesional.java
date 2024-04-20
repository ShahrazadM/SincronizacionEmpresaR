package EmpresaRiesgos;
/**
 * La clase Profesional representa a un usuario que es un profesional dentro de la empresa.
 * Extiende la clase Usuario e incluye información adicional como título y fecha de ingreso.
 */
public class Profesional extends Usuario {
	private String titulo;// El título del profesional
	private String fechaIngreso;// La fecha de ingreso del profesional

	 /**
     * Constructor para inicializar un objeto Profesional con parámetros.
     * @param nombre Nombre del profesional.
     * @param fechaNacimiento Fecha de nacimiento del profesional.
     * @param run RUN (Rol Único Nacional) del profesional.
     * @param titulo Título del profesional.
     * @param fechaIngreso Fecha de ingreso del profesional a la empresa.
     */
	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;

	}
	/**
     * Constructor sin parámetros para crear un objeto Profesional vacío.
     */
	// Constructor sin parámetros
	public Profesional() {
		// Constructor vacío
	}

	/**
     * Método de acceso para obtener el título del profesional.
     * @return El título del profesional.
     */
	public String gettitulo() {
		return titulo;
	}

	
	/**
     * Método de mutación para establecer el título del profesional.
     * @param titulo El nuevo título del profesional.
     */
	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	
	/**
     * Método de acceso para obtener la fecha de ingreso del profesional.
     * @return La fecha de ingreso del profesional.
     */
	public String getfechaIngreso() {
		return fechaIngreso;
	}

	/**
     * Método de mutación para establecer la fecha de ingreso del profesional.
     * @param fechaIngreso La nueva fecha de ingreso del profesional.
     */
	public void setfechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
     * Sobrescribe el método analizarUsuario de la clase base (Usuario).
     * Imprime información adicional del profesional como título y fecha de ingreso.
     */
    
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIngreso);
	}

}