/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.io.Serializable;

/**
 *
 * @author erikssonherlo
 */
public class ReporteColores implements Serializable {
    private int azul ;
    private int rojo;
    private int verde ;
    private int amarillo;
    private int naranja;
    private int morado;
    private int cafe;
    private int negro;

    public ReporteColores(int azul, int rojo, int verde, int amarillo, int naranja, int morado, int cafe, int negro) {
        this.azul = azul;
        this.rojo = rojo;
        this.verde = verde;
        this.amarillo = amarillo;
        this.naranja = naranja;
        this.morado = morado;
        this.cafe = cafe;
        this.negro = negro;
    }

    public ReporteColores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

    public void setAmarillo(int amarillo) {
        this.amarillo = amarillo;
    }

    public void setNaranja(int naranja) {
        this.naranja = naranja;
    }

    public void setMorado(int morado) {
        this.morado = morado;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public void setNegro(int negro) {
        this.negro = negro;
    }

    public int getAzul() {
        return azul;
    }

    public int getRojo() {
        return rojo;
    }

    public int getVerde() {
        return verde;
    }

    public int getAmarillo() {
        return amarillo;
    }

    public int getNaranja() {
        return naranja;
    }

    public int getMorado() {
        return morado;
    }

    public int getCafe() {
        return cafe;
    }

    public int getNegro() {
        return negro;
    }


    
}
