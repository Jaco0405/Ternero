package com.example.powerhost.clemente;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by powerhost on 27/05/2016.
 */
public class DataBaseManager {
    public static final String TABLE_NAME="crias";
    public static final String CN_ID="_id";
    public static final String CN_EDAD="edad";
    public static final String CN_PESO="peso";
    public static final String CN_CMUSCULO="cMusculo";
    public static final String CN_CGRASA="cGrasa";
    public static final String CN_RAZA="raza";
    public static final String CN_CORRAL="corral";


    public static final String CREATE_TABLE =" create table "+TABLE_NAME+" ("
            +CN_ID+ " INTEGER primary key,"
            +CN_EDAD+ " INTEGER,"
            +CN_PESO+ " INTEGER,"
            +CN_CMUSCULO+ " TEXT ,"
            +CN_CGRASA+ " TEXT ,"
            +CN_RAZA+ " TEXT ,"
            +CN_CORRAL+ " INTEGER);";

    private BdSQLiteHelper helper;
    private SQLiteDatabase db;
    public DataBaseManager(Context context) {

        helper = new BdSQLiteHelper(context);
        db=helper.getWritableDatabase();

    }

    public ContentValues generarContentValues(Integer id,Integer edad, Integer peso, String cMusculo, String cGrasa, String raza, Integer corral ){
        ContentValues valores=new ContentValues();
        valores.put(CN_ID,id);
        valores.put(CN_EDAD,edad);
        valores.put(CN_PESO,peso);
        valores.put(CN_CMUSCULO,cMusculo);
        valores.put(CN_CGRASA,cGrasa);
        valores.put(CN_RAZA,raza);
        valores.put(CN_CORRAL,corral);

        return valores;
    }

    public void insertar(Integer id,Integer edad, Integer peso, String cMusculo, String cGrasa, String raza, Integer corral ){
        db.insert(TABLE_NAME,null,generarContentValues(id,edad,peso,cMusculo,cGrasa,raza,corral));
    }

    public void insertar2(Integer id,Integer edad, Integer peso, String cMusculo, String cGrasa, String raza, Integer corral ){
        db.execSQL("insert into "+TABLE_NAME+" values("+id+","+edad+","+peso+",'"+cMusculo+"','"+cGrasa+"','"+raza+"',"+corral+")");
    }
    public void eliminar(String id){
        db.delete(TABLE_NAME,CN_ID+ "=?", new String[]{id});
    }
 }
