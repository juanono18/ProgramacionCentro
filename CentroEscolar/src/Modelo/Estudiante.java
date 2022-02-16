package Modelo;

public class Estudiante extends Personas{
	private String ciclo;

	public Estudiante(int idCentro, String nombreCentro, String localizacion, boolean sueldo, String nombre, String dni,
			String email, int edad, String ciclo) {
		super(idCentro, nombreCentro, localizacion, sueldo, nombre, dni, email, edad);
		this.ciclo = ciclo;
	}
	

}
