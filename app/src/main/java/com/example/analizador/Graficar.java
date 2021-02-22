package com.example.analizador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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

public class Graficar extends AppCompatActivity {
    ArrayList <Circulo> circulos = new ArrayList<>();
    ArrayList <Cuadrado> cuadrados = new ArrayList<>();
    ArrayList <Rectangulo> rectangulos = new ArrayList<>();
    ArrayList <Poligono> poligonos = new ArrayList<>();
    ArrayList <Linea> lineas = new ArrayList<>();
    ArrayList <Animacion> animaciones = new ArrayList<>();
    Button buttonReportesGraficos;

    /******************* REPORTE DE COLORES **********************/

    ReporteColores reporteCantColores = new ReporteColores(0,0,0,0,0,0,0,0);
    /******************* REPORTE DE FORMAS **********************/

    ReporteFormas reporteCantFormas = new ReporteFormas(0,0,0,0,0);
    /******************* REPORTE DE ANIMACIONES **********************/
    ReporteAnimaciones reporteCantAnimaciones = new ReporteAnimaciones(0,0);
    TextView textView;
    Intent intent;
    String salida = "Averiguando Cual es el Error";
    int param_x, param_y, param_Radio;
    String color;
    int output = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficar);
        textView = findViewById(R.id.outputText);
        buttonReportesGraficos = findViewById(R.id.buttonReporteGraficos);
         intent = getIntent();
        Bundle datos = getIntent().getExtras();
        reporteCantColores = (ReporteColores) datos.getSerializable("reporteCantColores");
        circulos = (ArrayList<Circulo>) datos.getSerializable("circulos");
        cuadrados = (ArrayList<Cuadrado>) datos.getSerializable("cuadrados");
        rectangulos = (ArrayList<Rectangulo>) datos.getSerializable("rectangulos");
        lineas = (ArrayList<Linea>) datos.getSerializable("lineas");
        poligonos = (ArrayList<Poligono>) datos.getSerializable("poligonos");
        reporteCantColores = (ReporteColores) datos.getSerializable("reporteCantColores");
        reporteCantFormas = (ReporteFormas) datos.getSerializable("reporteCantFormas");
        reporteCantAnimaciones = (ReporteAnimaciones) datos.getSerializable("reporteCantAnimaciones");


        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.ventanaGraficar);
        Lienzo lienzo = new Lienzo(this,circulos, cuadrados, rectangulos,poligonos,lineas);
        layout.addView(lienzo);

        buttonReportesGraficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(getApplicationContext(),ReporteGraficos.class);
                Bundle b1 = new Bundle();
                Bundle b2 = new Bundle();
                Bundle b3 = new Bundle();



                /*
                FORMAS
                 */
                b1.putSerializable("reporteCantColores",reporteCantColores);
                b2.putSerializable("reporteCantFormas",reporteCantFormas);
                b3.putSerializable("reporteCantAnimaciones",reporteCantAnimaciones);


                intent.putExtras(b1);
                intent.putExtras(b2);
                intent.putExtras(b3);


                startActivity(intent);
            }
        });

    }
}