package unidad2;

import java.util.Scanner;

public class ejercicio8 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = teclado.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota: ");
            notas[i] = teclado.nextDouble();
        }

        int entre3y4 = 0;
        int mayor4 = 0;
        double sumaNotas = 0;

        for (int i = 0; i < n; i++) {
            sumaNotas += notas[i];

            if (notas[i] >= 3.0 && notas[i] <= 4.0) {
                entre3y4++;
            } else if (notas[i] > 4.0) {
                mayor4++;
            }
        }

        System.out.println("Notas entre 3.0 y 4.0: " + entre3y4);
        System.out.println("Notas mayores a 4.0: " + mayor4);
        System.out.println("Suma total notas: " + sumaNotas);
    }
}
