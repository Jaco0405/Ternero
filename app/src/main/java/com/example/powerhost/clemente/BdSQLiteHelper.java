package com.example.powerhost.clemente;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by powerhost on 27/05/2016.
 */
public class BdSQLiteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME= "corrales.sqlite";
    private static final int DB_SHEME_VERSION= 1;

    Context ctx;
    public BdSQLiteHelper(Context contexto) {

        super(contexto, DB_NAME, null, DB_SHEME_VERSION);
        ctx=contexto;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creación de la tabla
        //,cMusculo TEXT NOT NULL ,cGrasa TEXT NOT NULL " +",raza TEXT NOT NULL,corral INTEGER
        db.execSQL("CREATE TABLE crias (id PRIMARY KEY AUTOINCREMENT,ide TEXT,edad TEXT ,peso TEXT)");
        db.execSQL("CREATE TABLE corrales (id INTEGER PRIMARY KEY AUTOINCREMENT,nombre TEXT NOT NULL,capacidad INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS crias");
        db.execSQL("DROP TABLE IF EXISTS corrales");
        //Se crea la nueva versión de la tabla
        onCreate(db);
    }
    //variables generales
    BdSQLiteHelper ayuda;
    SQLiteDatabase db;
    //Metodos para manejar la base de datos
    public void abrir(){
        ayuda=new BdSQLiteHelper(ctx);
        db=ayuda.getWritableDatabase();
    }
    public void cerrar(){
        db.close();
    }

    //Metodos para manipular datos
    public long registrarCria(String ide, String edad, String peso) throws Exception{
        ContentValues valores=new ContentValues();
        valores.put("ide",ide);
        valores.put("edad",edad);
        valores.put("peso",peso);
       // valores.put("cMusculo",cMusculo);
        //valores.put("cGrasa",cGrasa);
        //valores.put("raza",raza);
        //valores.put("corral",corral);
        return db.insert("crias",null,valores);

    }

    public long registrarCorrales(String nombre, Integer capacidad) throws Exception{
        ContentValues valores=new ContentValues();
        valores.put("nombre",nombre);
        valores.put("capacidad",capacidad);
        return db.insert("corrales",null,valores);

    }
}
