package unidad2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de paquetes: ");
        int n = teclado.nextInt();

        int[] pesos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Peso: ");
            pesos[i] = teclado.nextInt();
        }

        int entre1y20 = 0;
        int mayor20 = 0;
        int totalPeso = 0;

        for (int i = 0; i < n; i++) {
            totalPeso += pesos[i];

            if (pesos[i] >= 1 && pesos[i] <= 20) {
                entre1y20++;
            } else {
                mayor20++;
            }
        }

        System.out.println("Entre 1 y 20 kg: " + entre1y20);
        System.out.println("Mayores a 20 kg: " + mayor20);
        System.out.println("Peso total: " + totalPeso);
    }
}
