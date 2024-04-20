package EmpresaRiesgos;

/**
 * Principio Abierto/Cerrado: La clase Visitaterreno parece ser una clase de datos simple que se 
 * utiliza para representar una visita en terreno. Cumple con el principio de abierto/cerrado al 
 * no tener métodos que permitan modificar sus atributos directamente, lo que facilita la extensión 
 * de la funcionalidad sin modificar su implementación.
 * 
 * 
 * La clase Visitaterreno representa una visita en terreno realizada a un cliente.
 * Contiene información sobre la visita, como identificador, cliente asociado, fecha, hora, lugar y comentarios.
 */
public class Visitaterreno {

    private int identificadorVt; // Identificador único de la visita en terreno
    private int rutCliente; // RUN (Rol Único Nacional) del cliente asociado a la visita
    private String dia; // Fecha de la visita en formato ISO (YYYY-MM-DD)
    private String hora; // Hora de la visita (formato HH:mm)
    private String lugar; // Lugar de la visita en terreno
    private String comentarios; // Comentarios adicionales sobre la visita

    /**
     * Constructor para inicializar un objeto Visitaterreno con parámetros.
     * @param identificadorVt Identificador único de la visita en terreno.
     * @param rutCliente RUN (Rol Único Nacional) del cliente asociado a la visita.
     * @param dia Fecha de la visita en formato ISO (YYYY-MM-DD).
     * @param hora Hora de la visita (formato HH:mm).
     * @param lugar Lugar de la visita en terreno.
     * @param comentarios Comentarios adicionales sobre la visita.
     */
    public Visitaterreno(int identificadorVt, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.identificadorVt = identificadorVt;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    /**
     * Constructor sin parámetros para crear un objeto Visitaterreno vacío.
     */
    public Visitaterreno() {
        // Constructor vacío
    }

    /**
     * Método de acceso para obtener el identificador de la visita en terreno.
     * @return El identificador de la visita en terreno.
     */
    public int getIdentificadorVt() {
        return identificadorVt;
    }

    /**
     * Método de mutación para establecer el identificador de la visita en terreno.
     * @param identificadorVt El nuevo identificador de la visita en terreno.
     */
    public void setIdentificadorVt(int identificadorVt) {
        this.identificadorVt = identificadorVt;
    }

    /**
     * Método de acceso para obtener el RUN (Rol Único Nacional) del cliente asociado a la visita.
     * @return El RUN del cliente asociado a la visita.
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Método de mutación para establecer el RUN (Rol Único Nacional) del cliente asociado a la visita.
     * @param rutCliente El nuevo RUN del cliente asociado a la visita.
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Método de acceso para obtener la fecha de la visita en terreno.
     * @return La fecha de la visita en formato ISO (YYYY-MM-DD).
     */
    public String getDia() {
        return dia;
    }

    /**
     * Método de mutación para establecer la fecha de la visita en terreno.
     * @param dia La nueva fecha de la visita en formato ISO (YYYY-MM-DD).
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Método de acceso para obtener la hora de la visita en terreno.
     * @return La hora de la visita (formato HH:mm).
     */
    public String getHora() {
        return hora;
    }

    /**
     * Método de mutación para establecer la hora de la visita en terreno.
     * @param hora La nueva hora de la visita (formato HH:mm).
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Método de acceso para obtener el lugar de la visita en terreno.
     * @return El lugar de la visita en terreno.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Método de mutación para establecer el lugar de la visita en terreno.
     * @param lugar El nuevo lugar de la visita en terreno.
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Método de acceso para obtener los comentarios adicionales sobre la visita en terreno.
     * @return Los comentarios adicionales sobre la visita en terreno.
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Método de mutación para establecer los comentarios adicionales sobre la visita en terreno.
     * @param comentarios Los nuevos comentarios sobre la visita en terreno.
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Sobrescribe el método toString para representar el objeto Visitaterreno como una cadena.
     * @return Representación de la visita en terreno como una cadena de texto.
     */
    @Override
    public String toString() {
        return "Visitaterreno{" +
                "Identificador=" + identificadorVt +
                ", RutCliente=" + rutCliente +
                ", Dia='" + dia + '\'' +
                ", Hora='" + hora + '\'' +
                ", Lugar='" + lugar + '\'' +
                ", Comentarios='" + comentarios + '\'' +
                '}';
    }
}
