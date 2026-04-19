package unidad2;
class Persona{
    String nombre;
}
public class ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre= "Laura";
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignarPersona: " + persona.nombre);

    }
    public static void reasignarPersona(Persona persona) {
        persona = new Persona();
        persona.nombre= "Crsitina";
    }
}
