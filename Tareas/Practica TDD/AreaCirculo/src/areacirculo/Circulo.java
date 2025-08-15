/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areacirculo;

/**
 *
 * @author cj
 */
public class Circulo {
    
    public static double calcularArea(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * radio * radio;
    }
}
