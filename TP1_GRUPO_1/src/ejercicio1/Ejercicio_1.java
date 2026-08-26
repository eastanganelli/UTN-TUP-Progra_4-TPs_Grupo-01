package ejercicio1;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Impresión de empleado 1 con datos
        Empleado empleado1 = new Empleado("Gerente", "12345678", "Juan", "Perez", 30, null, "Masculino", "Calle 123", "123456789", "juan.perez@email.com");
        System.out.println(empleado1.toString());
        
        // Impresión del proximo legajo
        System.out.println("El proximo legajo es: " + Empleado.devuelveProximoLegajo() + "\n");
        
        // Impresión de empleado 2 con datos
        Empleado empleado2 = new Empleado("Supervisor", "91011121", "Alberto", "Gutierrez", 40, null, "Masculino", "Calle 456", "1145342124", "albertito.guti@gmail.com");
        System.out.println(empleado2.toString());

        // Impresión del proximo legajo
        System.out.println("El proximo legajo es: " + Empleado.devuelveProximoLegajo() + "\n");

        // Impresion de empeado 3 sin parametros o por defecto
        Empleado empleado3 = new Empleado();
        System.out.println(empleado3.toString());

        // Impresión de empleado 4 con datos
        Empleado empleado4 = new Empleado("Cadete", "12345699", "Ricardo", "Rojas", 32, null, "Masculino", "Calle Don Bosco 1755", "1124565266", "ricardito_rojas@yahoo.com");
        System.out.println(empleado4.toString());

        // Impresión de empeado 5 con parametros por defecto
        Empleado empleado5 = new Empleado();
        System.out.println(empleado5.toString());

        // Impresión del proximo legajo
        System.out.println("El proximo legajo es: " + Empleado.devuelveProximoLegajo() + "\n");
    }
}
