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
public class PilaVectTest {

    /**
     * pila genérica a probar. ojo este es el contrato únicamente
     */
    private Pila<Regalo> instance;

    /**
     * antes de cada prueba le asignaos una implementación
     */
    @Before
    public void setUp() {
        instance = new PilaVect();
    }

    /**
     * Test of insertar method, of class PilaVect.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Regalo x = new Regalo("caro", 9999.9);
        assertEquals(0, instance.tamaño());
        instance.insertar(x);
        assertEquals(1, instance.tamaño());
    }

    /**
     * Para esta prueba se está insertando y obteniendo el dato y verifica que
     * el tamaño se mantenga igual ya que el obtener solo obtine pero no debe
     * eliminar
     */
    @Test
    public void alObtenerNoSeDEbeCambiarLACantidadDeElementos() {
        System.out.println("obtener");

        Regalo expResult = new Regalo("caro", 9999.9);
        instance.insertar(expResult);
        Regalo result = instance.obtener();
        assertEquals(expResult, result); // si solo hay uno regresarlo
        assertEquals(1, instance.tamaño());

        Regalo otroRegalo = new Regalo("caro", 9999.9);
        instance.insertar(otroRegalo);
        assertEquals(2, instance.tamaño()); //verificamos que se haya insertado y que haya dos

        result = instance.obtener();
        assertEquals(otroRegalo, result); //verificamos que se obtenga el último que entró
        assertEquals(2, instance.tamaño()); // el tamaño no debe de cambiar aquí probamos que no se elimine por error
    }

    /**
     * Test of eliminar method, of class PilaVect.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");

        Regalo expResult = null;
        assertEquals(0, instance.tamaño());
        assertTrue(instance.pilaVacia());
        Regalo result = instance.eliminar();
        assertEquals(0, instance.tamaño());
        assertTrue(instance.pilaVacia());
        assertEquals(expResult, result); // si no tiene elementos debe regresar null
        
        
        //segunda parte de la prueba, esto podría ser otra prueba individual pero como me da flojera lo pondré acá xD
        expResult = new Regalo("caro", 9999.9);
        instance.insertar(expResult);
        assertFalse(instance.pilaVacia());
        result = instance.eliminar();
        assertEquals(expResult, result); // debe ser el regalo que se acaba de insertar s solamente hay uno
        assertTrue(instance.pilaVacia());
        
        
        //tercera parte de la prueba, con más de un elemento
        instance.insertar(expResult);
        instance.insertar(new Regalo("exótico", -3));
        assertFalse(instance.pilaVacia());
        result = instance.eliminar();
        assertEquals(1, instance.tamaño()); // experado, actual es el orden de los parametros
        assertEquals(new Regalo("exótico", -3), result);
        assertFalse(instance.pilaVacia());
    }

    /**
     * Test of buscar method, of class PilaVect.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Regalo x = new Regalo("pokemon de agua-kt", 66.8);
        boolean result = instance.buscar(x);
        assertFalse(result);//nunca se va a hallar nada en un coso de estos vacío
        //luego se peuden agregar más pruebas acá xD
    }

    /**
     * Test of pilaVacia method, of class PilaVect.
     */
    @Test
    public void testPilaVacia() {
        System.out.println("pilaVacia");

        
        boolean result = instance.pilaVacia();
        assertTrue(result); // una pila vacía está vacía xD
        double biencaroWe = 1000.99;
        instance.insertar(new Regalo("strella porno", biencaroWe));
        assertFalse(instance.pilaVacia());
    }

    /**
     * Test of mostrar method, of class PilaVect.
     */
    @Test
    @Ignore
    public void testMostrar() {
        System.out.println("mostrar");

        String expResult = "";
        String result = instance.mostrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamaño method, of class PilaVect.
     */
    @Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        int expResult = 0;
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // se pueden agregar más pruebas pero realmente ya está más que probado en otros métodos de esta clase
    }

    /**
     * Test of toString method, of class PilaVect.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");

        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPila method, of class PilaVect.
     */
    @Test
    @Ignore
    public void testGetPila() {
        System.out.println("getPila");

        LinkedList<Regalo> expResult = null;
        LinkedList<Regalo> result = instance.getPila(); // error de diseño, pila no tien el método getPila
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class PilaVect.
     */
    @Test
    @Ignore
    public void testImprimir() {
        System.out.println("imprimir");

        instance.imprimir(); // error de diseño, pila no tien el método imprimir
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
