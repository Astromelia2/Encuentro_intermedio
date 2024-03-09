package EncuentroIntermedio;
public class Big0Demo {

    // Método para calcular T(n)
    public static long T(int n) {
        return 4 * (long) Math.pow(n, 3) - 2 * n - 1;
    }

    // Método para calcular c * n^3
    public static long cTimesN3(int n, int c) {
        return c * (long) Math.pow(n, 3);
    }
}