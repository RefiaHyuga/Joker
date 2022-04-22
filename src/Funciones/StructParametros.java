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
    
    public StructParametros(String ruta, int saldoini, boolean versaldo, int numjugadas, int prestamo, boolean invjuego, boolean invorden, String colocar, int retardo, boolean veretardo, int gambling) {
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

    
    
}
