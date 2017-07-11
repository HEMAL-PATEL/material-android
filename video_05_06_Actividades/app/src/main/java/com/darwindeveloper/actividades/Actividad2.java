package com.darwindeveloper.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    public static final String NOMBRE = "Actividades.Actividad2.NOMBRE";
    public static final String N1 = "Actividades.Actividad2.N1";
    public static final String N2 = "Actividades.Actividad2.N2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        String nombre_recibido = getIntent().getStringExtra(NOMBRE);

        String suma = (getIntent().getFloatExtra(N1, 0f) + getIntent().getFloatExtra(N2, 0f)) + "";

        Toast.makeText(this, suma, Toast.LENGTH_SHORT).show();


    }


    public void fin(View v) {
        finish();
    }

}
