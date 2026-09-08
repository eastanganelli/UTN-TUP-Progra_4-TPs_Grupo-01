package ejercicio1;


import java.util.TreeSet;
import java.util.Iterator;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		

        empleados[0] = new Empleado("Gerente", "12345678", "Juan", "Perez", 35, java.time.LocalDate.of(1988, 5, 20), "Masculino", "Calle Falsa 123", "1234567890", "juan.perez@empresa.com");
        empleados[1] = new Empleado("Analista", "87654321", "Maria", "Gomez", 28, java.time.LocalDate.of(1995, 3, 15), "Femenino", "Avenida Siempre Viva 456", "0987654321", "maria.gomez@empresa.com");
        empleados[2] = new Empleado("Desarrollador", "11223344", "Carlos", "Lopez", 30, java.time.LocalDate.of(1993, 7, 10), "Masculino", "Calle Luna 789", "1122334455", "carlos.lopez@empresa.com");
        empleados[3] = new Empleado("Diseñador", "12123456", "Ana", "Martinez", 27, java.time.LocalDate.of(1996, 9, 5), "Femenino", "Calle Sol 321", "5566778899", "ana.martinez@empresa.com");
        empleados[4] = new Empleado("Especialista", "99887766", "Luis", "Rodriguez", 32, java.time.LocalDate.of(1991, 12, 10), "Masculino", "Avenida Principal 1000", "9988776655", "luis.rodriguez@empresa.com");

        TreeSet<Empleado> treeSetEmpleados = new TreeSet<Empleado>();
        
        for (Empleado emp : empleados) {
            treeSetEmpleados.add(emp);
        }

        Iterator<Empleado> iteradorEmpleadovich = treeSetEmpleados.iterator();
        
        while(iteradorEmpleadovich.hasNext()) {
        	System.out.println(iteradorEmpleadovich.next());
        }
        
        /*
        for (Empleado emp : treeSetEmpleados) {
            System.out.println(emp.getNombre() + " - Legajo: " + emp.getLegajo()); 
        }
        */
	}
}
