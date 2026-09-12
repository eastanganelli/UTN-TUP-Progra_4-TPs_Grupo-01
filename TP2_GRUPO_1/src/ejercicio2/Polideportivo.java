package ejercicio2;

public class Polideportivo extends Edificio implements TipoDeInstalacion {
   
    private boolean techado;

    public Polideportivo(String nombre, double ancho, double largo, boolean techado) {
        super(nombre, ancho, largo);
        this.techado = techado;
    }

    @Override
    public int getTipoDeInstalacion() {
        return 1;
    }

    public String isTechado() {
        return techado ? "Techado" : "Abierto";
    }

    public boolean getTechado() {
        return techado;
    }
}