package com.darwindeveloper.sqliteenandroid.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DARWIN MOROCHO on 30/7/2017.
 */

public class DBHelper extends SQLiteOpenHelper {


    private static int version = 1;

    public DBHelper(Context context) {
        super(context, UsuariosEntry.TABLE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UsuariosEntry.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(UsuariosEntry.SQL_DELETE_TABLE);//eliminamos la tabla usuarios
        onCreate(db);

    }


    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
