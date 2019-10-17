package model;

import java.util.LinkedList;

/**
 *
 * @author aldai
 */
public class ColaCol implements Cola<Persona> {
    
    private LinkedList<Persona> col = new LinkedList();

    @Override
    public void insertar(Persona x) {
         col.addLast(x);
    }

    @Override
    public Persona obtener() {
        return col.getFirst();
    }

    @Override
    public Persona eliminar() {
        return col.removeFirst();
    }

    @Override
    public int tamaño() {
        return col.size();
    }

    @Override
    public boolean buscar(Persona x) {
        return col.contains(x);
    }

    @Override
    public String mostrar() {
        return col.toString();
    }

    @Override
    public boolean colaVacia() {
        return col.isEmpty();
    }
}
