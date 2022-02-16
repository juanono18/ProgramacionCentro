import javax.swing.JOptionPane;


public class VehiculoTerrestre extends Vehiculo{
	private boolean remolque;
	private int numRuedas;
	private boolean puertas;
	private String marca;
	private String color;
	/**
	 * @param motor
	 * @param numPlazas
	 * @param maxVelocidad
	 * @param ruedas
	 * @param remolque
	 * @param numRuedas
	 * @param puertas
	 * @param marca
	 * @param color
	 * @throws VehiculoException 
	 */
	public VehiculoTerrestre(boolean motor, int numPlazas, int maxVelocidad, boolean ruedas, boolean remolque, boolean puertas, String marca, String color) throws VehiculoException {
		super(motor, numPlazas, maxVelocidad, ruedas);
		this.remolque = remolque;
		if(ruedas) {
			// Posible error en el Integer.parseInt al poner algo que no sea un numero
			this.numRuedas = Integer.parseInt(JOptionPane.showInputDialog("Numero de ruedas"));
			/**
			 * Compruebo que las ruedas no sean negativas
			 */
			if(numRuedas < 0) {
				throw new VehiculoException("Asigna un numero correcto de ruedas");
			}
		}else {
			this.numRuedas = 0;
		}
		/**
		 * Asigno velocidad maxima a los vehiculos terrestres
		 */
		this.setMaxVelocidad(500);	
		this.puertas = puertas;
		this.marca = marca;
		this.color = color;
	}
	/**
	 * @return the remolque
	 */
	public boolean hasRemolque() {
		return remolque;
	}
	/**
	 * @param remolque the remolque to set
	 */
	public void setRemolque(boolean remolque) {
		this.remolque = remolque;
	}
	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}
	/**
	 * @param numRuedas the numRuedas to set
	 * @throws VehiculoException 
	 */
	public void setNumRuedas(int numRuedas) throws VehiculoException {
		if(numRuedas < 0) {
			throw new VehiculoException("El numero de ruedas debe ser mayor a 0");
		}else if(!this.hasRuedas()) {
			throw new VehiculoException("El vehiculo no tiene ruedas");
		}else {
			this.numRuedas = numRuedas;
		}
	}
	/**
	 * @return the puertas
	 */
	public boolean hasPuertas() {
		return puertas;
	}
	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(boolean puertas) {
		this.puertas = puertas;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 * @throws VehiculoException 
	 */
	public void setMarca(String marca) throws VehiculoException {
		if(marca == null || marca.isEmpty()) {
			throw new VehiculoException("Valor incorrecto");
		}else {
			this.marca = marca;
		}
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 * @throws VehiculoException 
	 */
	public void setColor(String color) throws VehiculoException {
		if(color == null || color.isEmpty()) {
			throw new VehiculoException("Valor incorrecto");
		}else {
			this.color = color;
		}
	}
	@Override
	public String toString() {
		return "VehiculoTerrestre [hasRemolque()=" + hasRemolque() + ", getNumRuedas()=" + getNumRuedas()
				+ ", hasPuertas()=" + hasPuertas() + ", getMarca()=" + getMarca() + ", getColor()=" + getColor()
				+ ", hasMotor()=" + hasMotor() + ", getNumPlazas()=" + getNumPlazas() + ", getMaxVelocidad()="
				+ getMaxVelocidad() + ", hasRuedas()=" + hasRuedas() + "]";
	}
}
