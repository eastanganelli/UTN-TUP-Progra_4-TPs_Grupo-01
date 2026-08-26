package ejercicio1;
import java.time.LocalDate;

public class Empleado extends Persona {
    private static int contadorLegajo = 1000;
    private final int legajo;
    private String puesto;

    public static int devuelveProximoLegajo() {
		return contadorLegajo;
    }
   
    public Empleado() {
        super();
        this.legajo = contadorLegajo++;
        this.puesto = " Sin puesto ";
    }
    
    public Empleado(String puesto, String Dni, String Nombre, String Apellido, int Edad, LocalDate FechaNacimiento,
					String Genero, String Direccion, String Telefono, String Email) {
		super(Dni, Nombre, Apellido, Edad, FechaNacimiento, Genero, Direccion, Telefono, Email);
		this.legajo = contadorLegajo++; 
		this.puesto = puesto;
    }

	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getLegajo() {
		return legajo;
	}

	@Override
	public String toString() {
		return super.toString() + " \n Legajo: " + legajo + " \n Puesto: " + puesto + "\n";
	} 
} 