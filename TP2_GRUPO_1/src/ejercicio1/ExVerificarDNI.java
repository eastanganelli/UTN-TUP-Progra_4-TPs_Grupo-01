package ejercicio1;

public class ExVerificarDNI extends RuntimeException {
	// Constructor por defecto
	public ExVerificarDNI() {
		super();
	}

	// Sobreescribir el método getMessage() para personalizar el mensaje de error
	@Override
	public String getMessage() {
		return "Persona no agregada por no verificar el DNI";
	}
}