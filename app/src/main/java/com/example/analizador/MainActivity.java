package com.example.analizador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.io.StringReader;
import java.util.ArrayList;

import gramatica.AnalizadorLexico;
import gramatica.parser;
import objetos.Animacion;
import objetos.Circulo;
import objetos.Cuadrado;
import objetos.Linea;
import objetos.Poligono;
import objetos.Rectangulo;
import reportes.ReporteAnimaciones;
import reportes.ReporteColores;
import reportes.ReporteFormas;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    Intent intent;
   ArrayList <Circulo> listaCirculos = new ArrayList<>();
   /* ArrayList <Cuadrado> cuadrados = new ArrayList<>();
    ArrayList <Rectangulo> rectangulos = new ArrayList<>();
    ArrayList <Poligono> poligonos = new ArrayList<>();
    ArrayList <Linea> lineas = new ArrayList<>();
    ArrayList <Animacion> animaciones = new ArrayList<>();
*/
    /******************* REPORTE DE COLORES **********************/
    int azul = 0;
    int rojo =0;
    int verde = 0;
    int amarillo =0;
    int naranja =0;
    int morado = 0;
    int cafe =0;
    int negro =0;
    ReporteColores reporteCantColores = new ReporteColores(azul, rojo, verde, amarillo, naranja, morado, cafe, negro);
    /******************* REPORTE DE FORMAS **********************/
    int cantCirculos =0;
    int cantCuadrados = 0;
    int cantRectangulos =0;
    int cantLineas =0;
    int cantPoligonos=0;
    ReporteFormas reporteCantFormas = new ReporteFormas(cantCirculos, cantCuadrados, cantRectangulos, cantLineas, cantPoligonos);
    /******************* REPORTE DE ANIMACIONES **********************/

    int cantAnimLinea =0;
    int cantAnimCurva =0;
    ReporteAnimaciones reporteCantAnimaciones = new ReporteAnimaciones(cantAnimLinea, cantAnimCurva);
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.input);
        button = findViewById(R.id.buttonGraficar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                AnalizadorLexico lex = new AnalizadorLexico(new StringReader(input));
                parser parse = new parser(lex);
                try {
                    parse.parse();

                            //reporteCantFormas = parse.reporteCantFormas
                } catch (Exception e) {
                }

                intent = new Intent(getApplicationContext(),Graficar.class);
                Bundle b1 = new Bundle();
                Bundle b2 = new Bundle();
                Bundle b3 = new Bundle();
                Bundle b4 = new Bundle();
                Bundle b5 = new Bundle();
                Bundle b6 = new Bundle();
                Bundle b7 = new Bundle();
                Bundle b8 = new Bundle();

                Bundle b9 = new Bundle();


                /*
                FORMAS
                 */
                b1.putSerializable("circulos",parse.circulos);
                b2.putSerializable("cuadrados",parse.cuadrados);
                b3.putSerializable("rectangulos",parse.rectangulos);
                b4.putSerializable("poligonos", parse.poligonos);
                b5.putSerializable("lineas", parse.lineas);
                b6.putSerializable("animaciones",parse.animaciones);

                /*
                REPORTES
                 */

                b7.putSerializable("reporteCantColores",parse.reporteCantColores);
                b8.putSerializable("reporteCantFormas", parse.reporteCantFormas);
                b9.putSerializable("reporteCantAnimaciones", parse.reporteCantAnimaciones);


                intent.putExtras(b1);
                intent.putExtras(b2);
                intent.putExtras(b3);
                intent.putExtras(b4);
                intent.putExtras(b5);
                intent.putExtras(b6);
                intent.putExtras(b7);
                intent.putExtras(b8);
                intent.putExtras(b9);

                startActivity(intent);
            }
        });



    }


}