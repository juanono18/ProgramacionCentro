package Modelo;

public class Centro {
	private int idCentro;
	private String nombreCentro,localizacion;
	
	public Centro(int idCentro, String nombreCentro, String localizacion) {
		this.idCentro = idCentro;
		this.nombreCentro = nombreCentro;
		this.localizacion = localizacion;
	}

	public int getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	

}
