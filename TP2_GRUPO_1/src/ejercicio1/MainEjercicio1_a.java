package ejercicio1;

public class MainEjercicio1_a {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------\nCreación de personas y verificación de DNI:\n-------------------------------------------");
        
        Persona persona1 = new Persona("AA202020", "Juan", "Pérez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@gmail.com");
        try {
        	Persona.exVerificarDNI(persona1.getDni());
        	System.out.println("La Persona \"" + persona1.getNombre() + " " + persona1.getApellido() + "\" con DNI \"" + persona1.getDni() + "\" fue agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Error al crear la persona " + persona1.getNombre() + " " + persona1.getApellido() + ": " + e.getMessage());
        }
        
        // 4b crear la 2da persona y deberia dar dni correcto
        Persona persona2 = new Persona("20202020", "Germán", "Martitegui", 60, null, "Masculino", "Delta del Tigre", "1134567214", "bestChefARG@gmail.com");
        try {
        	Persona.exVerificarDNI(persona2.getDni());
        	System.out.println("La Persona \"" + persona2.getNombre() + " " + persona2.getApellido() + "\" con DNI \"" + persona2.getDni() + "\" fue agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Error al crear la persona " + persona2.getNombre() + " " + persona2.getApellido() + ": " + e.getMessage());
        }
        System.out.println("-------------------------------------------");
    }
}