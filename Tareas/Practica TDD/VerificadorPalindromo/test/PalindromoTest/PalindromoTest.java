/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PalindromoTest;

import verificadorpalindromo.Palindromo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cj
 */
public class PalindromoTest {
    
    public PalindromoTest() {
    }
    
    @Test
    public void testEsPalindromoConPalabraSimple() {
    // Se espera que "reconocer" sea un palíndromo, por lo tanto, true
    assertTrue(Palindromo.esPalindromo("reconocer"));
    }
    @Test
    public void testNoEsPalindromo() {
    // Se espera que "hola" no sea un palíndromo
    assertFalse(Palindromo.esPalindromo("hola"));
    }
    @Test
    public void testEsPalindromoConFrase() {
    // Se espera que la frase sea un palíndromo ignorando espacios y puntuación
    assertTrue(Palindromo.esPalindromo("anita lava la tina"));
    }
    @Test
    public void testEsPalindromoConMayusculasYPuntuacion() {
    // Se espera que la frase con mayúsculas y signos de puntuación sea un palíndromo
    assertTrue(Palindromo.esPalindromo("A man, a plan, a canal: Panama"));
    }
    @Test  
    public void testEsPalindromoConFraseVacia() {
    // La cadena vacía se considera un palíndromo
    assertTrue(Palindromo.esPalindromo(""));
    }

}
