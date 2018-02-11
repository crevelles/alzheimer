package com.example.cristobal.alzheimer;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {


    TextView alzhei;
    TextView mer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        alzhei = findViewById(R.id.idAlzhei);
        mer = findViewById(R.id.idMer);

        //Cargamos las fuentes
        Typeface fuenteAlzhei = Typeface.createFromAsset(getAssets(), "caviardreams.ttf");
        alzhei.setTypeface(fuenteAlzhei);
        //mer.setTypeface(fuenteAlzhei);

        //Cargamos la animación de MER
        Animation animMER = AnimationUtils.loadAnimation(this, R.anim.anim_mer);
        mer.startAnimation(animMER);

        //Cargamos la animación de ALZHEI
        Animation animALZHEI = AnimationUtils.loadAnimation(this, R.anim.anim_alzhei);
        alzhei.startAnimation(animALZHEI);

        openApp(true);

    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, EligeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }


}
