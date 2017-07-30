package com.darwindeveloper.sqliteenandroid;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.darwindeveloper.sqliteenandroid.sqlite.DBHelper;
import com.darwindeveloper.sqliteenandroid.sqlite.DBManager;

public class MainActivity extends AppCompatActivity {

    private DBManager dbManager;


    private TextView textViewUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUsuarios = (TextView) findViewById(R.id.textViewUsuarios);

        dbManager = new DBManager(new DBHelper(MainActivity.this).getWritableDatabase());

    }

    public void leer(View v) {
        Cursor cursor = dbManager.leerUsuarios("select * from usuarios");
        textViewUsuarios.setText("");
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            do {
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                int edad = cursor.getInt(cursor.getColumnIndex("edad"));

                textViewUsuarios.append(nombre + " " + edad + "\n");

            } while (cursor.moveToNext());
        }

    }


    public void guardar(View v) {
        EditText editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        EditText editTextEdad = (EditText) findViewById(R.id.editTextEdad);

        long id = dbManager.insertarUsuario(editTextNombre.getText().toString(), Integer.parseInt(editTextEdad.getText().toString()));

        if (id != -1) {
            Toast.makeText(this, "Usuario guardado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

    }


}
