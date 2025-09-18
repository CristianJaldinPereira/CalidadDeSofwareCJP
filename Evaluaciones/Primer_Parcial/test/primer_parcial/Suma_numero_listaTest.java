/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package primer_parcial;

import java.util.Arrays;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CJP
 */
public class Suma_numero_listaTest {
    
    public Suma_numero_listaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Suma_numero_lista.
     */
    
    @Test
    public void testListaPositivos() {
        int resultado = Suma_numero_lista.sumar(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, resultado);
    }

    @Test
    public void testListaNegativos() {
        int resultado = Suma_numero_lista.sumar(Arrays.asList(-1, -2, -3));
        assertEquals(-6, resultado);
    }

    @Test
    public void testListaVacia() {
        int resultado = Suma_numero_lista.sumar(Collections.emptyList());
        assertEquals(0, resultado);
    }

    @Test
    public void testListaMixta() {
        int resultado = Suma_numero_lista.sumar(Arrays.asList(10, -5, 7, -2));
        assertEquals(10, resultado);
    }

    @Test
    public void testListaUnElemento() {
        int resultado = Suma_numero_lista.sumar(Arrays.asList(42));
        assertEquals(42, resultado);
    }
    
}
