/**
 * Clase que contiene una carta, el tiempo que se ha tardado en levantarla
 * y el mazo del que ha salido.  
 * @author Angela Ortega Gabarro
 * @version 1.0b
 */
package Funciones;

public class Jugada {
	
	private Carta CartaJugada;
	private long Tiempo;
	private char Mazo;
	
	/**
	 * Constructor
	 * @param newCartaJugada
	 * @param newTiempo
	 * @param newMazo
	 */
	public Jugada (Carta newCartaJugada, long newTiempo, char newMazo) {
		CartaJugada = newCartaJugada;
		Tiempo = newTiempo;
		Mazo = newMazo;
	}
	
	/**
	 * Devuelve la carta jugada
	 * @return Carta
	 */
	public Carta getCartaJugada() {
		return CartaJugada;
	}
	
	/**
	 * Devuelve el tiempo empleado en escoger la carta
	 * @return int
	 */
	public long getTiempo() {
		return Tiempo;
	}
	
	/**
	 * Devuelve el mazo del que ha salido la carta
	 * @return char
	 */
	public char getMazo() {
		return Mazo;
	}
}
