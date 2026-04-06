package unidad1.parcial;
import java.util.Scanner ;
public class parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine() ;

        System.out.println("Ingrese su documento");
        String documento = sc.nextLine() ;

        System.out.println("Ingrese su puntaje de desempeño de 0 a 100");
        int puntaje = sc.nextInt() ;

        String clasificacion;

        if (puntaje < 0 || puntaje > 100) {
            System.out.println("El puntaje es invalido");
        }
        
        if (puntaje <= 59) {
            clasificacion = "Desempeño insuficiente";
        } else if (puntaje <=74) {
            clasificacion = "Desempeño aceptable" ;
        } else if (puntaje <= 89) {
            clasificacion = "Buen desempeño" ;
        } else (puntaje <= 100) {
            clasificacion = "Desempeño sobresaliente" ;
        }

        System.out.println("Nombre :"+ nombre);
        System





        sc.close();
    }
}

