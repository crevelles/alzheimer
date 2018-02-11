package com.example.cristobal.alzheimer;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class dietaActivity extends AppCompatActivity {

    ImageView fondo;
    int numAzar;
    TextView texto;

    TextView tituloDieta;
    TextView textoDieta;

    ArrayList<String> textos;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta);
        fondo = findViewById(R.id.idFondoDieta);
        texto = findViewById(R.id.idTextoDieta);

        Typeface fuenteAlzhei = Typeface.createFromAsset(getAssets(), "caviardreams.ttf");
        texto.setTypeface(fuenteAlzhei);
        texto.setTextSize(24);



        textos = new ArrayList<String>();

        int numero = ThreadLocalRandom.current().nextInt(0, 8 + 1);
        textos.add(getResources().getString(R.string.dieta1));
        textos.add(getResources().getString(R.string.dieta2));
        textos.add(getResources().getString(R.string.dieta3));
        textos.add(getResources().getString(R.string.dieta4));
        textos.add(getResources().getString(R.string.dieta5));
        textos.add(getResources().getString(R.string.dieta6));
        textos.add(getResources().getString(R.string.dieta7));
        textos.add(getResources().getString(R.string.dieta8));
        textos.add(getResources().getString(R.string.dieta9));

        texto.setText(textos.get(numero));



    }

    public void dietaSemanal(View view) {
        Intent intent = new Intent(this, dietaSemanalActivity.class);
        startActivity(intent);
    }
}
