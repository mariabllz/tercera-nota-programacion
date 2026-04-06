package unidad1;
public class Ejercicio3 {
     public static void main(String[] args) {

        int dineroInicial = 1000;
        int retiroSemanal = 200;
        int semanas = 4;

        int totalRetirado = retiroSemanal * semanas;
        int dineroFinal = dineroInicial - totalRetirado;

        System.out.println("Dinero inicial: $" + dineroInicial);
        System.out.println("Total retirado en el mes: $" + totalRetirado);
        System.out.println("Dinero restante: $" + dineroFinal);
    }
}
