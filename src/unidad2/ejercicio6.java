package unidad2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de personas: ");
        int n = teclado.nextInt();

        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Edad: ");
            edades[i] = teclado.nextInt();
        }

        int entre18y30 = 0;
        int mayor30 = 0;
        int sumaEdades = 0;

        for (int i = 0; i < n; i++) {
            sumaEdades += edades[i];

            if (edades[i] >= 18 && edades[i] <= 30) {
                entre18y30++;
            } else if (edades[i] > 30) {
                mayor30++;
            }
        }

        System.out.println("Entre 18 y 30 años: " + entre18y30);
        System.out.println("Mayores de 30 años: " + mayor30);
        System.out.println("Suma edades: " + sumaEdades);
    }
}
