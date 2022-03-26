package com.example.tarea_2_4.Clase;

import android.graphics.Bitmap;

public class Datos {

    private String id;
    private String nombre;
    private Bitmap firma;

    public Datos() {
    }

    public Datos(String id, String nombre, Bitmap firma) {
        this.id = id;
        this.nombre = nombre;
        this.firma = firma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bitmap getFirma() {
        return firma;
    }

    public void setFirma(Bitmap firma) {
        this.firma = firma;
    }
}
