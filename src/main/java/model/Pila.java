
package model;

import java.util.LinkedList;

/**
 *
 * @author aldai
 * @param <E>
 */
public interface Pila<E>{
  
    void insertar(E x);
    E obtener();
    E eliminar();
    boolean buscar(E x);
    boolean pilaVacia();
    String mostrar();
    int tamaño();
    void imprimir();

    LinkedList<Regalo> getPila();
    
}
