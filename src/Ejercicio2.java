public class Ejercicio2 {}
    public static void main(String[] args) {

        double precioCamiseta = 25;
        double precioPantalon = 30;

        double descuento = 0.15;

        double camisetaConDescuento = precioCamiseta - (precioCamiseta * descuento);
        double pantalonConDescuento = precioPantalon - (precioPantalon * descuento);

        double segundaCamiseta = camisetaConDescuento - (camisetaConDescuento * 0.05);

        double total = camisetaConDescuento + pantalonConDescuento + segundaCamiseta;

        System.out.println("Precio camiseta con descuento: $" + camisetaConDescuento);
        System.out.println("Precio pantalón con descuento: $" + pantalonConDescuento);
        System.out.println("Precio segunda camiseta: $" + segundaCamiseta);
        System.out.println("Total a pagar: $" + total);
}
