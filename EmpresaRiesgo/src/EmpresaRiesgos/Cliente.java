package EmpresaRiesgos;

/**
 * La clase Cliente representa un usuario del sistema que es un cliente.
 * Extiende la clase Usuario e incluye atributos específicos de un cliente, como el RUT, nombres,
 * apellidos, teléfono, AFP, sistema de salud, dirección, comuna y edad.
 */
public class Cliente extends Usuario {

    // Atributos específicos del cliente
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    // Constructor con parámetros
    public Cliente(String nombre, String fechaNacimiento, int run, int rut, String nombres, String apellidos,
                   String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    // Constructor sin parámetros
    public Cliente() {
    }

    /**
     * Obtiene el RUT del cliente.
     * @return El RUT del cliente.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Establece el RUT del cliente.
     * @param rut El RUT a establecer.
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    /**
     * Obtiene los nombres del cliente.
     * @return Los nombres del cliente.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres del cliente.
     * @param nombres Los nombres a establecer.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene los apellidos del cliente.
     * @return Los apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente.
     * @param apellidos Los apellidos a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el teléfono del cliente.
     * @return El teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     * @param telefono El teléfono a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la AFP del cliente.
     * @return La AFP del cliente.
     */
    public String getAfp() {
        return afp;
    }

    /**
     * Establece la AFP del cliente.
     * @param afp La AFP a establecer.
     */
    public void setAfp(String afp) {
        this.afp = afp;
    }

    /**
     * Obtiene el sistema de salud del cliente.
     * @return El sistema de salud del cliente (1 para Fonasa, 2 para Isapre).
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }

    /**
     * Establece el sistema de salud del cliente.
     * @param sistemaSalud El sistema de salud a establecer (1 para Fonasa, 2 para Isapre).
     */
    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    /**
     * Obtiene la dirección del cliente.
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     * @param direccion La dirección a establecer.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la comuna del cliente.
     * @return La comuna del cliente.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna del cliente.
     * @param comuna La comuna a establecer.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Obtiene la edad del cliente.
     * @return La edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del cliente.
     * @param edad La edad a establecer.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el nombre completo del cliente (nombres + apellidos).
     * @return El nombre completo del cliente.
     */
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    /**
     * Obtiene el sistema de salud del cliente como texto (Fonasa o Isapre).
     * @return El sistema de salud del cliente como texto.
     */
    public String obtenerSistemaSalud() {
        return (sistemaSalud == 1) ? "Fonasa" : "Isapre";
    }

    /**
     * Muestra los datos del cliente en consola, incluyendo nombre, RUT, AFP y sistema de salud.
     */
	
    public void mostrarCliente() {
        System.out.println("Nombre: " + obtenerNombre());
        System.out.println("RUT: " + rut);
        System.out.println("AFP: " + afp);
        System.out.println("Sistema de Salud: " + obtenerSistemaSalud());
    }
    /**
     * Representación del cliente como una cadena de texto.
     *
     * @return La representación del cliente como una cadena de texto.
     */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección: " + direccion);
		System.out.println("Comuna: " + comuna);
		
	}
}
	