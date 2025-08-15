/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import areacirculo.Circulo;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author cj
 */
public class CirculoTest {

    @Test
    public void testRadioPositivo() {
        double radio = 5;
        double areaEsperada = Math.PI * 25; // 5^2 = 25
        assertEquals(areaEsperada, Circulo.calcularArea(radio), 0.0001);
    }

    @Test
    public void testRadioCero() {
        double radio = 0;
        double areaEsperada = 0;
        assertEquals(areaEsperada, Circulo.calcularArea(radio), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRadioNegativo() {
        double radio = -3;
        Circulo.calcularArea(radio);
    }

    @Test
    public void testRadioGrande() {
        double radio = 1000;
        double areaEsperada = Math.PI * 1000 * 1000;
        assertEquals(areaEsperada, Circulo.calcularArea(radio), 0.0001);
    }

    @Test
    public void testRadioDecimal() {
        double radio = 3.5;
        double areaEsperada = Math.PI * 3.5 * 3.5;
        assertEquals(areaEsperada, Circulo.calcularArea(radio), 0.0001);
    }

}
