package ejercicio1;

public class MainEjercicio1_a {

    public static void main(String[] args) {
        try {
            new Persona("AA202020", "Juan", "Pérez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@gmail.com");
            Persona.exVerificarDNI("AA202020");
        } catch (ExVerificarDNI e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }
        
        // 4b crear la 2da persona y deberia dar dni correcto
        try {
            new Persona("20202020", "Germán", "Martitegui", 60, null, "Masculino", "Delta del Tigre", "1134567214", "bestChefARG@gmail.com");
            Persona.exVerificarDNI("20202020");
        } catch (ExVerificarDNI e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }        
    }
}