package com.example.powerhost.clemente;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by powerhost on 27/05/2016.
 */
public class DataBaseManagerCorrales {
    public static final String TABLE_NAME="corrales";
    public static final String CN_IDCORRALES="_id";
    public static final String CN_NAME="nombre";
    public static final String CN_CAPACIDAD="capacidad";



    public static final String CREATE_TABLE =" create table "+TABLE_NAME+" ("
            +CN_IDCORRALES+ " INTEGER primary key autoincrement,"
            +CN_NAME+ " TEXT,"
            +CN_CAPACIDAD+ " INTEGER);";

    private BdSQLiteHelper helper;
    private SQLiteDatabase db;

    public DataBaseManagerCorrales(Context context) {

        helper = new BdSQLiteHelper(context);
        db=helper.getWritableDatabase();

    }

    public ContentValues generarContentValues(String nombre, Integer capacidad ){
        ContentValues valores=new ContentValues();
        valores.put(CN_NAME,nombre);
        valores.put(CN_CAPACIDAD,capacidad);

        return valores;
    }

    public void insertar(String nombre, Integer capacidad ){
        db.insert(TABLE_NAME,null,generarContentValues(nombre,capacidad));
    }

    public void insertar2(String nombre, Integer capacidad ){
        db.execSQL("insert into "+TABLE_NAME+" values('"+nombre+"',"+capacidad+")");
    }
 }
