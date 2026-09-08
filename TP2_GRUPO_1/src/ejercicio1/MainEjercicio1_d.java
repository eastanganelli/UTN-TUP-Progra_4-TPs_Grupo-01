package ejercicio1;

import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
    
    public static void main(String[] args) {
    
        Persona[] personas = new Persona[5];
        
        personas[0] = new Persona("11111111", "Agustina", "Torres", 27, null, "Femenino", "Calle Las Flores 123", "114567891", "agustina.torres@gmail.com");
        personas[1] = new Persona("22222222", "Bruno", "Castro", 34, null, "Masculino", "Av. Corrientes 456", "117894561", "bruno.castro@gmail.com");
        personas[2] = new Persona("33333333", "Camila", "Domínguez", 41, null, "Femenino", "Calle Lavalle 789", "119876543", "camila.dominguez@gmail.com");
        personas[3] = new Persona("44444444", "Diego", "Santana", 23, null, "Masculino", "Av. Rivadavia 321", "113214567", "diego.santana@gmail.com");
        personas[4] = new Persona("55555555", "Elena", "Martínez", 36, null, "Femenino", "Calle Belgrano 654", "115678912", "elena.martinez@gmail.com");
            
        HashSet<Persona> hashSetPersonas = new HashSet<>();
        
        for(Persona per : personas) {
            hashSetPersonas.add(per);
        }
        
        Iterator<Persona> iteradorPersonovich = hashSetPersonas.iterator();
        
        while(iteradorPersonovich.hasNext()) {
        	System.out.println(iteradorPersonovich.next());
        }
        
        /*
        for (Persona per : hashSetPersonas) {
            System.out.println(per.getNombre() + " " + per.getApellido() + " - DNI: " + per.getDni()); 
        }
        */
    }
}