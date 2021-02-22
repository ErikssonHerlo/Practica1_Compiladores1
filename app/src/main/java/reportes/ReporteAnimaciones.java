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
public class ReporteAnimaciones implements Serializable {
    private int cantAnimacionesLinea;
    private int cantAnimacionesCurva;

    public ReporteAnimaciones(int cantAnimacionesLinea, int cantAnimacionesCurva) {
        this.cantAnimacionesLinea = cantAnimacionesLinea;
        this.cantAnimacionesCurva = cantAnimacionesCurva;
    }

    public int getCantAnimacionesLinea() {
        return cantAnimacionesLinea;
    }

    public int getCantAnimacionesCurva() {
        return cantAnimacionesCurva;
    }

    public void setCantAnimacionesLinea(int cantAnimacionesLinea) {
        this.cantAnimacionesLinea = cantAnimacionesLinea;
    }

    public void setCantAnimacionesCurva(int cantAnimacionesCurva) {
        this.cantAnimacionesCurva = cantAnimacionesCurva;
    }
    
    
}
