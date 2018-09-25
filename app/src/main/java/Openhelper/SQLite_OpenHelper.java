package Openhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite_OpenHelper extends SQLiteOpenHelper {
    public SQLite_OpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query ="Create table persona(_ID  integer primary key autoincrement,Nombre text, Apellidos text,Direccion text,Telefono text);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    //abrir la db
    public void abrir(){
        this.getWritableDatabase();
    }
    //Metodo para insertar registro bd
    public void insertarRegi(String nom,String apell,String direc,String tele){
        ContentValues valores = new ContentValues();
        valores.put("Nombre",nom);
        valores.put("Apellidos",apell);
        valores.put("Direccion",direc);
        valores.put("Telefono",tele);
        this.getWritableDatabase().insert("persona",null,valores);
    }

}


