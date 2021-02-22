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
public class Animacion implements Serializable {
    private int destinoX;
    private int destinoY;
    private String tipoAnimacion;

    public Animacion(int destinoX, int destinoY, String tipoAnimacion) {
        this.destinoX = destinoX;
        this.destinoY = destinoY;
        this.tipoAnimacion = tipoAnimacion;
    }

    public int getDestinoX() {
        return destinoX;
    }

    public int getDestinoY() {
        return destinoY;
    }

    public String getTipoAnimacion() {
        return tipoAnimacion;
    }

    public void setDestinoX(int destinoX) {
        this.destinoX = destinoX;
    }

    public void setDestinoY(int destinoY) {
        this.destinoY = destinoY;
    }

    public void setTipoAnimacion(String tipoAnimacion) {
        this.tipoAnimacion = tipoAnimacion;
    }
    
}
