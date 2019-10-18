/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author aldai
 */
public class ColaColTest {
    
    
    private Cola<Persona> miCola;
    
    /**
     * antes de cada método inicializa la cola a una cola vacía
     */
    @Before
    public void setUp() {
        miCola = new ColaCol();
    }

    /**
     * Test of insertar method, of class ColaCol.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Persona x = new Persona("un nombre", 25, "una vez a la semana");
        miCola.insertar(x);
        assertEquals(1,miCola.tamaño());
    }

    /**
     * Test of obtener method, of class ColaCol.
     */
    @Test
    public void testObtener() {
        System.out.println("obtener");
        Persona expResult = new Persona("un nombre", 25, "una vez a la semana");
        miCola.insertar(expResult);
        Persona result = miCola.obtener();
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class ColaCol.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        
        Persona x = new Persona("otro nombre", 22, "Trasvesti");
        miCola.insertar(x);
        
        Persona expResult = new Persona("un nombre", 25, "una vez a la semana");
        miCola.insertar(expResult);
        
        // obtener le tamaño
        int tamaño = miCola.tamaño();
        //verificar el tamaño, debe ser 2
        assertEquals(2, tamaño);
        Persona result = miCola.eliminar();
        assertEquals(x, result);
        //verificar de nuevo el tamaño debe ser 1
        tamaño = miCola.tamaño();
        assertEquals(1, tamaño);
    }

    /**
     * Test of tamaño method, of class ColaCol.
     */
    @Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        int expResult = 0;
        int result = miCola.tamaño();
        assertEquals(expResult, result);
        Persona x = new Persona("otro nombre", 22, "Trasvesti");
        miCola.insertar(x);
        
        Persona y = new Persona("un nombre", 25, "una vez a la semana");
        miCola.insertar(y);
        result = miCola.tamaño();
        assertEquals(2, result);
    }

    /**
     * Test of buscar method, of class ColaCol.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Persona x = new Persona("otro nombre", 22, "Trasvesti");
        
        
        boolean result = miCola.buscar(x);
        assertFalse(result);
        
        miCola.insertar(x);
        result = miCola.buscar(x);
        assertTrue(result);
    }

    /**
     * Test of mostrar method, of class ColaCol.
     */
    @Test
    @Ignore
    public void testMostrar() {
        System.out.println("mostrar");
        ColaCol instance = new ColaCol();
        String expResult = "";
        String result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of colaVacia method, of class ColaCol.
     */
    @Test
    public void testColaVacia() {
        System.out.println("colaVacia");
        boolean result = miCola.colaVacia();
        assertTrue(result);
         Persona x = new Persona("otro nombre", 22, "Trasvesti");
        miCola.insertar(x);
        result = miCola.colaVacia();
        assertFalse(result);
    }

    /**
     * Test of toString method, of class ColaCol.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ColaCol instance = new ColaCol();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCol method, of class ColaCol.
     */
    @Test
    @Ignore
    public void testGetCol() {
        System.out.println("getCol");
        ColaCol instance = new ColaCol();
        LinkedList<Persona> expResult = null;
        LinkedList<Persona> result = instance.getCol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class ColaCol.
     */
    @Test
    @Ignore
    public void testImprimir() {
        System.out.println("imprimir");
        ColaCol instance = new ColaCol();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
