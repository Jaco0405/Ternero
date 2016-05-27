package com.example.powerhost.clemente;

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
            +CN_ID+ " INTEGER primary key autoincrement,"
            +CN_EDAD+ " INTEGER,"
            +CN_PESO+ " INTEGER,"
            +CN_CMUSCULO+ " TEXT ,"
            +CN_CGRASA+ " TEXT ,"
            +CN_RAZA+ " TEXT ,"
            +CN_CORRAL+ " INTEGER);";


}
