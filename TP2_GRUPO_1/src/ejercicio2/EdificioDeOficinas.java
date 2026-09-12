package ejercicio2;

public class EdificioDeOficinas extends Edificio{

	//Atributos
	private int cantidad_Oficinas;
	
	//Constructores
	public EdificioDeOficinas() {
		super();
	}

	public EdificioDeOficinas(String nombre, int cantidad_Oficinas, double ancho, double largo) {
		super(nombre, ancho, largo);
		this.cantidad_Oficinas = cantidad_Oficinas;
	}

	public int getCantidad_Oficinas() {
		return cantidad_Oficinas;
	}

	public void setCantidad_Oficinas(int cantidad_Oficinas) {
		this.cantidad_Oficinas = cantidad_Oficinas;
	}

	@Override
	public String toString() {
		return "Cantidad de Oficinas: " + cantidad_Oficinas;
	}
}
