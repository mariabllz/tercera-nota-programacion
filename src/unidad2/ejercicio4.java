package unidad2
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantPersonas;
        int cantPersonasEntre18Y30 = 0;
        int cantPersonasMayores30 = 0;
        int sumaEdades = 0;

        System.out.println("Ingrese la cantidad de personas");
        cantPersonas = sc.nextInt();

        int[] edades = new int[cantPersonas];

        for (int i = 0; i < cantPersonas; i++) {
            do {
                System.out.println("Ingrese la edad de la persona" + (i+1));
                edades[i] = sc.nextInt ;

                if ( edades[i] < 18 ){
                    System.out.println("Edad inválida, debe ser entre 18 y 30");
                }

            } while ( edades[i] < 18 );

            if (edad >= 18 && edad <= 30){
                cantPersonasEntre18Y30 ++ ;
            } else{
                cantPersonasMayores30 ++ ;
            }
            
            sumaEdades += edades[i] ;
        }

        System.out.println("Personas entre 18 y 30 años: " + cantPersonasEntre18Y30);
        System.out.println("Personas mayores a 30: " + cantPersonasMayores30);
        System.out.println("Suma de edades: " + sumaEdades);
        
        scanner.close();
    }
}

