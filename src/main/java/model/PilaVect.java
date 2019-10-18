
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
        if(pilaVacia()){
            return null; // a este patrón se le conoce como early termination o early return
            // a muchos no les gusta, pero es mega eficiente, si no se dan las condiciones simplemente no crre el resto del método
        }
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
     Regalo r = new Regalo();
    return r.getTipo() + " / " + r.getValor();
 }

    public LinkedList<Regalo> getPila() {
        return pila;
    }
    
    public void imprimir(){
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i).toString());
        }
    }
}
