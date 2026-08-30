package ejercicio1;

public class MainEjercicio1_a {

    public static void main(String[] args) {
        try {
            new Persona("AA202020", "Juan", "Pérez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@gmail.com");
            Persona.exVerificarDNI("AA202020");
        } catch (ExVerificarDNI e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }
    }
}