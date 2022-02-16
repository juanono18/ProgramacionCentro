import java.awt.HeadlessException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Clase principal del ejemplo de Herencia y de Excepciones
 */

/**
 * @author Alumno
 *
 */
public class Main {
	
	private static Vista vista;
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		/**
		 * Creamos objeto de la clase Vista que contiene el JFrame
		 * Llamamos al metodo setVisible() para mostrarlo
		 */
		vista = new Vista();
		vista.setVisible(true);
		
		Coche coche;
		try {
			coche = new Coche(
					true, // Motor tiene que ser true. Si false, exception
					1, // Numero de plazas debe ser mayor que 0
					0, // Menor de 300
					true, // False no ruedas ---> ERROR
					true, // remolque no pasa nada
					true, // puertas ---> tiene que ser true
					"Marca", // marca no null
					"Color", // color no null
					"Tipo");// tipo no null
			vista.textArea.setText(coche.toString());
			JOptionPane.showMessageDialog(null, coche.toString());
		} catch (VehiculoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} 
	}

	/*private static void lanzaExcepcionCoche() throws CocheException {
		int a = -1;
		if(a==0) {
			System.out.println("CORRECTO");
		}else {
			throw new CocheException();
		}
	}*/

	/*private static void lanzaExcepcion() throws VehiculoException {
		throw new VehiculoException("ERROR DE VEHICULO1");
	}*/

}
