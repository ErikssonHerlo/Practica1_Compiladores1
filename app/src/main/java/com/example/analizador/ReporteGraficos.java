package com.example.analizador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import reportes.ReporteAnimaciones;
import reportes.ReporteColores;
import reportes.ReporteFormas;

public class ReporteGraficos extends AppCompatActivity {
    /******************* REPORTE DE COLORES **********************/

    ReporteColores reporteCantColores = new ReporteColores(0,0,0,0,0,0,0,0);
    /******************* REPORTE DE FORMAS **********************/

    ReporteFormas reporteCantFormas = new ReporteFormas(0,0,0,0,0);
    /******************* REPORTE DE ANIMACIONES **********************/
    ReporteAnimaciones reporteCantAnimaciones = new ReporteAnimaciones(0,0);
    TextView textView;
    Intent intent;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        Bundle datos = getIntent().getExtras();
        reporteCantColores = (ReporteColores) datos.getSerializable("reporteCantColores");
        reporteCantFormas = (ReporteFormas) datos.getSerializable("reporteCantFormas");
        reporteCantAnimaciones = (ReporteAnimaciones) datos.getSerializable("reporteCantAnimaciones");
        setContentView(R.layout.activity_reporte_graficos);
        /*************************** REPORTE DE COLORES ********************************************/
        scrollView = findViewById(R.id.reporteColores);

        textView = findViewById(R.id.azulCant);
        textView.setText(String.valueOf(reporteCantColores.getAzul()));

        textView = findViewById(R.id.rojoCant);
        textView.setText(String.valueOf(reporteCantColores.getRojo()));

        textView = findViewById(R.id.verdeCant);
        textView.setText(String.valueOf(reporteCantColores.getVerde()));

        textView = findViewById(R.id.amarilloCant);
        textView.setText(String.valueOf(reporteCantColores.getAmarillo()));

        textView = findViewById(R.id.naranjaCant);
        textView.setText(String.valueOf(reporteCantColores.getNaranja()));

        textView = findViewById(R.id.moradoCant);
        textView.setText(String.valueOf(reporteCantColores.getMorado()));

        textView = findViewById(R.id.cafeCant);
        textView.setText(String.valueOf(reporteCantColores.getCafe()));

        textView = findViewById(R.id.negroCant);
        textView.setText(String.valueOf(reporteCantColores.getNegro()));

        /*************************** REPORTE DE OBJETOS ********************************************/
        scrollView = findViewById(R.id.reporteObjetos);

        textView = findViewById(R.id.circuloCant);
        textView.setText(String.valueOf(reporteCantFormas.getCirculos()));

        textView = findViewById(R.id.cuadradoCant);
        textView.setText(String.valueOf(reporteCantFormas.getCuadrados()));

        textView = findViewById(R.id.rectangulCant);
        textView.setText(String.valueOf(reporteCantFormas.getRectangulos()));

        textView = findViewById(R.id.lineaCant);
        textView.setText(String.valueOf(reporteCantFormas.getLineas()));

        textView = findViewById(R.id.poligonoCant);
        textView.setText(String.valueOf(reporteCantFormas.getPoligonos()));

        /*************************** REPORTE DE ANIMACIONES ********************************************/
        scrollView = findViewById(R.id.reporteAnimaciones);

        textView = findViewById(R.id.lineaAnimCant);
        textView.setText(String.valueOf(reporteCantAnimaciones.getCantAnimacionesLinea()));

        textView = findViewById(R.id.curvaCant);
        textView.setText(String.valueOf(reporteCantAnimaciones.getCantAnimacionesCurva()));


    }
}