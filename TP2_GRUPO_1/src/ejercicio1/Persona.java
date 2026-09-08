package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
	//Atributos
		private String dni;
		private String nombre;
		private String apellido;
		private int edad;
		private LocalDate fechaNacimiento;
		private String genero;
		private String direccion;
		private String telefono;
		private String email;
		
		
		//Constructores
		public Persona(){
			this.dni = "00000000";
			this.nombre = "Sin nombre";
			this.apellido = "Sin apellido";
			this.edad = 99;
			this.fechaNacimiento = null;
			this.genero = "Sin género";
			this.direccion = "Sin dirección";
			this.telefono = "Sin teléfono";
			this.email = "Sin email";
		}
		public Persona(String Dni, String Nombre, String Apellido, int Edad, LocalDate FechaNacimiento,
					   String Genero, String Direccion, String Telefono, String Email){
			this.dni = Dni;
			this.nombre = Nombre;
			this.apellido = Apellido;
			this.edad = Edad;
			this.fechaNacimiento = FechaNacimiento;
			this.genero = Genero;
			this.direccion = Direccion;
			this.telefono = Telefono;
			this.email = Email;
		}
		
		
		//Getters y Setters
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		//Metodos
		
		public static void exVerificarDNI(String dni) throws ExVerificarDNI {

		    if (dni == null || !dni.matches("\\d{8}")) {
		        throw new ExVerificarDNI();
		    }
		}		
	
		@Override
		public int hashCode() {
			return Objects.hash(dni);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(dni, other.dni);
		}
		
		
		public String toString() {
	        return "Persona: \n DNI: " + dni + "\n Nombre: " + nombre + "\n Apellido: " + apellido +
	               "\n Edad: " + edad + "\n Fecha de Nacimiento: " + fechaNacimiento +
	               "\n Genero: " + genero + "\n Direccion: " + direccion +
	               "\n Telefono: " + telefono + "\n Email: " + email;
	    }
}