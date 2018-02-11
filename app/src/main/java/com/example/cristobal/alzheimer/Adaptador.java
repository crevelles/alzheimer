package com.example.cristobal.alzheimer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cristobal on 10/02/2018.
 */

public class Adaptador  extends RecyclerView.Adapter<Adaptador.MiViewHolder> implements View.OnClickListener{

    private ArrayList<Dieta> datos;
    private View.OnClickListener listener;


    //¿Dónde se inicializa el arrayList?
    public Adaptador(dietaSemanalActivity dietaSemanalActivity, int item_dieta, ArrayList<Dieta> datos) {
        this.datos = datos;
    }


    public static class MiViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView textoSup;
        private TextView textoInf;


        public ImageView getImagen() {
            return imagen;
        }

        public TextView getTextoSup() {
            return textoSup;
        }

        public TextView getTextoInf() {
            return textoInf;
        }

        public MiViewHolder(View view) {
            super(view);
            imagen = (ImageView) view.findViewById(R.id.idImagenDieta);
            textoSup = (TextView) view.findViewById(R.id.idTituloDieta);
            textoInf = (TextView) view.findViewById(R.id.idTextoDieta);
        }
    }
    @Override
    public Adaptador.MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dieta, parent, false);
        v.setOnClickListener(this);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.imagen.setImageResource(datos.get(position).getImagenDieta());
        holder.textoSup.setText(datos.get(position). getTituloDieta());
        holder.textoInf.setText(datos.get(position). getTextoDieta());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
            listener.onClick(view);
    }
}
