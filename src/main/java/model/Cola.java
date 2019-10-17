
package model;

/**
 *
 * @author aldai
 * @param <T>
 */
public interface Cola<E> {
    void insertar(E x);
    E obtener();
    E eliminar();
    int tamaño();
    boolean buscar(E x);
    String mostrar();
    boolean colaVacia();
}
