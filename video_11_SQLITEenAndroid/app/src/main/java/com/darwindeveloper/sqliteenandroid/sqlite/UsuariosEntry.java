package com.darwindeveloper.sqliteenandroid.sqlite;

/**
 * Created by DARWIN MOROCHO on 30/7/2017.
 */

public class UsuariosEntry {

    public static final String TABLE_NAME = "usuarios";
    public static final String SQL_CREATE_TABLE = "create table " + TABLE_NAME + "( \"id\" INTEGER PRIMARY KEY AUTOINCREMENT, \"nombre\" TEXT NOT NULL, \"edad\" INTEGER NOT NULL )";


    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

}
