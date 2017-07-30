package com.darwindeveloper.sqliteenandroid.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by DARWIN MOROCHO on 30/7/2017.
 */

public class DBManager {


    private SQLiteDatabase db;

    public DBManager(SQLiteDatabase db) {
        this.db = db;
    }


    public Cursor leerUsuarios(String sql) {
        return db.rawQuery(sql, null);
    }


    public long insertarUsuario(String nombre, int edad) {


        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("edad", edad);

        return db.insert(UsuariosEntry.TABLE_NAME, null, values);
    }


    public int eliminarUsuario(long id) {

        String ars[] = {id + ""};
        return db.delete(UsuariosEntry.TABLE_NAME, "id = ? ", ars);
    }


    public int actualizarUsuario(long id, String nombre, int edad) {
        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("edad", edad);
        String ars[] = {id + ""};

        return db.update(UsuariosEntry.TABLE_NAME, values, "id = ? ", ars);
    }


}
