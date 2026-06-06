package unidad2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de apartamentos: ");
        int n = teclado.nextInt();

        int[] consumo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Consumo: ");
            consumo[i] = teclado.nextInt();
        }

        int entre1y50 = 0;
        int mayor50 = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += consumo[i];

            if (consumo[i] >= 1 && consumo[i] <= 50) {
                entre1y50++;
            } else {
                mayor50++;
            }
        }

        System.out.println("Entre 1 y 50: " + entre1y50);
        System.out.println("Mayores a 50: " + mayor50);
        System.out.println("Consumo total: " + total);
    }
}
