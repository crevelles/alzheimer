package com.example.cristobal.alzheimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EjerciciosActivity extends AppCompatActivity {

    Button btnGimnasia;
    Button btnCognitiva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);
        btnCognitiva = findViewById(R.id.idBTNcognitiva);
        btnGimnasia = findViewById(R.id.idBTNgimnasia);

    }

    public void ventanaCognitiva(View view){
        Intent intent = new Intent(this, SplashCognitivaActivity.class);
        startActivity(intent);
    }

    public void ventanaGimnasia(View view){
        Intent intent = new Intent(this, GimnasiaActivity.class);
        startActivity(intent);
    }
}
