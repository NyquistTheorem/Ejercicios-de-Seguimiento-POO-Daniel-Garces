package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edadJuan, edadAlberto, edadAna, edadMama;

        System.out.print("Ingrese la edad de Juan: ");
        edadJuan = teclado.nextInt();

        edadAlberto = 2 * edadJuan / 3;
        edadAna = 4 * edadJuan / 3;
        edadMama = edadJuan + edadAlberto + edadAna;

        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edadAlberto);
        System.out.println("Juan: " + edadJuan);
        System.out.println("Ana: " + edadAna);
        System.out.println("Mama: " + edadMama);
    }
}