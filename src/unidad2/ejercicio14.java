package unidad2;

import java.util.Scanner;

public class ejercicio14 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de vehículos: ");
        int n = teclado.nextInt();

        int[] pagos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Pago: ");
            pagos[i] = teclado.nextInt();
        }

        int entre2000y20000 = 0;
        int mayor20000 = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += pagos[i];

            if (pagos[i] >= 2000 && pagos[i] <= 20000) {
                entre2000y20000++;
            } else {
                mayor20000++;
            }
        }

        System.out.println("Pagos entre 2.000 y 20.000: " + entre2000y20000);
        System.out.println("Pagos mayores a 20.000: " + mayor20000);
        System.out.println("Total recaudado: " + total);
    }
}
