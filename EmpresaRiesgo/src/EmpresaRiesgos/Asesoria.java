package EmpresaRiesgos;

/**
 * la interfaz Asesoria parece ser coherente con los principios SOLID, específicamente con el SRP y el ISP.
 * Principio de segregación de interfaces: La clase Capacitacion no implementa ninguna interfaz, 
 * por lo que no podemos aplicar directamente el principio de segregación de interfaces en esta clase.
 * 
 * La interfaz Asesoria define un contrato para analizar usuarios en el contexto de la asesoría.
 * Representa la capacidad de un objeto para realizar un análisis específico del usuario.
 */
public interface Asesoria {

    /**
     * Realiza un análisis del usuario.
     * Este método debe ser implementado por las clases que implementen la interfaz Asesoria
     * para realizar un análisis específico del usuario, como mostrar detalles o estadísticas.
     */
    void analizarUsuario();
}