package unidad1.parcial;
import java.util.Scanner;
public class parcial2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes");
        int estudiantes = sc.nextInt();
        double[] notas = new double[estudiantes];

        for (int i = 0; i < estudiantes; i++) {
             System.out.println("Ingrese la nota del estudiante" + (i +1) + ":");
            notas[i] = sc.nextDouble();

        }

        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];
        int aprobados = 0;
        int reprobados = 0;
           
        for (int i = 0; i < notas.length; i++) {
                suma += notas[i];
                if (notas [i] > mayor){
                    mayor = notas[i];
                }
               if (notas [i] < menor) {
                menor = notas[i];
               }
               if (notas [i] <= 3.0){
                aprobados++;
               } else {
                reprobados++;
               }
        }

         double promedio = suma / estudiantes ;

         System.out.println("notas ingresadas");
        
            for (int i= 0; i < estudiantes; i++) {
                System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
            }

        System.out.println("RESUMEN");
        System.out.println("Nota más alta " + mayor);
        System.out.println("Nota más baja " + menor);
        System.out.println("Promedio " + promedio);
        System.out.println("Aprobados " + aprobados);
        System.out.println("Reprobados " + reprobados);

         sc.close();

        
    }
}
