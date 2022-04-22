package Funciones;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase que contiene el juego.
 * @author Angela Ortega Gabarro
 * @version 1.0b
 */
public class Juego {
	private List Resultado = new ArrayList();
	private int Elecciones;
	private List MazoA = new ArrayList();
	private int IndiceA;
	private List MazoB = new ArrayList();
	private int IndiceB;
	private List MazoC = new ArrayList();
	private int IndiceC;
	private List MazoD = new ArrayList();
	private int IndiceD;
	private int Inicial;
	private int Saldo = 2000;
	private int LimiteElecciones;	
	private int Estado = 0;
	private long TiempoInicial;
	
	/**
	 * Constructor
	 */
	public Juego(){
		this.Inicial = 2000;
	}

	/**
	 * Destructor
	 */
	public void finalize() throws Throwable {
	}

	/**
	 * Levanta la carta superior de un mazo
	 * @param mazo
	 */
	public int jugarMazo(char mazo){
		/* Comprueba que el estado sea el correcto */
		if (Estado != 2) return -1;
	
		Elecciones = Elecciones + 1;
		if (Elecciones > LimiteElecciones) {
			 Estado = 1;
			 return -1;
			};
			
		Carta cartaVuelta;
		switch (mazo) {
			case 'A': case 'a':
				IndiceA = IndiceA + 1;
				cartaVuelta = (Carta) MazoA.get (IndiceA);
				Saldo = Saldo + cartaVuelta.getGanancia();
				Saldo = Saldo - cartaVuelta.getPerdida();
				Resultado.add (new Jugada (cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
				if (IndiceA + 1 >= MazoA.size()){			
					return -1;
				}
				break;
			case 'B': case 'b':		
				IndiceB = IndiceB + 1;
				cartaVuelta = (Carta) MazoB.get (IndiceB);
				Saldo = Saldo + cartaVuelta.getGanancia();
				Saldo = Saldo - cartaVuelta.getPerdida();
				Resultado.add (new Jugada (cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
				if (IndiceB + 1 >= MazoB.size()){
					return -1;
				}
				break;
			case 'C': case 'c':
				
				IndiceC = IndiceC + 1;
				cartaVuelta = (Carta) MazoC.get (IndiceC);
				Saldo = Saldo + cartaVuelta.getGanancia();
				Saldo = Saldo - cartaVuelta.getPerdida();
				Resultado.add (new Jugada (cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
				if (IndiceC + 1 >= MazoC.size()){
					return -1;
				}
				break;
			case 'D': case 'd':
				
				IndiceD = IndiceD + 1;
				cartaVuelta = (Carta) MazoD.get (IndiceD);
				Saldo = Saldo + cartaVuelta.getGanancia();
				Saldo = Saldo - cartaVuelta.getPerdida();
				Resultado.add (new Jugada (cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
				if (IndiceD + 1 >= MazoD.size()){
					return -1;
				}
				break;
			default:
				return -1;
		}

		return (0);
	}

	/**
	 * Funcion que inicializa el juego
	 * @param pLimiteElecciones
	 * @param pInicial
	 */
	public int iniciarJuego(int pLimiteElecciones, int pInicial){
		/* Comprueba que el estado sea el correcto */
		if (Estado < 1) return -1;
	
		Resultado.clear();
		IndiceA = -1;
		IndiceB = -1;
		IndiceC = -1;
		IndiceD = -1;
		Inicial = pInicial;
		this.Saldo = pInicial;
		LimiteElecciones = pLimiteElecciones;
		Elecciones = 0;
		Estado = 2;
		TiempoInicial = System.currentTimeMillis();
	
		return 0;
	}

	/**
	 * Funcion que carga los mazos de cartas a partir de ficheros XML
	 * @return
	 */
	public int cargarMazos(){
		CargaXML mazo;
		Estado = 1;
		
		mazo = new CargaXML (MazoA, "src/Datos/BarajaA.xml", false);
		mazo = new CargaXML (MazoB, "src/Datos/BarajaB.xml", false);
		mazo = new CargaXML (MazoC, "src/Datos/BarajaC.xml", false);
		mazo = new CargaXML (MazoD, "src/Datos/BarajaD.xml", false);

		return (0);
	}

	/**
	 * Devuelve la ultima carta levantada
	 * @param mazo
	 */
	public Carta getCarta(char mazo){
		if (Estado != 2) return null;
	
		Carta resultado;
		switch (mazo) {
			case 'A': case 'a':
				resultado = (Carta) MazoA.get (IndiceA);
				return resultado;
			case 'B': case 'b':
				resultado = (Carta) MazoB.get (IndiceB);
				return resultado;
			case 'C': case 'c':
				resultado = (Carta) MazoC.get (IndiceC);
				return resultado;
			case 'D': case 'd':
				resultado = (Carta) MazoD.get (IndiceD);
				return resultado;
			default:
				return null;
		}
	}

	/**
	 * Devuelve el estado del juego
	 * @return int	0 => Mazos sin cargar, imposible comenzar.
	 *	 			1 => Mazos cargados pero sin iniciar.
	 *	 			2 => Juego iniciado.
	 *	 			3 => Juego finalizado correctamente.
	 *	 			4 => Juego interrumpido.
	 */
	public int getEstado(){
		return Estado;
	}

	/**
	 * Devuelve el saldo actual
	 * @return int
	 */
	public int getSaldo(){
		return Saldo;
	}
	
	/**
	 * Devuelve el saldo inicial
	 * @return int
	 */
	public int getInicial(){
		return Inicial;
	}
	
	/**
	 * Funcion que graba el resultado del experimento en un fichero de texto
	 * @return void
	 */
	public void grabaResultado(){
		
		Integer saldo;
		Integer amarillo = 0;
		Long ultimo = new Long(0);
		
		String cadena = "Orden\tMazo\tGana\tPierde\tSaldo\tTiempo\tParcial\r\n";
		
		saldo = this.Inicial;
		
		for (int n = 0; n < Resultado.size(); n++) {
			Jugada j = (Jugada) Resultado.get(n);
			saldo = saldo + j.getCartaJugada().getGanancia()- j.getCartaJugada().getPerdida();
			cadena += Integer.toString(n + 1)+"\t"+j.getMazo()+"\t"+Integer.toString(j.getCartaJugada().getGanancia())+"\t"+Integer.toString(j.getCartaJugada().getPerdida())+"\t"+saldo.toString()+"\t"+Long.toString(j.getTiempo())+"\t"+Long.toString(j.getTiempo() - ultimo - amarillo)+"\r\n";
			ultimo = j.getTiempo();
			amarillo = 2 * 1000;
		}
		try {
			Ficheros.stringToFile(cadena, "resultado.txt");
			Process p = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe resultado.txt");
		} catch (Exception ex) {
			System.err.println("Error" + ex + "Error");
		}
	}

}