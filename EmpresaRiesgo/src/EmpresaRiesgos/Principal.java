package EmpresaRiesgos;

import java.util.Scanner;

/**
 * La clase Principal representa la interfaz principal del sistema de gestión de la empresa.
 * Permite interactuar con el usuario a través de un menú interactivo para realizar diversas operaciones.
 */



public class Principal {
	 /**
     * Método principal que ejecuta la interfaz de usuario del sistema.
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contenedor contenedor = new Contenedor(); // Creamos una instancia de la clase Contenedor

        int opcion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Almacenar Cliente
                    Cliente cliente = new Cliente();
                    System.out.println("Ingrese el nombre del cliente:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    cliente.setnombre(scanner.nextLine());

                    // Solicitar y establecer la fecha de nacimiento del cliente
                    String fechaNacimiento;
                    do {
                        System.out.println("Ingrese la fecha de nacimiento del cliente (formato YYYY-MM-DD):");
                        fechaNacimiento = scanner.nextLine();
                    } while (!fechaNacimiento.matches("\\d{4}-\\d{2}-\\d{2}"));
                    cliente.setfechaNacimiento(fechaNacimiento);

                    // Solicitar y establecer el RUN del cliente
                    int runCliente;
                    do {
                        System.out.println("Ingrese el RUN del cliente (formato sin guion, 8 dígitos):");
                        String input = scanner.next();
                        if (input.matches("\\d+")) {
                            runCliente = Integer.parseInt(input);
                        } else {
                            System.out.println("ERROR: Debe ingresar un número para el RUN.");
                            runCliente = -1;
                        }
                    } while (String.valueOf(runCliente).length() != 8);
                    cliente.setrun(runCliente);

                    // Solicitar y establecer los demás datos del cliente
                    System.out.println("Ingrese los nombres del cliente:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    cliente.setNombres(scanner.nextLine());
                    System.out.println("Ingrese los apellidos del cliente:");
                    cliente.setApellidos(scanner.nextLine());

                    // Validar y establecer el teléfono del cliente (Ingrese máximo 9 números)
                    String telefono;
                    do {
                        System.out.println("Ingrese el teléfono del cliente (Ingrese máximo 9 números):");
                        telefono = scanner.nextLine();
                        if (!telefono.matches("\\d+")) {
                            System.out.println("ERROR: Debe ingresar un número para el teléfono.");
                            telefono = "";
                        }
                    } while (telefono.isEmpty() || telefono.length() != 9);
                    cliente.setTelefono(telefono);

                    System.out.println("Ingrese la AFP del cliente:");
                    cliente.setAfp(scanner.nextLine());
                    System.out.println("Ingrese el sistema de salud del cliente (1 para Fonasa, 2 para Isapre):");
                    cliente.setSistemaSalud(scanner.nextInt());
                    System.out.println("Ingrese la dirección del cliente:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    cliente.setDireccion(scanner.nextLine());
                    System.out.println("Ingrese la comuna del cliente:");
                    cliente.setComuna(scanner.nextLine());

                    // Validar y establecer la edad del cliente
                    int edadCliente;
                    do {
                        System.out.println("Ingrese la edad del cliente:");
                        String input = scanner.next();
                        if (input.matches("\\d+")) {
                            edadCliente = Integer.parseInt(input);
                        } else {
                            System.out.println("ERROR: Debe ingresar un número para la edad.");
                            edadCliente = -1;
                        }
                    } while (edadCliente <= 0 || edadCliente > 150); // Validación básica para evitar edades negativas o absurdamente altas
                    cliente.setEdad(edadCliente);

                    contenedor.almacenarCliente(cliente);
                    System.out.println("El cliente ha sido agregado correctamente:");
                    cliente.mostrarCliente();
                    cliente.analizarUsuario();
                    break;

                case 2:
                    // Almacenar Profesional
                    Profesional profesional = new Profesional();
                    System.out.println("Ingrese el nombre del profesional:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    profesional.setnombre(scanner.nextLine());

                    // Solicitar y establecer la fecha de nacimiento del profesional
                    String fechaNacimientoProfesional;
                    do {
                        System.out.println("Ingrese la fecha de nacimiento del profesional (formato YYYY-MM-DD):");
                        fechaNacimientoProfesional = scanner.nextLine();
                    } while (!fechaNacimientoProfesional.matches("\\d{4}-\\d{2}-\\d{2}"));
                    profesional.setfechaNacimiento(fechaNacimientoProfesional);

                    // Solicitar y establecer el RUN del profesional
                    int runProfesional;
                    do {
                        System.out.println("Ingrese el RUN del profesional (formato sin guion, 8 dígitos):");
                        String input = scanner.next();
                        if (input.matches("\\d{8}")) {
                            runProfesional = Integer.parseInt(input);
                        } else {
                            System.out.println("ERROR: El RUN debe contener exactamente 8 dígitos.");
                            runProfesional = -1;
                        }
                    } while (runProfesional < 0);
                    profesional.setrun(runProfesional);

                    // Solicitar y establecer el título del profesional
                    System.out.println("Ingrese el título del profesional:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    profesional.settitulo(scanner.nextLine());

                    // Solicitar y establecer la fecha de ingreso del profesional
                    String fechaIngresoProfesional;
                    do {
                        System.out.println("Ingrese la fecha de ingreso del profesional (formato YYYY-MM-DD):");
                        fechaIngresoProfesional = scanner.nextLine();
                    } while (!fechaIngresoProfesional.matches("\\d{4}-\\d{2}-\\d{2}"));
                    profesional.setfechaIngreso(fechaIngresoProfesional);
                    
                    contenedor.almacenarProfesional(profesional);
                    System.out.println("El Profesional ha sido agregado correctamente:");
                    profesional.analizarUsuario();
                    profesional.mostrarEdad();
                    break;

                case 3:
                    // Almacenar Administrativo
                    Administrativo administrativo = new Administrativo();
                    System.out.println("Ingrese el nombre del administrativo:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    administrativo.setnombre(scanner.nextLine());

                    // Solicitar y establecer la fecha de nacimiento del administrativo
                    String fechaNacimientoAdministrativo;
                    do {
                        System.out.println("Ingrese la fecha de nacimiento del administrativo (formato YYYY-MM-DD):");
                        fechaNacimientoAdministrativo = scanner.nextLine();
                    } while (!fechaNacimientoAdministrativo.matches("\\d{4}-\\d{2}-\\d{2}"));
                    administrativo.setfechaNacimiento(fechaNacimientoAdministrativo);

                    // Solicitar y establecer el RUN del administrativo
                    int runAdministrativo;
                    do {
                        System.out.println("Ingrese el RUN del administrativo (formato sin guion, 8 dígitos):");
                        String input = scanner.next();
                        if (input.matches("\\d+")) {
                            runAdministrativo = Integer.parseInt(input);
                        } else {
                            System.out.println("ERROR: Debe ingresar un número para el RUN.");
                            runAdministrativo = -1;
                        }
                    } while (String.valueOf(runAdministrativo).length() != 8);
                    administrativo.setrun(runAdministrativo);

                    // Solicitar y establecer los demás datos del administrativo
                    System.out.println("Ingrese el área del administrativo:");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    administrativo.setarea(scanner.nextLine());
                    System.out.println("Ingrese la experiencia previa del administrativo:");
                    administrativo.setexperienciaPrevia(scanner.nextLine());
                    contenedor.almacenarAdministrativo(administrativo);
                    System.out.println("El Administrativo ha sido agregado correctamente:");
                    administrativo.analizarUsuario();
                    break;

                case 4:
                    // Almacenar Capacitación
                    Capacitacion capacitacion = new Capacitacion();
                    // Solicitar y establecer los datos de la capacitación
                    System.out.println("Ingrese el identificador de la capacitación:");
                    capacitacion.setIdentificador(scanner.nextInt());
                    System.out.println("Ingrese el RUN del cliente asociado a la capacitación:");
                    capacitacion.setRutCliente(scanner.nextInt());
                    System.out.println("Ingrese el día de la capacitación (formato YYYY-MM-DD):");
                    scanner.nextLine(); // Limpiamos el buffer de entrada
                    capacitacion.setDia(scanner.nextLine());
                    // Solicitar y establecer la hora de la capacitación
                    String hora;
                    do {
                        System.out.println("Ingrese la hora de la capacitación (formato HH:mm):");
                        hora = scanner.nextLine();
                    } while (!hora.matches("\\d{2}:\\d{2}"));
                    capacitacion.setHora(hora);
                    System.out.println("Ingrese el lugar de la capacitación:");
                    capacitacion.setLugar(scanner.nextLine());
                    System.out.println("Ingrese la duración de la capacitación:");
                    capacitacion.setDuracion(scanner.nextLine());
                    System.out.println("Ingrese la cantidad de asistentes a la capacitación:");
                    capacitacion.setCantidadAsistentes(scanner.nextInt());
                    contenedor.almacenarCapacitacion(capacitacion);
                    System.out.println("La Capacitación ha sido agregada correctamente:");
                    capacitacion.mostrarDetalle();
                    break;

                case 5:
                    // Eliminar Usuario
                    System.out.println("Ingrese el RUN del usuario que desea eliminar:");
                    int runEliminar = scanner.nextInt();
                    contenedor.eliminarUsuario(runEliminar);
                    break;
                    
                case 6:
                    // Listar Usuarios
                    contenedor.listarUsuarios();
                    scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt() o next()
                    break;

                case 7: // Listar Usuarios por tipo
                    System.out.print("Ingrese el tipo de usuario (Cliente, Profesional, Administrativo): ");
                    String tipo = scanner.next();
                    contenedor.listarUsuariosPorTipo(tipo);
                    scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt() o next()
                    break;

                case 8:
                    contenedor.listarCapacitaciones();
                    scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt() o next()
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");

            }
        } while (opcion != 9);

        scanner.close();
    }
}