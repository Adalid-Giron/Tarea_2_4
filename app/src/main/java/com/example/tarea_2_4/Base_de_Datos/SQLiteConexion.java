package com.example.tarea_2_4.Base_de_Datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tarea_2_4.transacciones.Transacciones;


public class SQLiteConexion extends SQLiteOpenHelper{

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){
        super(context,dbname,factory,version);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Transacciones.CreateTablePersonas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Transacciones.DropTablePersonas);
        onCreate(db);
    }


}
