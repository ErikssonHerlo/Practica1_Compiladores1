package com.example.analizador;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import java.util.ArrayList;

import objetos.Circulo;
import objetos.Cuadrado;
import objetos.Linea;
import objetos.Poligono;
import objetos.Rectangulo;

public class Lienzo extends View {

    private ArrayList <Circulo> circulos = new ArrayList<>();
    private ArrayList <Cuadrado> cuadrados = new ArrayList<>();
    private ArrayList <Rectangulo> rectangulos = new ArrayList<>();
    private ArrayList <Poligono> poligonos = new ArrayList<>();
    private ArrayList <Linea> lineas = new ArrayList<>();

    public Lienzo(Context context, ArrayList<Circulo> circulos, ArrayList<Cuadrado> cuadrados,  ArrayList <Rectangulo> rectangulos,ArrayList <Poligono> poligonos, ArrayList <Linea> lineas) {
        super(context);
        this.circulos = circulos;
        this.cuadrados = cuadrados;
        this.rectangulos = rectangulos;
        this.poligonos = poligonos;
        this.lineas = lineas;
    }
    /*Sobreescritura del metodo onDraw*/
    protected void onDraw(Canvas canvas) {





        /*Fondo del lienzo*/
        canvas.drawRGB(255, 255, 255);

        /*Pintador*/
        Paint pincel1 = new Paint();
        pincel1.setARGB(0, 0, 0, 0);

        for (Circulo temp: circulos) {
            pintarCirculo(canvas, temp);
        }
        for (Cuadrado temp: cuadrados) {
            pintarCuadrado(canvas, temp);
        }

        for (Rectangulo temp: rectangulos) {
            pintarRectangulo(canvas, temp);
        }

        for(Linea temp: lineas){
            pintarLinea(canvas,temp);
        }
        for(Poligono temp : poligonos){
            pintarPoligono(canvas,temp);
        }

        /*
        for (int i = 0; i < graficas.size(); i++) {
            if (graficas.get(i) instanceof Circulo) {
                ContCirculo++;
                Circulo circle = (Circulo) graficas.get(i); //Casting explícito
                System.out.println("encontro circulo");
                pintarCirculo(canvas, circle);
            } else if (graficas.get(i) instanceof Cuadrado) {
                ContCuadro++;
                Cuadrado cuad= (Cuadrado) graficas.get(i); //Casting explícito
                pintarCuadrado(canvas,cuad);
            } else if (graficas.get(i) instanceof Rectangulo) {
                ContRectangulo++;
                Rectangulo rect= (Rectangulo) graficas.get(i); //Casting explícito
                pintarRectangulo( canvas,  rect);
            } else if (graficas.get(i) instanceof Linea) {
                ContLinea++;
                Linea line= (Linea) graficas.get(i); //Casting explícito
                pintarLinea(canvas,line);
            } else if (graficas.get(i) instanceof Poligono) {
                ContPoligono++;
                Poligono poli= (Poligono) graficas.get(i); //Casting explícito
                // determina el numero de lados del poligono
                determinaPoligono(canvas,poli);
            }

            System.out.println(" CADENAS RECONOCIDAS "+graficas.get(i).getColor());
        } */


    }


    public void pintarCirculo(Canvas canvas, Circulo circle){

        Paint paint = new Paint();
        int X=circle.getPos_x();
        int Y=circle.getPos_y();
        int radio=circle.getRadio();

        // Circulo
        paint.setAntiAlias(true);
        //paint.setARGB(255,0,0,255);
        obtenerColor(paint,circle.getColor());
        paint.setStyle(Paint.Style.FILL);//borde
        paint.setStrokeWidth(3.6f);
        // centro X, centro Y, radio
        canvas.drawCircle(X, Y, radio, paint);

    }
    public void pintarCuadrado(Canvas canvas, Cuadrado cuadrado){

        Paint paint = new Paint();
        int X=cuadrado.getPos_x();
        int Y=cuadrado.getPos_y();
        int lado=cuadrado.getLado();
        Path path = new Path();
        path.moveTo(X,Y);
        path.lineTo(X,(Y-lado));
        path.lineTo(X+lado,Y-lado);
        path.lineTo(X+lado,Y);
        path.close();

        paint.setAntiAlias(true);

        obtenerColor(paint,cuadrado.getColor());
        paint.setStyle(Paint.Style.FILL);//borde
        paint.setStrokeWidth(3.6f);
        canvas.drawPath(path,paint);
    }

    public void pintarRectangulo(Canvas canvas, Rectangulo rectangulo){

        Paint paint = new Paint();
        int X=rectangulo.getPos_x();
        int Y=rectangulo.getPos_y();
        int alto=rectangulo.getAlto();
        int ancho = rectangulo.getAncho();
        Path path = new Path();
        path.moveTo(X,Y);
        path.lineTo(X,(Y-alto));
        path.lineTo(X+ancho,Y-alto);
        path.lineTo(X+ancho,Y);
        path.close();

        paint.setAntiAlias(true);

        obtenerColor(paint,rectangulo.getColor());
        paint.setStyle(Paint.Style.FILL);//borde
        paint.setStrokeWidth(3.6f);
        canvas.drawPath(path,paint);
    }
    public void pintarLinea(Canvas canvas, Linea linea){

        Paint paint = new Paint();
        int X=linea.getPos_x();
        int Y=linea.getPos_y();
        int DX= linea.getPos_dx();
        int DY = linea.getPos_dy();

        paint.setAntiAlias(true);

        obtenerColor(paint,linea.getColor());
        paint.setStyle(Paint.Style.FILL);//borde
        paint.setStrokeWidth(15);
        canvas.drawLine(X,Y,DX,DY,paint);
    }

    public void pintarPoligono(Canvas canvas, Poligono poligono){

        Paint paint = new Paint();

        int X=poligono.getPos_x();
        int Y=poligono.getPos_y();
        int alto=poligono.getAlto();
        int ancho = poligono.getAncho();
        int cantLados = poligono.getLados();

        float escala = (float) alto/(float) ancho;
        canvas.save();
        canvas.translate(X,Y);
        canvas.rotate(270f);
        canvas.scale(escala,1f);
        int radio = alto/2;
        double rad = 2* Math.PI/cantLados;

        paint.setAntiAlias(true);

        obtenerColor(paint,poligono.getColor());
        paint.setStyle(Paint.Style.FILL);//borde
        paint.setStrokeWidth(5f);


        for(int i=0; i<cantLados; i++) {
            float X1 = radio* (float) Math.cos(rad*i);
            float Y1 = radio* (float) Math.sin(rad*i);

            float X2 = radio* (float) Math.cos(rad*(i+1));
            float Y2 = radio* (float) Math.sin(rad*(i+1));
            canvas.drawLine(X1,Y1,X2,Y2,paint);


        }
        canvas.restore();

    }
    public void obtenerColor(Paint paint, String color){

        switch(color.trim()){
            case "azul":
                paint.setARGB(255,0,0,255);
                break;
            case "rojo":
                paint.setARGB(255,255,0,0);
                break;
            case "verde":
                paint.setARGB(255,0,240,0);
                break;
            case "amarillo":
                paint.setARGB(255,255,255,0);
                break;
            case "naranja":
                paint.setARGB(255,255,140,0);
                break;
            case "morado":
                paint.setARGB(255,128,0,128);
                break;
            case "cafe":
                paint.setARGB(255,139,69,19);
                break;
            case "negro":
                paint.setARGB(255,0,0,0);
                break;
            default:
                break;
        }
    }

}
