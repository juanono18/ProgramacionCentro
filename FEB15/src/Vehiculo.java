
public class Vehiculo {
	private boolean motor;
	private int numPlazas, maxVelocidad;
	private boolean ruedas;
	/**
	 * @param motor
	 * @param numPlazas
	 * @param maxVelocidad
	 * @param ruedas
	 */
	public Vehiculo(boolean motor, int numPlazas, int maxVelocidad, boolean ruedas) {
		this.motor = motor;
		this.numPlazas = numPlazas;
		this.maxVelocidad = maxVelocidad;
		this.ruedas = ruedas;
	}
	/**
	 * @return the motor
	 */
	public boolean hasMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	/**
	 * @return the numPlazas
	 */
	public int getNumPlazas() {
		return numPlazas;
	}
	/**
	 * @param numPlazas the numPlazas to set
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	/**
	 * @return the maxVelocidad
	 */
	public int getMaxVelocidad() {
		return maxVelocidad;
	}
	/**
	 * @param maxVelocidad the maxVelocidad to set
	 */
	public void setMaxVelocidad(int maxVelocidad) {
		this.maxVelocidad = maxVelocidad;
	}
	/**
	 * @return the ruedas
	 */
	public boolean hasRuedas() {
		return ruedas;
	}
	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}
}
