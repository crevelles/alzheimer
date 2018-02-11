package com.example.cristobal.alzheimer;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashCognitivaActivity extends AppCompatActivity {

    TextView textoIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_cognitiva);
        textoIntro = findViewById(R.id.idTextoSplashCognitiva);


        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashCognitivaActivity.this, CognitivaActivity.class);
                startActivity(intent);
                finish();
            }
        }, 14000);
    }
}
