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
public class ReporteFormas implements Serializable {
    int circulos;
    int cuadrados;
    int rectangulos;
    int lineas;
    int poligonos;

    public ReporteFormas(int circulos, int cuadrados, int rectangulos, int lineas, int poligonos) {
        this.circulos = circulos;
        this.cuadrados = cuadrados;
        this.rectangulos = rectangulos;
        this.lineas = lineas;
        this.poligonos = poligonos;
    }

    public int getCirculos() {
        return circulos;
    }

    public int getCuadrados() {
        return cuadrados;
    }

    public int getRectangulos() {
        return rectangulos;
    }

    public int getLineas() {
        return lineas;
    }

    public int getPoligonos() {
        return poligonos;
    }

    public void setCirculos(int circulos) {
        this.circulos = circulos;
    }

    public void setCuadrados(int cuadrados) {
        this.cuadrados = cuadrados;
    }

    public void setRectangulos(int rectangulos) {
        this.rectangulos = rectangulos;
    }

    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    public void setPoligonos(int poligonos) {
        this.poligonos = poligonos;
    }
    
}
