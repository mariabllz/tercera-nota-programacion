package unidad2;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de vehículos: ");
        int n = teclado.nextInt();

        int[] km = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Kilómetros: ");
            km[i] = teclado.nextInt();
        }

        int entre10y300 = 0;
        int mayor300 = 0;
        int totalKm = 0;

        for (int i = 0; i < n; i++) {
            totalKm += km[i];

            if (km[i] >= 10 && km[i] <= 300) {
                entre10y300++;
            } else {
                mayor300++;
            }
        }

        System.out.println("Entre 10 y 300 km: " + entre10y300);
        System.out.println("Mayores a 300 km: " + mayor300);
        System.out.println("Total kilómetros: " + totalKm);
    }
}
