package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r;

        System.out.print("Ingrese el radio: ");
        r = sc.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        double longitud = 2 * Math.PI * r;

        System.out.println("AREA DEL CIRCULO: " + area);
        System.out.println("LONGITUD DE LA CIRCUNFERENCIA: " + longitud);
    }
}