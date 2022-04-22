package Funciones;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que contiene el juego.
 *
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
    public Juego() {
        this.Inicial = 2000;

    }

    /**
     * Destructor
     */
    public void finalize() throws Throwable {
    }

    /**
     * Levanta la carta superior de un mazo
     *
     * @param mazo
     * @return estado
     */
    public int jugarMazo(char mazo) {
        /* Comprueba que el estado sea el correcto */
        if (Estado != 2) {
            return -1;
        }

        Elecciones = Elecciones + 1;
        if (Elecciones > LimiteElecciones) {
            Estado = 1;
            return 3;
        }

        Carta cartaVuelta;
        switch (mazo) {
            case 'A':
            case 'a':
                IndiceA = IndiceA + 1;
                cartaVuelta = (Carta) MazoA.get(IndiceA);
                Saldo = Saldo + cartaVuelta.getGanancia();
                Saldo = Saldo - cartaVuelta.getPerdida();
                Resultado.add(new Jugada(cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
                if (IndiceA + 1 >= MazoA.size()) {
                    return -1;
                }
                break;
            case 'B':
            case 'b':
                IndiceB = IndiceB + 1;
                cartaVuelta = (Carta) MazoB.get(IndiceB);
                Saldo = Saldo + cartaVuelta.getGanancia();
                Saldo = Saldo - cartaVuelta.getPerdida();
                Resultado.add(new Jugada(cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
                if (IndiceB + 1 >= MazoB.size()) {
                    return -1;
                }
                break;
            case 'C':
            case 'c':

                IndiceC = IndiceC + 1;
                cartaVuelta = (Carta) MazoC.get(IndiceC);
                Saldo = Saldo + cartaVuelta.getGanancia();
                Saldo = Saldo - cartaVuelta.getPerdida();
                Resultado.add(new Jugada(cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
                if (IndiceC + 1 >= MazoC.size()) {
                    return -1;
                }
                break;
            case 'D':
            case 'd':

                IndiceD = IndiceD + 1;
                cartaVuelta = (Carta) MazoD.get(IndiceD);
                Saldo = Saldo + cartaVuelta.getGanancia();
                Saldo = Saldo - cartaVuelta.getPerdida();
                Resultado.add(new Jugada(cartaVuelta, System.currentTimeMillis() - this.TiempoInicial, mazo));
                if (IndiceD + 1 >= MazoD.size()) {
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
     *
     * @param pLimiteElecciones
     * @param pInicial
     */
    public int iniciarJuego(int pLimiteElecciones, int pInicial) {
        /* Comprueba que el estado sea el correcto */
        if (Estado < 1) {
            return -1;
        }

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
     *
     * @return
     */
    public int cargarMazos(String ruta, String col, boolean orden) {
        CargaXML mazo;
        Estado = 1;
        String dato = ruta + "/BarajaA.xml";
        String arr[] = {dato, dato, dato, dato};

        for (int i = 0; i < col.length(); i++) {
            dato = selector(col, i);
            arr[i] = ruta + "/Baraja" + dato + ".xml";
        }

        if (!orden) {
            mazo = new CargaXML(MazoA, arr[0], false);
            mazo = new CargaXML(MazoB, arr[1], false);
            mazo = new CargaXML(MazoC, arr[2], false);
            mazo = new CargaXML(MazoD, arr[3], false);
        } else {
            mazo = new CargaXML(MazoA, arr[3], false);
            mazo = new CargaXML(MazoB, arr[2], false);
            mazo = new CargaXML(MazoC, arr[1], false);
            mazo = new CargaXML(MazoD, arr[0], false);
        }
        return (0);
    }

    String selector(String col, int i) {
        String dato = "";
        switch (col.charAt(i)) {
            case 'A':
            case 'a':
                dato = "A";
                break;
            case 'B':
            case 'b':
                dato = "B";
                break;
            case 'C':
            case 'c':
                dato = "C";
                break;
            case 'D':
            case 'd':
                dato = "D";
                break;
        }
        return dato;
    }

    /**
     * Devuelve la ultima carta levantada
     *
     * @param mazo
     */
    public Carta getCarta(char mazo) {
        if (Estado != 2) {
            return null;
        }

        Carta resultado;
        switch (mazo) {
            case 'A':
            case 'a':
                resultado = (Carta) MazoA.get(IndiceA);
                return resultado;
            case 'B':
            case 'b':
                resultado = (Carta) MazoB.get(IndiceB);
                return resultado;
            case 'C':
            case 'c':
                resultado = (Carta) MazoC.get(IndiceC);
                return resultado;
            case 'D':
            case 'd':
                resultado = (Carta) MazoD.get(IndiceD);
                return resultado;
            default:
                return null;
        }
    }

    /**
     * Devuelve el estado del juego
     *
     * @return int 0 => Mazos sin cargar, imposible comenzar. 1 => Mazos
     * cargados pero sin iniciar. 2 => Juego iniciado. 3 => Juego finalizado
     * correctamente. 4 => Juego interrumpido.
     */
    public int getEstado() {
        return Estado;
    }
    

    /**
     * Devuelve el saldo actual
     *
     * @return int
     */
    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo){
        this.Saldo=saldo;
    }
    /**
     * Devuelve el saldo inicial
     *
     * @return int
     */
    public int getInicial() {
        return Inicial;
    }

    /**
     * Funcion que graba el resultado del experimento en un fichero de texto
     *
     * @return void
     */
    public void grabaResultado(String resultado, int num) {

        Integer saldo;
        Integer amarillo = 0;
        Long ultimo = new Long(0);

        String cadena = "Orden\tMazo\tGana\tPierde\tSaldo\tTiempo\tParcial\r\n";

        saldo = this.Inicial;

        for (int n = 0; n < Resultado.size(); n++) {
            Jugada j = (Jugada) Resultado.get(n);
            saldo = saldo + j.getCartaJugada().getGanancia() - j.getCartaJugada().getPerdida();
            cadena += Integer.toString(n + 1) + "\t" + j.getMazo() + "\t" + Integer.toString(j.getCartaJugada().getGanancia()) + "\t" + Integer.toString(j.getCartaJugada().getPerdida()) + "\t" + saldo.toString() + "\t" + Long.toString(j.getTiempo()) + "\t" + Long.toString(j.getTiempo() - ultimo - amarillo) + "\r\n";
            ultimo = j.getTiempo();
            amarillo = 2 * 1000;
        }
        try {
            
            Ficheros.stringToFile(cadena, resultado + num + ".txt");
            Process p = Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe " + resultado + num + ".txt");
        } catch (Exception ex) {
            System.err.println("Error" + ex + "Error");
        }
    }

}
