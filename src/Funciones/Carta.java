/**
 * Clase que describe una carta, con una cifra de ganancia y otra de perdida.
 * @author Angela Ortega Gabarro
 * @version 1.0b
 */

package Funciones;

public class Carta {

	private int Ganancia;
	private int Perdida;

	/**
	 * Constructor 
	 * @param newGanancia
	 * @param newPerdida
	 */
	public Carta(int newGanancia, int newPerdida){
		Perdida = newPerdida;
		Ganancia = newGanancia;
	}

	/**
	 * Finalize
	 * @param void
	 */
	public void finalize() throws Throwable {
	}

	/**
	 * Devuelve la cifra de perdida
	 * @return int
	 */
	public int getPerdida(){
		return Perdida;
	}

	/**
	 * Devuelve la cifra de ganancia
	 * @return int
	 */
	public int getGanancia(){
		return Ganancia;
	}
}
