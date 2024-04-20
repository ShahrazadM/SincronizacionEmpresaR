package EmpresaRiesgos;

/**
 *  Accidente pertenese a clase principio de Responsabilidad única al tener una sola razón para cambiar, 
 * que es la representación y manipulación de los datos del accidente.
 * La clase Accidente representa un evento de accidente registrado en el sistema.
 * Contiene atributos que describen el accidente, como identificador, rut del cliente,
 * día, hora, lugar, origen y consecuencias.
 */
public class Accidente {

    // Atributos de la clase Accidente

    private int identificadorAc; // Identificador único del accidente
    private int rutCliente; // Rut del cliente asociado al accidente
    private String dia; // Día en que ocurrió el accidente (formato YYYY-MM-DD)
    private String hora; // Hora en que ocurrió el accidente
    private String lugar; // Lugar donde ocurrió el accidente
    private String origen; // Origen del accidente (causa)
    private String consecuencias; // Consecuencias del accidente

    /**
     * Constructor de Accidente con parámetros.
     *
     * @param identificadorAc Identificador único del accidente.
     * @param rutCliente      Rut del cliente asociado al accidente.
     * @param dia             Día en que ocurrió el accidente en formato YYYY-MM-DD.
     * @param hora            Hora en que ocurrió el accidente.
     * @param lugar           Lugar donde ocurrió el accidente.
     * @param origen          Origen del accidente (causa).
     * @param consecuencias   Consecuencias del accidente.
     */
    public Accidente(int identificadorAc, int rutCliente, String dia, String hora, String lugar, String origen,
                     String consecuencias) {
        this.identificadorAc = identificadorAc;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    /**
     * Constructor vacío de Accidente.
     */
    public Accidente() {
        // Constructor vacío utilizado para instanciar objetos sin inicializar valores.
    }

    // Métodos accesores (getters y setters) para los atributos de Accidente

    /**
     * Obtiene el identificador único del accidente.
     *
     * @return El identificador único del accidente.
     */
    public int getIdentificadorAc() {
        return identificadorAc;
    }

    /**
     * Establece el identificador único del accidente.
     *
     * @param identificadorAc El nuevo identificador único del accidente.
     */
    public void setIdentificadorAc(int identificadorAc) {
        this.identificadorAc = identificadorAc;
    }

    /**
     * Obtiene el Rut del cliente asociado al accidente.
     *
     * @return El Rut del cliente asociado al accidente.
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Establece el Rut del cliente asociado al accidente.
     *
     * @param rutCliente El nuevo Rut del cliente asociado al accidente.
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Obtiene el día en que ocurrió el accidente.
     *
     * @return El día en que ocurrió el accidente en formato YYYY-MM-DD.
     */
    public String getDia() {
        return dia;
    }

    /**
     * Establece el día en que ocurrió el accidente.
     *
     * @param dia El nuevo día en que ocurrió el accidente en formato YYYY-MM-DD.
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Obtiene la hora en que ocurrió el accidente.
     *
     * @return La hora en que ocurrió el accidente.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora en que ocurrió el accidente.
     *
     * @param hora La nueva hora en que ocurrió el accidente.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el lugar donde ocurrió el accidente.
     *
     * @return El lugar donde ocurrió el accidente.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar donde ocurrió el accidente.
     *
     * @param lugar El nuevo lugar donde ocurrió el accidente.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Obtiene el origen (causa) del accidente.
     *
     * @return El origen (causa) del accidente.
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen (causa) del accidente.
     *
     * @param origen El nuevo origen (causa) del accidente.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene las consecuencias del accidente.
     *
     * @return Las consecuencias del accidente.
     */
    public String getConsecuencias() {
        return consecuencias;
    }

    /**
     * Establece las consecuencias del accidente.
     *
     * @param consecuencias Las nuevas consecuencias del accidente.
     */
    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    /**
     * Representación del accidente como una cadena de texto.
     *
     * @return La representación del accidente como una cadena de texto.
     */
    @Override
    public String toString() {
        return "Accidente{" +
                "Identificador=" + identificadorAc +
                ", RutCliente=" + rutCliente +
                ", Dia='" + dia + '\'' +
                ", Hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Origen='" + origen + '\'' +
                ", Consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
