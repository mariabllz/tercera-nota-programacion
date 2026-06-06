package unidad2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de operarios: ");
        int n = teclado.nextInt();

        int[] produccion = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Producción: ");
            produccion[i] = teclado.nextInt();
        }

        int entre10y100 = 0;
        int mayor100 = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += produccion[i];

            if (produccion[i] >= 10 && produccion[i] <= 100) {
                entre10y100++;
            } else {
                mayor100++;
            }
        }

        System.out.println("Entre 10 y 100: " + entre10y100);
        System.out.println("Mayores a 100: " + mayor100);
        System.out.println("Producción total: " + total);
    }
}
