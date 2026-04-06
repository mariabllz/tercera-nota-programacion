package unidad1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media es: " + media);

        entrada.close();
    }
}
