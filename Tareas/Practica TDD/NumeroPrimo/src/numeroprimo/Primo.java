/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroprimo;

/**
 *
 * @author cj
 */
public class Primo {
     public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // 0, 1 y negativos no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
