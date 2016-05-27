package com.example.powerhost.clemente;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by powerhost on 27/05/2016.
 */
public class BdSQLiteHelper extends SQLiteOpenHelper {
    private static final String DB_NAME= "corrales.sqlite";
    private static final int DB_SHEME_VERSION= 1;


    public BdSQLiteHelper(Context contexto) {
        super(contexto, DB_NAME, null, DB_SHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL(DataBaseManager.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        //NOTA: Por simplicidad del ejemplo aquí utilizamos directamente la opción de
        //      eliminar la tabla anterior y crearla de nuevo vacía con el nuevo formato.
        //      Sin embargo lo normal será que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este método debería ser más elaborado.

        //Se elimina la versión anterior de la tabla

        //Se crea la nueva versión de la tabla
    }
}
