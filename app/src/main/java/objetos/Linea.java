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
public class Linea implements Serializable {
    private int pos_x;
    private int pos_y;
    private int pos_dx;
    private int pos_dy;
    private String color;

    public Linea(int pos_x, int pos_y, int pos_dx, int pos_dy, String color) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.pos_dx = pos_dx;
        this.pos_dy = pos_dy;
        this.color = color;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public int getPos_dx() {
        return pos_dx;
    }

    public int getPos_dy() {
        return pos_dy;
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

    public void setPos_dx(int pos_dx) {
        this.pos_dx = pos_dx;
    }

    public void setPos_dy(int pos_dy) {
        this.pos_dy = pos_dy;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
