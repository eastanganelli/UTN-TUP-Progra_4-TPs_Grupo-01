package ejercicio1;

public class ExVerificarDNI extends RuntimeException {
	// Constructor por defecto
	public ExVerificarDNI() {
		super();
	}

	// Sobreescribir el método getMessage() para personalizar el mensaje de error
	@Override
	public String getMessage() {
		return "El DNI ingresado no es válido. Debe tener 8 dígitos y no contener letras.";
	}
}