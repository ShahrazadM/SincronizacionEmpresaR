package EmpresaRiesgos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Contenedor representa un contenedor de datos para almacenar usuarios y capacitaciones.
 * Permite almacenar diferentes tipos de usuarios y listarlos según diversos criterios.
 */
public class Contenedor {

    private List<Asesoria> listaUsuarios;
    private List<Capacitacion> listaCapacitaciones;

    /**
     * Constructor de la clase Contenedor.
     * Inicializa las listas de usuarios y capacitaciones.
     */
    public Contenedor() {
        listaUsuarios = new ArrayList<>();
        listaCapacitaciones = new ArrayList<>();
    }

    /**
     * Almacena un cliente en la lista de usuarios.
     * @param cliente Cliente a almacenar.
     */
    public void almacenarCliente(Cliente cliente) {
        listaUsuarios.add(cliente);
    }

    /**
     * Almacena un profesional en la lista de usuarios.
     * @param profesional Profesional a almacenar.
     */
    public void almacenarProfesional(Profesional profesional) {
        listaUsuarios.add(profesional);
    }

    /**
     * Almacena un administrativo en la lista de usuarios.
     * @param administrativo Administrativo a almacenar.
     */
    public void almacenarAdministrativo(Administrativo administrativo) {
        listaUsuarios.add(administrativo);
    }

    /**
     * Almacena una capacitación en la lista de capacitaciones.
     * @param capacitacion Capacitación a almacenar.
     */
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    /**
     * Elimina un usuario de la lista de usuarios por su RUN.
     * @param runUsuario RUN del usuario a eliminar.
     */
    public void eliminarUsuario(int runUsuario) {
        Iterator<Asesoria> iterator = listaUsuarios.iterator();
        while (iterator.hasNext()) {
            Asesoria usuario = iterator.next();
            if (usuario instanceof Usuario && ((Usuario) usuario).getRun() == runUsuario) {
                iterator.remove();
                System.out.println("Usuario eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Usuario con RUN " + runUsuario + " no encontrado.");
    }

    /**
     * Lista todos los usuarios almacenados.
     */
    public void listarUsuarios() {
        for (Asesoria asesoria : listaUsuarios) {
            System.out.println(asesoria);
        }
    }

    /**
     * Lista usuarios por tipo.
     * @param tipo Tipo de usuario a listar (cliente, profesional, administrativo).
     */
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : listaUsuarios) {
            if (asesoria.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(asesoria);
            }
        }
    }

    /**
     * Lista todas las capacitaciones almacenadas.
     */
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : listaCapacitaciones) {
            System.out.println(capacitacion);
        }
    }

    /**
     * Método para ingresar un nuevo usuario al sistema.
     * Solicita al usuario el tipo de usuario a ingresar y realiza las operaciones correspondientes.
     * @param scanner Scanner para entrada de datos desde consola.
     */
    public void ingresarNuevoUsuario(Scanner scanner) {
        System.out.println("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
        String tipoUsuario = scanner.next();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (tipoUsuario.toLowerCase()) {
            case "cliente":
                Cliente cliente = new Cliente();
                // Lógica para solicitar y establecer los datos del cliente
                almacenarCliente(cliente);
                System.out.println("Cliente almacenado exitosamente.");
                break;
            case "profesional":
                Profesional profesional = new Profesional();
                // Lógica para solicitar y establecer los datos del profesional
                almacenarProfesional(profesional);
                System.out.println("Profesional almacenado exitosamente.");
                break;
            case "administrativo":
                Administrativo administrativo = new Administrativo();
                // Lógica para solicitar y establecer los datos del administrativo
                almacenarAdministrativo(administrativo);
                System.out.println("Administrativo almacenado exitosamente.");
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
        }
    }
}




