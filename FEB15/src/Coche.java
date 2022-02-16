import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Crear ArrayList con neumatico con sus caracteristicas
 * 1. Dureza (0 - 10)
 * 2. Dibujo (si/no)
 * 3. Marca
 * Crear ArrayList con motor con sus caracteristicas
 * @author Alumno
 *
 */
public class Coche extends VehiculoTerrestre{

	private String tipo;
	private ArrayList<Rueda> ruedas;
	/**
	 * @param motor
	 * @param numPlazas
	 * @param maxVelocidad
	 * @param ruedas
	 * @param remolque
	 * @param puertas
	 * @param marca
	 * @param color
	 * @param tipo
	 * @throws VehiculoException 
	 */
	public Coche(boolean motor, int numPlazas, int maxVelocidad, boolean ruedas, boolean remolque, boolean puertas, String marca, String color, String tipo) throws VehiculoException {
		super(motor, numPlazas, maxVelocidad, ruedas, remolque, puertas, marca, color);
		if(!motor) {
			throw new VehiculoException("No tiene motor");
		}
		if(numPlazas < 1) {
			throw new VehiculoException("Coche sin plazas");
		}
		if(maxVelocidad < 0 || maxVelocidad > 300 ) {
			throw new VehiculoException("Velocidad maxima falsa");
		}
		if(!ruedas) {
			throw new VehiculoException("Debe tener ruedas");
		}
		if(!puertas) {
			throw new VehiculoException("Debe tener puertas");
		}
		if(marca == null || marca.isEmpty()) {
			throw new VehiculoException("Debe tener marca");
		}
		if(color == null || color.isEmpty()) {
			throw new VehiculoException("Debe tener color");
		}
		if(tipo == null || tipo.isEmpty()) {
			throw new VehiculoException("Debe tener tipo");
		}else {
			this.tipo = tipo;
		}
		
		// Inicializo el arraylist
		this.ruedas = new ArrayList<Rueda>();
		//Metemos objetos de rueda a mi arraylist
		for(int i = 0; i < getNumRuedas(); i++) {
			boolean dibujo = false;
			int valorDibujo = JOptionPane.showConfirmDialog(null, "Tiene dibujo?");
			if(valorDibujo == 0) {
				dibujo = true;
			}else {
				dibujo = false;
			}
			String numDureza1 = JOptionPane.showInputDialog("Introduce dureza de 0 a 10");
			if(numDureza1 != null && numDureza1.matches("[0-9]+")) {
				int numDureza = Integer.parseInt(numDureza1);
				this.ruedas.add(new Rueda(
						numDureza,
						dibujo, 
						JOptionPane.showInputDialog("Marca de la rueda")));
			}else {
				throw new VehiculoException("Valor de dureza incorrecto");
			}
		}
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 * @throws VehiculoException 
	 */
	public void setTipo(String tipo) throws VehiculoException {
		if(tipo == null || tipo.isEmpty()) {
			throw new VehiculoException("Tipo erroneo");
		}else {
			this.tipo = tipo;
		}
	}
	/**
	 * @return the ruedas
	 */
	public Rueda getRueda(int i) {
		return ruedas.get(i);
	}
	/**
	 * @return the ruedas
	 */
	public ArrayList<Rueda> getRuedas() {
		return ruedas;
	}
	
	
	/**
	 * @param ruedas the ruedas to set
	 * @throws VehiculoException 
	 */
	public void setRuedas(int dureza, boolean dibujo, String marca) throws VehiculoException {
		/**
		 * 1. dureza sea ok
		 * 2. dibujo no comprueba nada
		 * 3. marca ok
		 */
		if(dureza < 1 || dureza > 10) {
			throw new VehiculoException("Valor de dureza incorrecto de dureza");
		}
		if(marca == null || marca.isEmpty()) {
			throw new VehiculoException("Valor de dureza incorrecto de marca");
		}
		ruedas.add(new Rueda(dureza, dibujo, marca));
	}
	
	@Override
	public String toString() {
		String ruedasTodas = "";
		for(int i = 0; i < ruedas.size(); i++) {
			ruedasTodas+= "Rueda numero "+ i + "\n";
			ruedasTodas+= "Dureza: " + ruedas.get(i).getDureza() + "\n";
			ruedasTodas+= "Dibujo: " + ruedas.get(i).hasDibujo() + "\n";
			ruedasTodas+= "Marca: " + ruedas.get(i).getMarca() + "\n";
		}
		return "Coche: \nTipo: " + getTipo() + "\n Ruedas: \n" + ruedasTodas;
	}
}
