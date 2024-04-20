package EmpresaRiesgos;
/**
 * Principio Abierto/Cerrado: La clase Administrativo puede ser extendida para a
 * gregar funcionalidades adicionales sin modificar su código fuente original. 
 * Esto se observa en el hecho de que Administrativo es una subclase de Usuario 
 * y también implementa la interfaz Asesoria, lo que permite extender su funcionalidad 
 * mediante herencia y composición
 * La clase Administrativo representa a un usuario que desempeña funciones administrativas en la empresa.
 * Extiende de la clase Usuario e implementa la interfaz Asesoria.
 */
public class Administrativo extends Usuario implements Asesoria {

	// Atributos

	private String area;
	private String experienciaPrevia;
	
	
	/**
     * Constructor de Administrativo con parámetros.
     *
     * @param nombre            Nombre del administrativo.
     * @param fechaNacimiento   Fecha de nacimiento del administrativo en formato YYYY-MM-DD.
     * @param run               RUN del administrativo.
     * @param area              Área de especialización del administrativo.
     * @param experienciaPrevia Experiencia laboral previa del administrativo.
     */

	
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	/**
     * Constructor vacío de Administrativo.
     */
	public Administrativo() {

	}

	/**
     * Obtiene el área de especialización del administrativo.
     *
     * @return El área de especialización del administrativo.
     */
	
	public String getarea() {
		return area;
	}
	/**
     * Establece el área de especialización del administrativo.
     *
     * @param area El nuevo área de especialización del administrativo.
     */
	public void setarea(String area) {
		this.area = area;
	}

	/**
     * Obtiene la experiencia laboral previa del administrativo.
     *
     * @return La experiencia laboral previa del administrativo.
     */
	public String experienciaPrevia() {
		return experienciaPrevia;
	}

	 /**
     * Establece la experiencia laboral previa del administrativo.
     *
     * @param experienciaPrevia La nueva experiencia laboral previa del administrativo.
     */
	public void setexperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	  /**
     * Analiza y muestra información detallada del administrativo.
     * Este método sobrescribe el método de la clase base Usuario para incluir
     * el área y la experiencia previa del administrativo.
     */

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + area);
		System.out.println("Experiencia previa: " + experienciaPrevia);
	}
}
