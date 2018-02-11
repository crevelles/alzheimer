package com.example.cristobal.alzheimer;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EligeActivity extends AppCompatActivity {

    TextView quienSoy;
    TextView quieroAyudar;
    TextView ejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elige);

        quienSoy = findViewById(R.id.idQuien);
        quieroAyudar = findViewById(R.id.idQuieroAyudar);
        ejercicios = findViewById(R.id.idEjercicios);

        //cargamos las fuentes
        Typeface fuenteAlzhei = Typeface.createFromAsset(getAssets(), "caviardreams.ttf");
        quienSoy.setTypeface(fuenteAlzhei);
        quienSoy.setClickable(true);
        quienSoy.setTextSize(30);

        quieroAyudar.setTypeface(fuenteAlzhei);
        quieroAyudar.setClickable(true);
        quieroAyudar.setTextSize(30);

        ejercicios.setTypeface(fuenteAlzhei);
        ejercicios.setTextSize(30);

    }

    public void ventanaDieta(View view){
        Intent intent = new Intent(this, dietaActivity.class);
        startActivity(intent);
    }

    public void ventanaEjercicios(View view){
        Intent intent = new Intent(this, EjerciciosActivity.class);
        startActivity(intent);
    }
}
