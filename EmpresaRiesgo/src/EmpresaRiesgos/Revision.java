package EmpresaRiesgos;
/**
 *  Principio de responsabilidad única: La clase Revision se encarga únicamente de representar una revisión
 *  y proporcionar métodos para acceder y modificar sus atributos. 
 *  Cumple con el principio de responsabilidad única al tener una sola razón para cambiar, que es 
 *  la representación y manipulación de los datos de la revisión.
 *  
 * La clase Revision representa una revisión asociada a una visita técnica.
 * Esta clase contiene información sobre la revisión, incluyendo su identificador,
 * identificador de la visita técnica, nombre de la revisión, detalle y estado.
 */
public class Revision {

	private int identificadorRevision;
	private int identificadorVt;
	private String nombrerevision;
	private String detalle;
	private int Estado; // Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se
// pueden ingresar los valores antes indicados

	/**
     * Constructor para inicializar un objeto Revision con parámetros.
     * @param identificadorRevision Identificador único de la revisión.
     * @param identificadorVt Identificador de la visita técnica asociada a la revisión.
     * @param nombreRevision Nombre de la revisión.
     * @param detalle Detalle o descripción de la revisión.
     * @param estado Estado de la revisión (1, 2 o 3).
     */
	public Revision(int identificadorRevision, int identificadorVt, String nombrerevision, String detalle, int Estado) {
		this.identificadorRevision = identificadorRevision;
		this.nombrerevision = nombrerevision;
		this.detalle = detalle;
		this.Estado = Estado;

	}

	/**
     * Constructor sin parámetros para crear un objeto Revision vacío.
     */
	public Revision() {

	}

	/**
     * Método de acceso para obtener el identificador de la revisión.
     * @return El identificador de la revisión.
     */

	public int getidentificadorRevision() {
		return identificadorRevision;
	}
	/**
     * Método de mutación para establecer el identificador de la revisión.
     * @param identificadorRevision El nuevo identificador de la revisión.
     */
	public void setidentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}
	/**
     * Método de acceso para obtener el identificador de la visita técnica asociada.
     * @return El identificador de la visita técnica asociada.
     */
	public int getidentificadorVt() {
		return identificadorVt;
	}
	/**
     * Método de mutación para establecer el identificador de la visita técnica asociada.
     * @param identificadorVt El nuevo identificador de la visita técnica asociada.
     */
	public void setidentificadorVt(int identificadorVt) {
		this.identificadorVt = identificadorVt;
	}
	/**
     * Método de acceso para obtener el nombre de la revisión.
     * @return El nombre de la revisión.
     */
	public String getnombrerevision() {
		return nombrerevision;
	}


    /**
     * Método de mutación para establecer el nombre de la revisión.
     * @param nombreRevision El nuevo nombre de la revisión.
     */
	public void setnombrerevision(String nombrerevision) {
		this.nombrerevision = nombrerevision;
	}
	/**
     * Método de mutación para establecer el detalle o descripción de la revisión.
     * @param detalle El nuevo detalle o descripción de la revisión.
     */
	public void setdetalle(String detalle) {
		this.detalle = detalle;
	}
	/**
     * Método de acceso para obtener el estado de la revisión.
     * @return El estado de la revisión.
     */
	public int getEstado() {
		return Estado;
	}
	 /**
     * Método de mutación para establecer el estado de la revisión.
     * @param estado El nuevo estado de la revisión.
     */
	public void setEstado(int Estado) {
		this.Estado = Estado;
	}

	/**
     * Método para validar y establecer el estado de la revisión.
     * @param estado El estado a validar.
     * @return El estado validado (1, 2 o 3).
     */	public int validarEstado(int estado) {
		if (estado == 1 || estado == 2 || estado == 3) {
			return estado; // Estado válido
		} else {
			System.out.println("Error: Estado no válido. Se establecerá como 1 (sin problemas) por defecto.");
			return 1; // Si el estado ingresado no es válido, establecer como 1 por defecto
		}
	}

	/**
     * Sobrescribe el método toString para representar la revisión como una cadena.
     * @return Representación de la revisión como una cadena.
     */
	@Override
	public String toString() {
		return "Accidente{" + "Identificador de Revision=" + identificadorRevision + ", Identificador Visita Terreno="
				+ identificadorVt + ", Nombre revision='" + nombrerevision + '\'' + ", detalle='" + detalle + '\''
				+ ", Estado='" + Estado + '\'' + '}';
	}
}
