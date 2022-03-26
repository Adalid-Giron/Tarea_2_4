package com.example.tarea_2_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tarea_2_4.Clase.Datos;

import java.util.List;

public class ListaAdaptada extends ArrayAdapter {

    private List<Datos> mLista;
    private Context context;
    private int resourceLayout;

    public ListaAdaptada(@NonNull Context context, int resource, @NonNull List<Datos> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mLista = objects;
        this.resourceLayout = resource;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view==null){
            view = LayoutInflater.from(context).inflate(resourceLayout,null);
        }

        Datos modelo = mLista.get(position);

        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageBitmap(modelo.getFirma());

        TextView id = view.findViewById(R.id.txtId);
        id.setText(modelo.getId());

        TextView ruta = view.findViewById(R.id.txtDescriptionListado);
        ruta.setText(modelo.getNombre());

        //return super.getView(position, convertView, parent);
        return view;
    }
}
