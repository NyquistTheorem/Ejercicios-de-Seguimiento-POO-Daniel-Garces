package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {

        String nom = "ELIAS JOSE";
        int nht = 53;
        double vhn = 4000;

        double salario;

        if (nht > 40) {

            int het = nht - 40;

            if (het > 8) {

                int hee8 = het - 8;

                salario = (40 * vhn)
                        + (8 * 2 * vhn)
                        + (hee8 * 3 * vhn);

            } else {

                salario = (40 * vhn)
                        + (het * 2 * vhn);
            }

        } else {
            salario = nht * vhn;
        }

        System.out.println("EL TRABAJADOR " + nom + " DEVENGÓ: $" + salario);
    }
}