/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this cantColoreslate file, choose Tools | Templates
 * and open the cantColoreslate in the editor.
 */
package gramatica;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java_cup.runtime.Symbol;
import objetos.Animacion;
import objetos.Circulo;
import objetos.Linea;
import objetos.Poligono;
import objetos.Rectangulo;
import reportes.ReporteAnimaciones;
import reportes.ReporteColores;
import reportes.ReporteFormas;

/**
 *
 * @author erikssonherlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        String input = "graficar circulo((35+2)*+2-10/5, -2+1, 3, verde)\n"
                + "graficar cuadrado ( 12*3, 15+1, (15-3) / 4, verde)\n"
                + "graficar rectangulo ( 12 * 3 + 2, 15, 4 / 4, 5, negro)\n"
                + "graficar poligono ( 12  + 2, 15, 12, 50 / 2, 6, amarillo)\n"
                + "graficar linea ( 12 * 3 + 2, 15, 4 / 4, 50 * 1, amarillo)\n"
                + "animar objeto anterior (50*3, 75+5, curva)";
        //String input = "graficar ola k ase";
        System.out.println("Input: " + input);
        AnalizadorLexico lex = new AnalizadorLexico(new StringReader(input));
        parser parse = new parser(lex);
        try {
            parse.parse();
            

        } catch (Exception e) {
        }
        //getTokens(input);
/*
        ArrayList<Circulo> circulos = new ArrayList<>();
        Circulo e = null;

        circulos.add(e);
        */
        
        int azul = 0;
        int rojo = 0;
        int verde = 0;
        int amarillo = 0;
        int naranja = 0;
        int morado = 0;
        int cafe = 0;
        int negro = 0;
        ReporteColores reporteCantColores = new ReporteColores(azul, rojo, verde, amarillo, naranja, morado, cafe, negro);
        String clr = "verde";
        if (clr.equals("azul")) {
            azul++;
            reporteCantColores.setAzul(azul);
        } else if (clr.equals("rojo")) {
            rojo++;
            reporteCantColores.setRojo(rojo);
        } else if (clr.equals("verde")) {
            verde++;
            reporteCantColores.setVerde(verde);
        } else if (clr.equals("amarillo")) {
            amarillo++;
            reporteCantColores.setAmarillo(amarillo);
        } else if (clr.equals("naranja")) {
            naranja++;
            reporteCantColores.setNaranja(naranja);
        } else if (clr.equals("morado")) {
            morado++;
            reporteCantColores.setMorado(morado);
        } else if (clr.equals("cafe")) {
            cafe++;
            reporteCantColores.setCafe(cafe);          
        } else if (clr.equals("negro")) {
            negro++;
            reporteCantColores.setNegro(negro);
        }
        //System.out.println(cantColores.getVerde());
       //System.out.println(parse.cantColores.getVerde());
        ArrayList <Circulo> circle = new ArrayList<>();
        circle = parse.circulos;
       
       int cantCirculos =0;
       int cantCuadrados = 0;
       int cantRectangulos =0;
       int cantLineas =0;
       int cantPoligonos=0;
       //ReporteFormas reporteCantFormas = new ReporteFormas(cantCirculos, cantCuadrados, cantRectangulos, cantLineas, cantPoligonos);
       //cantCirculos++;
       //reporteCantFormas.setCirculos(cantCirculos);
        System.out.println(parse.reporteCantFormas.getLineas());
        System.out.println(parse.reporteCantAnimaciones.getCantAnimacionesCurva());
       // Poligono poligono = new Poligono(rojo, rojo, rojo, negro, cafe, clr);
        //System.out.printf("Pos x: %d, Pos y: %d, Alto: %d, Ancho: %d, Cant Lados: %d, Color: %s\n\n", poligono.getPos_x(), poligono.getPos_y(), poligono.getAlto(),poligono.getAncho(), poligono.getLados(), poligono.getColor()); 
                String tipoAnima = "linea";
            
       
               
    }

    public static void getTokens(String input) throws IOException {
        AnalizadorLexico lex = new AnalizadorLexico(new StringReader((input)));
        Symbol symbol = null;

        do {
            symbol = lex.next_token();
            System.out.println(symbol.value);
            System.out.println(symbol.parse_state);
        } while (symbol.value != null);

    }
}
