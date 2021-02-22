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
public class Cuadrado implements Serializable {
    private int pos_x;
    private int pos_y;
    private int lado;
    private String color;

    public Cuadrado(int pos_x, int pos_y, int lado, String color) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.lado = lado;
        this.color = color;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public int getLado() {
        return lado;
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

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}
