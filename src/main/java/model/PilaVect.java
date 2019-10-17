
package model;


import java.util.LinkedList;

/**
 *
 * @author aldai
 */
public class PilaVect implements Pila<Regalo>{
    
    private LinkedList<Regalo> pila = new LinkedList();
    @Override
    public void insertar(Regalo x) {
        pila.addLast(x);
    }

    @Override
    public Regalo obtener() {
        return pila.getLast();
    }

    @Override
    public Regalo eliminar() {
        return pila.removeLast();
    }

    @Override
    public boolean buscar(Regalo x) {
        return pila.contains(x);
    }

    @Override
    public boolean pilaVacia() {
        return pila.isEmpty();
    }

    @Override
    public String mostrar() {
        return pila.toString();
    }
    
    @Override
    public int tamaño() {
        return pila.size();
    }
     @Override
 public String toString(){
     String tipo="";
     Regalo r = new Regalo();
    return r.getTipo() + " / " + r.getValor();
 }
}
