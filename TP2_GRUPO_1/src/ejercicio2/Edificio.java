package ejercicio2;

public abstract class Edificio {
    private String nombre;
    private double ancho;
    private double largo;

    public Edificio(String nombre, double ancho, double largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }

	public Edificio() {
		this("Sin nombre", 0, 0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getSuperficieEdificio() {
	    return ancho * largo;
	}
}