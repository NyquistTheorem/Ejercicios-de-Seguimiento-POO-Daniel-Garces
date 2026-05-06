package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {

        double suma = 0;
        int x = 20;
        int y;

        // Paso 3
        suma = suma + x;

        // Paso 4
        y = 40;

        // Paso 5: X = X + Y^2
        x = x + (int) Math.pow(y, 2);

        // Paso 6: SUMA = SUMA + X / Y
        suma = suma + (double) x / y;

        // Paso 7
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}