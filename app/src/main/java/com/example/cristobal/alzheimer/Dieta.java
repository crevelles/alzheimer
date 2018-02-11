package com.example.cristobal.alzheimer;

import android.content.Context;

/**
 * Created by cristobal on 10/02/2018.
 */

public class Dieta {

    String tituloDieta;
    String textoDieta;
    int imagenDieta;

    public Dieta(String tituloDieta, String textoDieta, int imagenDieta) {
        this.tituloDieta = tituloDieta;
        this.textoDieta = textoDieta;
        this.imagenDieta = imagenDieta;
    }

    public String getTituloDieta() {
        return tituloDieta;
    }

    public void setTituloDieta(String tituloDieta) {
        this.tituloDieta = tituloDieta;
    }

    public String getTextoDieta() {
        return textoDieta;
    }

    public void setTextoDieta(String textoDieta) {
        this.textoDieta = textoDieta;
    }

    public int getImagenDieta() {
        return imagenDieta;
    }

    public void setImagenDieta(int imagenDieta) {
        this.imagenDieta = imagenDieta;
    }
}
