package Modelo;

public class Espacio extends Centro{
	private int numPlantas,tamanoPlanta;
	private boolean alimentos;
	/**
	 * @param idCentro
	 * @param nombreCentro
	 * @param localizacion
	 * @param numPlantas
	 * @param tamanoPlanta
	 * @param alimentos
	 */
	public Espacio(int idCentro, String nombreCentro, String localizacion, int numPlantas, int tamanoPlanta,
			boolean alimentos) {
		super(idCentro, nombreCentro, localizacion);
		this.numPlantas = numPlantas;
		this.tamanoPlanta = tamanoPlanta;
		this.alimentos = alimentos;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}
	public int getTamanoPlanta() {
		return tamanoPlanta;
	}
	public void setTamanoPlanta(int tamanoPlanta) {
		this.tamanoPlanta = tamanoPlanta;
	}
	public boolean isAlimentos() {
		return alimentos;
	}
	public void setAlimentos(boolean alimentos) {
		this.alimentos = alimentos;
	}
	
	
}
