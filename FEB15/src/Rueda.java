
public class Rueda {
 /**
  * 1. Dureza (0 - 10)
  * 2. Dibujo (si/no)
  * 3. Marca
  */
	
	private int dureza; // 0 - 10
	private boolean dibujo; // true - false
	private String marca; // DISTINTO de null y DISTINTO de vacio
	/**
	 * @param dureza
	 * @param dibujo
	 * @param marca
	 * @throws Exception 
	 */
	public Rueda(int dureza, boolean dibujo, String marca) throws VehiculoException {
		if(dureza > 0 && dureza < 10) {
			this.dureza = dureza;
		}else {
			throw new VehiculoException("Dureza mal");
		}
		this.dibujo = dibujo;
		if(marca != null && marca != "") {
			this.marca = marca;
		}else {
			throw new VehiculoException("Marca mal");
		}
	}
	/**
	 * @return the dureza
	 */
	public int getDureza() {
		return dureza;
	}
	/**
	 * @param dureza the dureza to set
	 * @throws Exception 
	 */
	public void setDureza(int dureza) throws VehiculoException {
		if(dureza > 0 && dureza < 10) {
			this.dureza = dureza;
		}else {
			throw new VehiculoException("Dureza mal");
		}
	}
	/**
	 * @return the dibujo
	 */
	public boolean hasDibujo() {
		return dibujo;
	}
	/**
	 * @param dibujo the dibujo to set
	 */
	public void setDibujo(boolean dibujo) {
		this.dibujo = dibujo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 * @throws Exception 
	 */
	public void setMarca(String marca) throws VehiculoException {
		if(marca != null && marca != "") {
			this.marca = marca;
		}else {
			throw new VehiculoException("Marca mal");
		}
	}
	@Override
	public String toString() {
		return "Rueda [getDureza()=" + getDureza() + ", hasDibujo()=" + hasDibujo() + ", getMarca()=" + getMarca()+ "]";
	}
}
