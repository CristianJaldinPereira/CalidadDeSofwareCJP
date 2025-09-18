/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package primer_parcial;

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
public class Celsius_FahrenheitTest {
    
    public Celsius_FahrenheitTest() {
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
     * Test of convertir method, of class Celsius_Fahrenheit.
     */
   @Test
    public void testTemperaturaPositiva() {
        double result = Celsius_Fahrenheit.convertir(25);
        assertEquals(77.0, result, 0.0001);
    }

    @Test
    public void testTemperaturaNegativa() {
        double result = Celsius_Fahrenheit.convertir(-10);
        assertEquals(14.0, result, 0.0001);
    }

    @Test
    public void testTemperaturaCero() {
        double result = Celsius_Fahrenheit.convertir(0);
        assertEquals(32.0, result, 0.0001);
    }

    @Test
    public void testTemperaturaDecimal() {
        double result = Celsius_Fahrenheit.convertir(36.6);
        assertEquals(97.88, result, 0.01); 
    }

    @Test
    public void testTemperaturaGrande() {
        double result = Celsius_Fahrenheit.convertir(1000);
        assertEquals(1832.0, result, 0.0001);
    }
    
}


    