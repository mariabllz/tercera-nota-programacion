package unidad2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de ventas: ");
        int n = teclado.nextInt();

        double[] ventas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Venta: ");
            ventas[i] = teclado.nextDouble();
        }

        int entre50y500 = 0;
        int mayor500 = 0;
        double totalVentas = 0;

        for (int i = 0; i < n; i++) {
            totalVentas += ventas[i];

            if (ventas[i] >= 50 && ventas[i] <= 500) {
                entre50y500++;
            } else {
                mayor500++;
            }
        }

        System.out.println("Ventas entre 50 y 500: " + entre50y500);
        System.out.println("Ventas mayores a 500: " + mayor500);
        System.out.println("Total vendido: " + totalVentas);
    }
}
