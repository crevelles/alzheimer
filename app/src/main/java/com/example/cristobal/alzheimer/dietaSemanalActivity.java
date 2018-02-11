package com.example.cristobal.alzheimer;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class dietaSemanalActivity extends AppCompatActivity {

    private RecyclerView rv;
    private LinearLayoutManager miLinearLayout;
    private ArrayList lista = new ArrayList<Dieta>();
    TextView tituloDieta;
    TextView textoDieta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta_semanal);

        tituloDieta = findViewById(R.id.idTituloDieta);
        textoDieta = findViewById(R.id.idTextoDieta);



        rv = findViewById(R.id.idRecycler);
        rv.setHasFixedSize(true);
        miLinearLayout = new LinearLayoutManager(this);
        rv.setLayoutManager(miLinearLayout);

        lista = new ArrayList<Dieta>();

        Adaptador adap = new Adaptador(this,R.layout.item_dieta, lista);
        rv.setAdapter(adap);



        cargarDatos();


    }

    private void cargarDatos() {
        Dieta d1 = new Dieta(getString(R.string.TituloDietaComida1), getString(R.string.textoMenu1), R.drawable.timothy_lamm_196281);
        Dieta d2 = new Dieta(getString(R.string.TituloDietaComida2), getString(R.string.textoMenu2), R.drawable.sweet_ice_cream_photography_501897);
        Dieta d3 = new Dieta(getString(R.string.TituloDietaComida3),getString(R.string.textoMenu3),R.drawable.vitchakorn_koonyosying_494183);
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);



    }
}
