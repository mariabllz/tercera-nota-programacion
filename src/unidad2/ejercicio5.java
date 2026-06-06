package unidad2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de empleados: ");
        int n = teclado.nextInt();

        int[] sueldos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese sueldo: ");
            sueldos[i] = teclado.nextInt();
        }

        int entre100y300 = 0;
        int mayor300 = 0;
        int totalSueldos = 0;

        for (int i = 0; i < n; i++) {
            totalSueldos += sueldos[i];

            if (sueldos[i] >= 100 && sueldos[i] <= 300) {
                entre100y300++;
            } else {
                mayor300++;
            }
        }

        System.out.println("Entre 100 y 300: " + entre100y300);
        System.out.println("Mayores a 300: " + mayor300);
        System.out.println("Total sueldos: " + totalSueldos);
    }
}
