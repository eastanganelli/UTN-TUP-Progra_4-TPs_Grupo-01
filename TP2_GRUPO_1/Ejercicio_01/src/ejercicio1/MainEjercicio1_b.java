package ejercicio1;
import java.util.ArrayList;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersona = new ArrayList<Persona>(5);
        
        listaPersona.add(new Persona("20202020", "Germán", "Martitegui", 60, null, "Masculino", "Delta del Tigre", "1134567214", "bestChefARG@gmail.com"));
        listaPersona.add(new Persona("30303030", "María", "González", 25, null, "Femenino", "Calle 456", "987654321", "maria.gonzalez@gmail.com"));
        listaPersona.add(new Persona("AA202020", "Juan", "Pérez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@gmail.com"));
        listaPersona.add(new Persona("40404040", "Ana", "Rodríguez", 35, null, "Femenino", "Calle 789", "321654987", "ana.rodriguez@gmail.com"));
        listaPersona.add(new Persona("50505050", "Carlos", "López", 40, null, "Masculino", "Calle 321", "654987321", "carlos.lopez@gmail.com"));
	}

}
