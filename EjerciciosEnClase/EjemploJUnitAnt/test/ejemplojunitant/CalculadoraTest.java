/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejemplojunitant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

private Calculadora calc;

// Este método se ejecuta ANTES de cada @Test
@Before
public void setUp() {
System.out.println("Iniciando prueba...");
calc = new Calculadora(); // inicializamos el objeto a probar
}

// Este método se ejecuta DESPUÉS de cada @Test
@After
public void tearDown() {
System.out.println("Finalizando prueba.");
calc = null; // liberamos recursos
}

@Test
public void testSumar() {
int resultado = calc.sumar(5, 3);

assertEquals(8, resultado);
}

@Test
public void testRestar() {
int resultado = calc.restar(10, 4);
assertEquals(6, resultado);
}

@Test(expected = IllegalArgumentException.class)
public void testDividirPorCero() {
calc.dividir(5, 0);
}
}
