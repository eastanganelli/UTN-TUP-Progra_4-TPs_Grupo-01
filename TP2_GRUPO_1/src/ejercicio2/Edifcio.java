package ejercicio2;

public abstract class Edifcio {
    private String nombre;
    private float ancho;
    private float largo;

    public Edifcio(String nombre, float ancho, float largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }
}