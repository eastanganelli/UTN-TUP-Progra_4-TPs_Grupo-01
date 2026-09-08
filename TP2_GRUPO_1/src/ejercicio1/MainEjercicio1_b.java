package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(5);
        
        listaEmpleados.add(new Empleado("Chef ","20202020", "Germán", "Martitegui", 60, null, "Masculino", "Delta del Tigre", "1134567214", "bestChefARG@gmail.com"));
        listaEmpleados.add(new Empleado("Abogada ", "30303030", "María", "González", 25, null, "Femenino", "Calle 456", "987654321", "maria.gonzalez@gmail.com"));
        listaEmpleados.add(new Empleado("Comerciante ", "AA202020", "Juan", "Pérez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@gmail.com"));
        listaEmpleados.add(new Empleado("Medica ","40404040", "Ana", "Rodríguez", 35, null, "Femenino", "Calle 789", "321654987", "ana.rodriguez@gmail.com"));
        listaEmpleados.add(new Empleado("Analista de Riesgo ","50505050", "Carlos", "López", 40, null, "Masculino", "Calle 321", "654987321", "carlos.lopez@gmail.com"));
        
        Iterator<Empleado> iteradorEmpleados = listaEmpleados.iterator();
        
        boolean primero = true;
        while(iteradorEmpleados.hasNext()) {
            if(primero) {
                System.out.println("------------------------------");
                primero = false;
            }
            System.out.println(iteradorEmpleados.next());
            System.out.println("------------------------------");
        }
	}
}
