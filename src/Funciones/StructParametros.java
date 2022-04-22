/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author Lyoko
 */


public class StructParametros {
    String ruta;
    int saldoini;
    boolean versaldo;
    int numjugadas;
    int prestamo;
    boolean invjuego;
    boolean invorden;
    String colocar;
    int retardo;
    boolean veretardo;
    int gambling;
    boolean sonido;
    String resultado;
    boolean saldoganado;
    String rutaImagenes;
    String imgCartas;
    String gana, empate;
    String [] pierde;

    public StructParametros(String ruta, int saldoini, boolean versaldo, int numjugadas, int prestamo, boolean invjuego, boolean invorden, String colocar, int retardo, boolean veretardo, int gambling, boolean sonido, String resultado, boolean saldoganado,String rutaImagenes, String imgCartas, String gana, String[] pierde, String empate) {
        this.ruta = ruta;
        this.saldoini = saldoini;
        this.versaldo = versaldo;
        this.numjugadas = numjugadas;
        this.prestamo = prestamo;
        this.invjuego = invjuego;
        this.invorden = invorden;
        this.colocar = colocar;
        this.retardo = retardo;
        this.veretardo = veretardo;
        this.gambling = gambling;
        this.sonido = sonido;
        this.resultado = resultado;
        this.saldoganado = saldoganado;
        this.rutaImagenes = rutaImagenes;
        this.imgCartas = imgCartas;
        this.gana=gana;
        this.pierde=pierde;
        this.empate=empate;
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getSaldoini() {
        return saldoini;
    }

    public void setSaldoini(int saldoini) {
        this.saldoini = saldoini;
    }

    public boolean isVersaldo() {
        return versaldo;
    }

    public void setVersaldo(boolean versaldo) {
        this.versaldo = versaldo;
    }

    public int getNumjugadas() {
        return numjugadas;
    }

    public void setNumjugadas(int numjugadas) {
        this.numjugadas = numjugadas;
    }

    public int getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(int prestamo) {
        this.prestamo = prestamo;
    }

    public boolean isInvjuego() {
        return invjuego;
    }

    public void setInvjuego(boolean invjuego) {
        this.invjuego = invjuego;
    }

    public boolean isInvorden() {
        return invorden;
    }

    public void setInvorden(boolean invorden) {
        this.invorden = invorden;
    }

    public String getColocar() {
        return colocar;
    }

    public void setColocar(String colocar) {
        this.colocar = colocar;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    public boolean isVeretardo() {
        return veretardo;
    }

    public void setVeretardo(boolean veretardo) {
        this.veretardo = veretardo;
    }

    public int getGambling() {
        return gambling;
    }

    public void setGambling(int gambling) {
        this.gambling = gambling;
    }

    public boolean isSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public boolean isSaldoganado() {
        return saldoganado;
    }

    public void setSaldoganado(boolean saldoganado) {
        this.saldoganado = saldoganado;
    }

    public String getRutaImagenes() {
        return rutaImagenes;
    }

    public void setRutaImagenes(String rutaCartas) {
        this.rutaImagenes = rutaCartas;
    }

    public String getImgCartas() {
        return imgCartas;
    }

    public void setImgCartas(String imgCartas) {
        this.imgCartas = imgCartas;
    }

    public String getPierde(int i) {
        return pierde[i];
    }

    public void setPierde(String pierde, int i) {
        this.pierde[i] = pierde;
    }

    public String getGana() {
        return gana;
    }

    public void setGana(String gana) {
        this.gana = gana;
    }

    public String getEmpate() {
        return empate;
    }

    public void setEmpate(String empate) {
        this.empate = empate;
    }    
    
}
