package Modelo;

public class Personas extends Centro{
	private boolean sueldo;
	private String nombre,dni,email;
	
	/**
	 * @param idCentro
	 * @param nombreCentro
	 * @param localizacion
	 * @param sueldo
	 * @param nombre
	 * @param dni
	 * @param email
	 */
	public Personas(int idCentro, String nombreCentro, String localizacion, boolean sueldo, String nombre, String dni,
			String email) {
		super(idCentro, nombreCentro, localizacion);
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
	}

	public boolean hasSueldo() {
		return sueldo;
	}

	public void setSueldo(boolean sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	
	

	

}
