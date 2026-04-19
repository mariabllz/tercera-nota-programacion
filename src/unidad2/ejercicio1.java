package unidad2;
public class ejercicio1 {
    public static void main(String[] args) {
        int valor = 7;
        cambiarValor(valor);
        System.out.println("Valor después de cambiarValor: " + valor);
    }

    public static void cambiarValor(int valor) {
        valor = 2;
    }
}

