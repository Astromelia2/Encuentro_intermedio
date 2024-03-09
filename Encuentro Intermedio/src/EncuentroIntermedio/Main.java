package EncuentroIntermedio;

import static EncuentroIntermedio.Big0Demo.T;
import static EncuentroIntermedio.Big0Demo.cTimesN3;

public class Main {
    public static void main(String[] args) {
        int c = 4; // Elegimos una constante c mayor que 4
        int n0 = 1; // Elegimos n0 = 1 basándonos en la demostración matemática
        
        // Imprime los valores de T(n) y cn^3 para compararlos
        for (int n = n0; n <= 15; n++) { // Puedes aumentar el rango para ver más valores
            System.out.println("n: " + n);
            System.out.println("T(n): " + T(n));
            System.out.println("c * n^3: " + cTimesN3(n, c));
            System.out.println(); // Salto de línea para mejor legibilidad
        }
    }    
}