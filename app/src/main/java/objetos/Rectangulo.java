/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.io.Serializable;

/**
 *
 * @author erikssonherlo
 */
public class Rectangulo implements Serializable {
    private int pos_x;
    private int pos_y;
    private int alto;
    private int ancho;
    private String color;

    public Rectangulo(int pos_x, int pos_y, int alto, int ancho, String color) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public String getColor() {
        return color;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
