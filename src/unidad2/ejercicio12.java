package unidad2;

import java.util.Scanner;

public class ejercicio12 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de clientes: ");
        int n = teclado.nextInt();

        int[] gastos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Gasto: ");
            gastos[i] = teclado.nextInt();
        }

        int entre20y100 = 0;
        int mayor100 = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += gastos[i];

            if (gastos[i] >= 20000 && gastos[i] <= 100000) {
                entre20y100++;
            } else {
                mayor100++;
            }
        }

        System.out.println("Entre 20.000 y 100.000: " + entre20y100);
        System.out.println("Mayores a 100.000: " + mayor100);
        System.out.println("Total recibido: " + total);
    }
}
